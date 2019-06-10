
class Base(object):


    login_url='http://localhost:8032/Mymovie/admin.php'
    def __init__(self,driver,base_url=login_url):
        self.driver = driver
        self.base_url = base_url
        self.timeout = 3

    def open(self):
        self.driver.get(self.base_url)

    # *loc参数个数不是固定 *loc = (By.ID,"kw")
    def find_element(self,*loc):
        return self.driver.find_element(*loc)

    def iframe(self,iframeid):
        return self.driver.switch_to.frame(iframeid)

    def iframe_out(self):
        return self.driver.switch_to.default_content()

    def script(self,src):
        return self.driver.execute_script(src)

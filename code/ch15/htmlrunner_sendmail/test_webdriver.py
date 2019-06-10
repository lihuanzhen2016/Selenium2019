from selenium import webdriver
import  time
import unittest
class MymovieDemo(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.maximize_window()
        self.driver.implicitly_wait(5)
        self.base_url="http://localhost:8032/mymovie/admin.php"

    def test_login(self):
        '''测试登陆
        '''
        driver = self.driver
        driver.get(self.base_url)
        driver.find_element_by_name("username").send_keys("admin")
        driver.find_element_by_name("password").send_keys("admin")
        driver.find_element_by_class_name("sub").click()
        time.sleep(3)
        self.assertIn("退出",driver.page_source)

    def tearDown(self):
        self.driver.quit()
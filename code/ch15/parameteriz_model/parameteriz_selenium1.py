from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import  ActionChains
from selenium.webdriver.common.by import By
import  unittest
import xlrd

class Test(unittest.TestCase):

    def readfile(self,index):
        f = open('D:\\demo\\loginuser.txt', 'r')
        content = f.readlines()
        f.close()
        return content[index]

    def txtlenth(self):
        f = open('D:\\demo\\loginuser.txt', 'r')
        content = f.readlines()
        f.close()
        return len(content)



    def test_login(self):

        driver = webdriver.Firefox()
        driver.maximize_window()

        for i in range(self.txtlenth()):
            driver.get("http://localhost:8032/mymovie/")
            driver.find_element_by_link_text("登录").click()
            sleep(3)
            driver.find_element_by_name("username").send_keys(self.readfile(i).split(',')[0])
            driver.find_element_by_name("password").send_keys(self.readfile(i).split(',')[1])
            driver.find_element_by_xpath("//input[@value='马上登录']").click()
            sleep(3)
            driver.find_element_by_link_text("退出").click()


if __name__ == '__main__':
    unittest.main()

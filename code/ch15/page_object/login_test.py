from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from time import sleep
from page_object.base import Base
import unittest
from selenium import  webdriver
from .login_page import  LoginPage

class loginTest(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()


    def test_login_user_pawd_sucess(self):
        # 实例化页面类对象
        po = LoginPage(self.driver)
        po.open()
        po.login_action("admin","admin")
        sleep(2)
        self.assertIn("退出")

    def test_login_user_pawd_fail(self):
        po = LoginPage(self.driver)
        po.open()
        po.login_action("admin", "123456")
        self.assertIn("用户名错误")
        sleep(2)





if __name__ == '__main__':
    #unittest.main()
    suit = unittest.TestSuite()
    suit.addTest(loginTest("test_login_user_pawd_sucess"))
    runner = unittest.TextTestRunner()
    runner.run(suit)
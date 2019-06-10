from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from time import sleep
from .base import Base


# 页面对象（PO) 登录页面
class LoginPage(Base):

    url = '/'

    # 定位页面对象
    login_username_text_loc = (By.NAME,"username")
    login_password_text_loc = (By.NAME,"password")
    login_button_loc = (By.CLASS_NAME, "sub")


    # 查找页面对象
    def login_username(self,text):
        self.find_element(*self.login_username_text_loc).send_keys(text)

    def login_password(self,text):
        self.find_element(*self.login_password_text_loc).send_keys(text)

    def login_button(self):
        self.find_element(*self.login_button_loc).click()



    # 页面操作
    def login_action(self,username,password):
        self.login_username(username)
        self.login_password(password)
        self.login_button()


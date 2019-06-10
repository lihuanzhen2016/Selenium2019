from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import  ActionChains
from selenium.webdriver.common.by import By
import  unittest
import xlrd


class Test(unittest.TestCase):


    def readexcel(self,rowvalue,colvalue):
        workbook = xlrd.open_workbook('D:\\demo\\loginuser.xlsx', 'r')
        table = workbook.sheet_by_index(0)
        return table.cell_value(rowvalue,colvalue)

    def excell_lenth(self):
        workbook = xlrd.open_workbook('D:\\demo\\loginuser.xlsx', 'r')
        table = workbook.sheet_by_index(0)
        return table.nrows

    def test_login(self):

        driver = webdriver.Firefox()
        driver.maximize_window()

        for i in range(self.excell_lenth()):
            driver.get("http://localhost:8032/mymovie/")
            driver.find_element_by_link_text("登录").click()
            sleep(3)
            driver.find_element_by_name("username").send_keys(self.readexcel(i,0))
            driver.find_element_by_name("password").send_keys(self.readexcel(i,1))
            driver.find_element_by_xpath("//input[@value='马上登录']").click()
            sleep(3)
            driver.find_element_by_link_text("退出").click()


if __name__ == '__main__':
    unittest.main()


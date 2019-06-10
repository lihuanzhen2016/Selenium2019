from selenium import webdriver
import os,time
source =open('D:\\demo\\loginuser.txt', 'r')
values = source.readlines()
source.close()

driver = webdriver.Firefox()
driver.maximize_window()
for serch in values:
    # 补充如果有退出，需要先点击退出
    driver.get("http://localhost:8032/mymovie/")
    driver.find_element_by_link_text("登录").click()
    time.sleep(3)
    driver.find_element_by_name("username").send_keys(serch.split(',')[0])
    driver.find_element_by_name("password").send_keys(serch.split(',')[1])
    driver.find_element_by_xpath("//input[@value='马上登录']").click()
    time.sleep(3)
    # driver.find_element_by_link_text("退出").click()

import unittest
from HTMLTestRunner import HTMLTestRunner
import time
import smtplib,os
from email.mime.text import MIMEText
from email.header import Header
from email.mime.multipart import  MIMEMultipart


# 发送测试报告，需要配置你的邮箱账号。
def send_mail(file_new):
    smtpserver = 'smtp.126.com'
    username = 'test2014123@126.com'
    password = '123456abcd'
    sender = 'test2014123@126.com'

    receiver = ['626231936@qq.com']

    subject = '测试报告'
    sendfile = open(file_new, 'rb').read()

    att = MIMEText(sendfile, 'base64', 'utf-8')
    att["Content-Type"] = 'application/octet-stream'
    att["Content-Disposition"] = 'attachment; filename="result.html"'
    msg = MIMEMultipart('related')

    msg['Subject'] = Header(subject, 'utf-8')
    msg.attach(att)
    msg.attach(MIMEText('<html><h1>请查收测试报告！</h1></html>', 'html', 'utf-8'))
    msg['from'] = 'test2014123@126.com'
    msg['to'] = '626231936@qq.com'

    smtp = smtplib.SMTP()
    smtp.connect(smtpserver)
    smtp.login(username, password)
    smtp.sendmail(sender, receiver, msg.as_string())
    smtp.quit()

# 查找最新生成的测试报告
def new_report(files):
    lists = os.listdir(files)
    lists.sort(key=lambda fn: os.path.getmtime(files+"\\"+fn))
    file_new = os.path.join(files,lists[-1])
    print(file_new)
    return file_new




if __name__ == '__main__':
    # 指定需要执行测试用例
    test_dir1 = './htmlrunner_sendmail'
    test_dir='D:\\pythonCode\\Demo181015\\htmlrunner_sendmail'
    test_report='D:\\pythonCode\\Demo181015\\report'
    discover = unittest.defaultTestLoader.discover(test_dir, pattern='test_*.py')
    # 使用HTMLTestRunner来生成testrRunner,生成html测试报告
    now_time =  time.strftime("%Y%m%d%H%M%S")
    file_name=test_report+'\\'+now_time+'result.html'
    fp = open(file_name,'wb')
    runner = HTMLTestRunner(stream=fp,title="Mymovie测试报告",description="运行环境： firefox")
    runner.run(discover)
    fp.close()
    # 查找修改日期最新的测试报告
    new_report=new_report(test_report)
    # 发送邮件
    send_mail(new_report)

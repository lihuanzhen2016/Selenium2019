import smtplib
from email.mime.text import MIMEText
from email.header import Header
from email.mime.multipart import  MIMEMultipart

# 设置smtplib所需的参数
#下面的发件人，收件人是用于邮件传输的。
smtpserver = 'smtp.126.com'
username = 'test2014123@126.com'
password='123456abcd'
sender='test2014123@126.com'

#收件人为多个收件人
receiver=['626231936@qq.com']

subject = '测试报告'
sendfile=open('D:\\pythonCode\\Demo181015\\20181018144214result.html','rb').read()
att = MIMEText(sendfile, 'base64', 'utf-8')
att["Content-Type"] = 'application/octet-stream'
# 这里的filename可以任意写，写什么名字，邮件中显示什么名字
att["Content-Disposition"] = 'attachment; filename="测试结果.html"'
msg=MIMEMultipart('related')

msg['Subject']=Header(subject,'utf-8')
msg.attach(att)
msg.attach(MIMEText('<html><h1>请查收测试报告！</h1></html>','html','utf-8'))
msg['from'] = 'test2014123@126.com'
msg['to'] = '626231936@qq.com'

smtp =smtplib.SMTP()
smtp.connect(smtpserver)
smtp.login(username,password)
smtp.sendmail(sender,receiver,msg.as_string())
smtp.quit()
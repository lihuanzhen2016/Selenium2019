import smtplib
from email.mime.text import MIMEText
from email.header import Header
from email.mime.multipart import  MIMEMultipart

# 设置smtplib所需的参数
#下面的发件人，收件人是用于邮件传输的。
smtpserver = 'smtp.126.com'
username = 'test2014123@126.com'
#授权码
password='123456abcd'
sender='test2014123@126.com'
#收件人为多个收件人
receiver='626231936@qq.com'
#主题
subject = 'test1213'

#邮件内容
msg=MIMEText('你好!','html','utf-8')
msg['Subject']=Header(subject,'utf-8')
msg['from'] =sender
msg['to'] = receiver
smtp =smtplib.SMTP()
smtp.connect(smtpserver)
smtp.login(username,password)
smtp.sendmail(sender,receiver,msg.as_string())
smtp.quit()
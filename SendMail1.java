package ch14.javamail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;


public class SendMail1 {
	
	String from="test2014123@126.com";
	String auth_code="123456abcd";//授权码，不是密码
	String to="626231936@qq.com";
	@Test
	public void sendMail() {
//		1、创建Properties对象
		Properties prop=new Properties();
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.host", "smtp.126.com");
		prop.put("mail.smtp.auth", true);
//		2、Session对象，设置发件箱、授权码
		Session session=Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from,auth_code );
			}
			
		});
//		3、Message对象设置，发件人，收件人，主题，正文
		
		Message message=new MimeMessage(session);
		//或者子类的引用指向子类的对象
//		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
//			提示：可以把收件人地址配置在properties文件中
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello，测试");
			message.setText("第一封邮件");
//			4、使用Transport发送
			Transport.send(message);
		
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	
		
		
	}

}

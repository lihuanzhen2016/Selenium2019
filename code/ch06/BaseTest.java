package ch06;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public BaseTest() {
		System.out.println("BaseTest-构造方法");
	}
	
	//初始化操作，打开浏览器，连接数据库
		@BeforeClass
		public void bc() {
			
			System.out.println("*********@BeforeClass********");
		}
		
		//清理工作，关闭浏览器，断开数据库连接
		@AfterClass
		public void ac() {
			System.out.println("*********@AfterClass********");
		}

}

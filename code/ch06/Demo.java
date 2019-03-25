package ch06;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo extends BaseTest {
	public Demo() {
		System.out.println("Demo的构造方法");
	}
	

	
	//在每一个测试方法之前，例如：登录
	@BeforeMethod
	public void bm() {
		System.out.println("*********@BeforeMethod*******");
	}
	@AfterMethod
	public void am() {
		System.out.println("*******@AfterMethod*******");
	}
	
//	@Test(priority=0)
//	public void loginSuccess() {
//		System.out.println("loginSuccess");
//	}
//	
//	@Test(priority=1)
//	public void loginFail() {
//		System.out.println("loginFail");
//	}
	
	@Test
	public void loginSuccess() {
		System.out.println("Demo-loginSuccess");
	}
	
	@Test(dependsOnMethods= {"loginSuccess"})
	public void loginFail() {
		System.out.println("Demo-loginFail");
	}
	
	
	

	public void test1() {
		System.out.println("test1");
	}
}

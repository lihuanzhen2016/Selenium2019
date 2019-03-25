package ch06;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeSuite
	public void bs() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest");
	}
	
	@Test
	public void test1() {
		System.out.println("Demo2-test1");
	}
	//实现成功登录的
	@Test(description="实现成功登录的")
	public void test2() {
		System.out.println("Demo2-test2");
		for(int i=0;i<100;i++) {
			System.out.println("test2:"+Thread.currentThread().getId());
		}
		}
	@Test
	public void test3() {
		System.out.println("Demo2-test3");
		for(int i=0;i<100;i++) {
			System.out.println("test3:"+Thread.currentThread().getId());
		}
		}

}

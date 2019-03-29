package ch07;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Demo3 {
	@Test
	public void test2(ITestContext content) {
//		System.out.println(content.getAttribute("name"));
		System.out.println("hello");
		assertEquals(1, 2);
		
	}
	
	@AfterMethod
	public void am(ITestResult result) {
		
		System.out.println(result.getStatus());
		System.out.println(result.getName());
		System.out.println(result.getInstanceName());
	}
}

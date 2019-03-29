package ch07;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter{
	

	@Override
	public void onTestSuccess(ITestResult tr) {
	
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.print(tr.getInstanceName()+"."+tr.getName());
		System.out.println("执行失败了");
		System.out.println("webdriver的开始截屏");
//		方法名-日期.jpg 
	}
	
}

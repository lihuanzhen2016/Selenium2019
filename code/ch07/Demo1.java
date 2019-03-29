package ch07;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;



public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		TestNG testNG1 = new TestNG();
		List<String> suites1 = new ArrayList<String>();
		Thread.sleep(5000);
		suites1.add(".\\test-output\\testng-failed.xml");
		testNG1.setTestSuites(suites1);
		testNG1.run();
	}
}

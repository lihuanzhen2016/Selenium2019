package ch07;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void test1(ITestContext content) {
		content.setAttribute("name", "tom");
	}


}

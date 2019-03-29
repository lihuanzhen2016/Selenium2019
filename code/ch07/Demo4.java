package ch07;

import static org.testng.Assert.assertEquals;

import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class Demo4 {

	@Test
	public void test2() {
	
		assertEquals(1, 2);
		
	}
}

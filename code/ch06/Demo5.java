package ch06;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test
	public void test1() {
		assertEquals(1,2);
		assertTrue(true);
		
		System.out.println("不再执行");
	}
	
	@Test
	public void test2() {
		assertEquals(1,1);
		System.out.println("继续执行");
	}
	
	

}

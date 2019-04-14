package ch09.dataproviderdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "aaaa"},
	   { "Anne", "bbbb"},
	 };
	}

@Test(dataProvider = "test1")
public void test(String a,String b) {
   System.out.println(a+" "+b);
  }
	
}

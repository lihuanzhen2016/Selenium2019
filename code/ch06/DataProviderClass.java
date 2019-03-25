package ch06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	

	@DataProvider(name = "test2")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "123456"},
	   { "Anne", "54321"},
	 };
	}
	 
	
}

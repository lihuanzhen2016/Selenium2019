package ch06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	//tom 123456;jerry 54321
	
	
	 
	@Test(dataProvider="test2",dataProviderClass=DataProviderClass.class)
	public void login(String u_name,String password) {
		System.out.println(u_name+"---"+password);
	}

}

package ch09.dataproviderdemo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage3Test extends BaseTest{

	@DataProvider(name = "user_para")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "qingdao01", "123456"},
	   { "qingdao02", "123456"},
	 };
	}
	LoginPage3 lp =null;
	@BeforeClass
	public void initLoginPage3() {
		 lp =new LoginPage3(wd);
	}

	@Test(dataProvider="user_para")
	public void testLoginSuccess(String u_name,String u_pwd) throws InterruptedException {
		System.out.println("testLoginSuccess");
		lp.load();
//		lp.isLoaded();
		lp.login(u_name, u_pwd);
		assertTrue(lp.getDriver().getPageSource().contains("ÍË³ö"));
	}
	
	

}

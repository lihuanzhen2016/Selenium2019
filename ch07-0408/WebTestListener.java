package ch07;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



/**
 * author:lihuanzhen ¼àÌýÆ÷£¬ÓÃÀýÊ§°Ü£¬½ØÆÁ
 */

public class WebTestListener extends TestListenerAdapter {
	@Override
	public void onTestFailure(ITestResult tr) {
		BaseTest tb = (BaseTest) tr.getInstance();
		WebDriver driver = tb.getDriver();
		SeleniumScreenShot ss = new SeleniumScreenShot(driver);
		try {
			ss.screenShot(tr.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

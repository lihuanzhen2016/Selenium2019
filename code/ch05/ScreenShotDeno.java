package ch05;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenShotDeno {
	WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8032/Mymovie/");
//		driver.get("	file:///D:/upupw32/htdocs/test/AddRecord.html");
//


//		WebDriverWait wait =new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("µÇ11Â¼")));
//		System.out.println("¼ÌÐøÖ´ÐÐ");
//		
//		WebDriverWait wait1 =new WebDriverWait(driver, 3);
//		wait1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("µÇ11Â¼")));
//		

	}

	public void screenShot() throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDateTime = sdf.format(new Date());

		File s_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s_file, new File("D:\\demo\\" + nowDateTime + ".jpg"));
	
	}


}

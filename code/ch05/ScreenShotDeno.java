package ch05;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
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
		// 把浏览器截屏保存到file对象中
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// file对象转变为一个image
		Files.copy(source, new File("D:\\demo\\12.jpg"));

//		WebDriverWait wait =new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("登11录")));
//		System.out.println("继续执行");
//		
//		WebDriverWait wait1 =new WebDriverWait(driver, 3);
//		wait1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("登11录")));
//		

	}

	public void screenShot() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDateTime = sdf.format(new Date());

		File s_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(s_file, new File("D:\\demo\\" + nowDateTime + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sreenshot(String f_name) {
		// 把浏览器截屏保存到file对象中
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// file对象转变为一个image
		Files.copy(source, new File("D:\\demo\\12.jpg"));
	}

}

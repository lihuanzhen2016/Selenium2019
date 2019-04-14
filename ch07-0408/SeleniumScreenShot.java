package ch07;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;


public class SeleniumScreenShot {
	public WebDriver driver;

	public SeleniumScreenShot(WebDriver driver) {
		this.driver = driver;
	}

	public void screenShot(String name) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDateTime = sdf.format(new Date());
		File s_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s_file, new File("D:\\demo\\" + name + "-" + nowDateTime+ ".jpg"));
	
	}
}
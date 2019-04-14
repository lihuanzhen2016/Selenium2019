package ch09.dataproviderdemo;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

public class BaseTest {

	public WebDriver wd = null;
	public JavascriptExecutor jse = null;
	public Actions action = null;

	@BeforeClass
	public void setUpBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		wd = new FirefoxDriver();
		jse = (JavascriptExecutor) wd;
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action = new Actions(wd);

	}

//	@AfterClass
	public void quitBrower() {
		if (wd != null) {
			wd.quit();
		}
	}

	public void jsClick(WebElement element) {
		jse.executeScript("arguments[0].click();", element);

	}

	public void HighLignt(WebElement element) {
		setAttribute(element, "style", "background:yellow;border:2 px solid red");
	}

	public void setAttribute(WebElement element, String attibute, String value) {
		jse.executeScript("arguments[0].setAttribute(arguments[1],arguments[2]);", element, attibute, value);

	}


	public void loginSuccess() throws InterruptedException {
		wd.get("http://localhost:8032/Mymovie/admin.php");
		boolean flag = wd.getPageSource().contains("ÍË³ö");
		if (flag) {
			wd.findElement(By.linkText("ÍË³ö")).click();
		}
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

	}
	
	public WebDriver  getDriver() {
		return this.wd;
	}
}

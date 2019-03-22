package ch0502;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://videojs.com/");
		WebElement video=driver.findElement(By.tagName("video"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String src=(String)js.executeScript("return arguments[0].currentSrc", video);
		System.out.println(src);
		
		Double time=(Double)js.executeScript("return arguments[0].duration", video);
		System.out.println(time);
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].play()", video);
		Thread.sleep(3000);
		driver.quit();
		
	}

}

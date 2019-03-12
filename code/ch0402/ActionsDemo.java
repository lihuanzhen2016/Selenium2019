package ch0402;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://news.baidu.com/");
		Thread.sleep(5000);
		Actions action =new Actions(driver);
	
		for(int i=0;i<100;i++) {
			action.sendKeys(Keys.DOWN).perform();
//			action.sendKeys(Keys.DOWN).build().perform();
		}
	
	
		driver.findElement(By.partialLinkText("岚山区：开展志愿服务")).click();

	}

}

package ch0402;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author lihuanzhen
 *
 */
public class ActionsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		Thread.sleep(5000);
		Actions action =new Actions(driver);
//		action.moveByOffset(100, 300).click();
		action.moveToElement(driver.findElement(By.linkText("…Ë÷√"))).perform();
		action.moveToElement(driver.findElement(By.linkText("À—À˜…Ë÷√"))).perform();
		driver.findElement(By.linkText("À—À˜…Ë÷√")).click();
	
		}

}

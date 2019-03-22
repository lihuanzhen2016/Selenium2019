package ch0502;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CanvasDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://literallycanvas.com/");
		WebElement canvas=driver.findElement(By.xpath("//*[@id='literally-canvas']/div[1]/div[1]/canvas[2]"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(canvas).moveByOffset(10, 20).moveByOffset(20, 30).release().perform();
		Thread.sleep(5000);
//		driver.quit();

	}

}

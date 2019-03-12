package ch0402;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/upupw32/htdocs/test/06Alert.html");
//		driver.findElement(By.id("btn1")).click();
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(5000);
//		alert.accept();
		
//		driver.findElement(By.id("btn2")).click();
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(5000);
//		alert.dismiss();
		
		driver.findElement(By.id("btn3")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.sendKeys("hello");
		alert.accept();
	}

}

package ch05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecutorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("	file:///D:/upupw32/htdocs/test/AddRecord.html");
//		driver.findElement(By.id("1ImgPr")).sendKeys("d:\\demo\\baidu.jpg");
		WebElement input_file = driver.findElement(By.id("1upload_preview"));
		boolean flag = input_file.isDisplayed();
		System.out.println(flag);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style',arguments[1])", input_file, "display: block");
		driver.findElement(By.id("1upload_preview")).sendKeys("d:\\demo\\baidu.jpg");
		System.out.println(input_file.isDisplayed());

	}

}

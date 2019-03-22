package ch0502;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebStorage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/upupw32/htdocs/test/webstorage.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String name1=(String)js.executeScript("return localStorage.lastname");
		String name2=(String)js.executeScript("return localStorage.getItem('lastname')");
		System.out.println(name1);
		System.out.println(name2);


	}

}

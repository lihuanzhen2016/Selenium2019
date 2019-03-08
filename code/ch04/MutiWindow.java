package ch04;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutiWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("file:///D:/upupw32/htdocs/test/table.html");

		JavascriptExecutor jsExecutor = (JavascriptExecutor) wd;
		jsExecutor.executeScript("window.open('http://localhost:8032/Mymovie/')");
		System.out.println(wd.getTitle());
		Thread.sleep(4000);

		Set<String> windows = wd.getWindowHandles();
		for (String s : windows) {
			String t=wd.switchTo().window(s).getTitle();
			boolean flag = t.contains("My Movie");
			System.out.println(flag);
			if (flag) {
				wd.findElement(By.name("key")).sendKeys("hello");
			}

		}

		Thread.sleep(8000);
//		wd.quit();

	}

}

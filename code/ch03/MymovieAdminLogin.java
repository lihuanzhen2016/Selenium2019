package ch03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MymovieAdminLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver wd =new FirefoxDriver();
		wd.get("http://localhost:8032/Mymovie/admin.php/Login/index.html");
		wd.findElement(By.name("username1")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
//		wd.quit();

	}

}

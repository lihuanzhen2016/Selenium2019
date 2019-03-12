package ch0402;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrontLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/Mymovie/index.php/Index/index.html");

		driver.findElement(By.linkText("登录")).click();

		driver.findElement(By.name("username")).sendKeys("qingdao01");
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='马上登录']")).click();

		for (int i = 0; i < 5; i++) {
			driver.get("http://localhost:8032/Mymovie/index.php/Detail/index/id/38");
			driver.findElement(By.xpath("//button[contains(text(),'写影评')]")).click();
			driver.findElement(By.name("title")).sendKeys("hello0311");
			driver.switchTo().frame("xhe0_iframe");
//			进入子页面后，主页面的元素就找不到了
//			System.out.println(driver.findElement(By.name("title")).isEnabled());
			driver.findElement(By.tagName("body")).click();
			// 切换光标的位置
			driver.findElement(By.tagName("body")).sendKeys("这个电影不错，推荐！");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@value='发表影评']")).click();

		}

	}
}

package ch03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\demo\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver wd =new FirefoxDriver();
		wd.navigate().to("http://www.baidu.com/");
		
//		WebElement keyWord=wd.findElement(By.id("kw"));
//		keyWord.sendKeys("新浪");
//		上面两句代码可以合并为下面一句
//		wd.findElement(By.id("kw")).sendKeys("新浪");
//		wd.findElement(By.name("wd")).sendKeys("新浪");
//		
//		wd.findElement(By.id("su")).click();
		
//		driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);点击回车
		
//		wd.findElement(By.linkText("新闻")).click();
//		wd.findElement(By.partialLinkText("hao")).click();
		List<WebElement> inputs=wd.findElements(By.tagName("input"));
		System.out.println(inputs.size());
		Thread.sleep(5000);
		wd.quit();

	}

}

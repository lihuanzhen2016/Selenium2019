package ch04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDemo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
	WebDriver wd = new FirefoxDriver();
	wd.get("file:///D:/upupw32/htdocs/test/upfile.html");
	wd.findElement(By.id("file")).sendKeys("d:\\demo\\baidu.jpg");
//	wd.findElement(By.id("filesubmit")).click();
	String s1=wd.findElement(By.id("btn1")).getAttribute("onclick");
	System.out.println(s1);
	
	wd.get("https://www.baidu.com/");
	String s2=wd.findElement(By.id("kw")).getCssValue("border-bottom-style");
	System.out.println(s2);
	
	
	
	
}
}

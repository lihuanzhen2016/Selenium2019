package ch04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
	WebDriver wd = new FirefoxDriver();
	wd.get("file:///D:/upupw32/htdocs/test/elementdemo.html");
	
	wd.findElement(By.id("input1")).sendKeys("星期五");
	Thread.sleep(5000);
	wd.findElement(By.id("input1")).clear();
//点击单选框
	wd.findElement(By.xpath("//input[@value='orange']")).click();
//	wd.findElement(By.xpath("//input[@value='berry1']")).click();
	//遍历的方式点击所有的name为f1复选框
	List<WebElement> fruit=wd.findElements(By.name("f1"));
	for(WebElement f:fruit) {
		f.click();
	}
	//获取某元素的文本信息
	String a=wd.findElement(By.tagName("p")).getText();
	System.out.println(a);
	
	//下拉列表框的操作
	WebElement selectSingle=wd.findElement(By.name("fruit"));
	Select f1=new Select(selectSingle);
	f1.selectByIndex(3);
	f1.selectByValue("pear");
	f1.selectByVisibleText("1苹果");
	
	System.out.println(f1.isMultiple());
	
	WebElement selectM=wd.findElement(By.name("hobby"));
	Select f2=new Select(selectM);
	f2.selectByIndex(0);
	f2.selectByValue("tour");
	f2.selectByVisibleText("2阅读");
	f2.deselectAll();//取消选择
	System.out.println(f2.isMultiple());
	
	
}
}

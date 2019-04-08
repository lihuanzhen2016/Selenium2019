package ch07;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MovieManage extends BaseTest{


	@Test
	public void addMovie() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'影片管理')]")).click();
	 
		Thread.sleep(3000);

	
	    wd.findElement(By.xpath("//a[@title='添加影片']/span")).click();
	    Thread.sleep(3000);
		wd.findElement(By.name("filmname")).sendKeys("121212");
		wd.findElement(By.name("petname")).sendKeys("zhanlang");
		wd.findElement(By.name("director")).sendKeys("吴京");
		wd.findElement(By.name("editor")).sendKeys("吴京");
		wd.findElement(By.name("nation")).sendKeys("中国");
		wd.findElement(By.name("language")).sendKeys("汉语");
		wd.findElement(By.name("showtime")).sendKeys("2017-11-01");
		
		wd.findElement(By.name("minutes")).sendKeys("120");
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		Thread.sleep(3000);
		
		wd.switchTo().frame(0);
		wd.findElement(By.tagName("body")).click();
		wd.findElement(By.tagName("body")).sendKeys("电影不错");
		wd.switchTo().defaultContent();
		wd.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void addActor() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'影片管理')]")).click();
		wd.findElement(By.xpath("//*[@id='sidebar']/div[2]/div[6]/ul/li[2]/div/div[1]")).click();
		wd.findElement(By.xpath("//a[@title='添加演员信息']")).click();
	    
		wd.findElement(By.name("cname")).sendKeys("孙俪");
		wd.findElement(By.name("ename")).sendKeys("jessie");
		wd.findElement(By.linkText("- - 请选择 - -")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("双子座")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@value='1' and @name='sex']")).click();
		wd.findElement(By.name("birthday")).sendKeys("1993-04-14");
		wd.findElement(By.name("bornaddress")).sendKeys("北京");		
		wd.findElement(By.name("professtion")).sendKeys("演员");		
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		wd.findElement(By.tagName("button")).click();
		
		Thread.sleep(1000);
		assertTrue(wd.getPageSource().contains("成功"));
	
	}


//	@Test
	public void deleteMovie() throws InterruptedException {
		this.loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'影片管理')]")).click();
		Thread.sleep(3000);
	    wd.findElement(By.xpath("//a[@title='浏览影片信息']")).click();
	  
	    List<WebElement> tables = wd.findElements(By.tagName("table"));
		WebElement table = tables.get(1);//索引值从0开始
		table.findElement(By.tagName("td")).click();
		wd.findElement(By.xpath("//span[contains(.,'删除')]")).click();
		wd.findElement(By.xpath("//span[contains(.,'确定')]")).click();
		
		
		Thread.sleep(5000);
	}
//	@Test
	public void deleteReview() throws InterruptedException {
		this.loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'Folder影评管理')]")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("浏览短评信息")).click();
		Thread.sleep(3000);
		for (int i = 1; i < 75; i++) {
			List<WebElement> tables = wd.findElements(By.tagName("table"));
			WebElement table = tables.get(2);
			table.findElement(By.tagName("div")).click();
			wd.findElement(By.xpath("//span[contains(.,'删除')]")).click();
			wd.findElement(By.xpath("//span[contains(.,'确定')]")).click();
			Thread.sleep(3000);
		}

	}
}

package ch07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NewsManage extends BaseTest {

	@Test
	public void addNews() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'新闻信息管理')]")).click();
	 	wd.findElement(By.linkText("添加电影新闻信息")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("title")).sendKeys("羞羞的铁拳");
		wd.findElement(By.name("title2")).sendKeys("羞羞的铁拳开心麻花");
		wd.findElement(By.name("author")).sendKeys("宋阳");
		wd.findElement(By.name("edit")).sendKeys("张迟昱");
		wd.findElement(By.name("source")).sendKeys("开心麻花影业");
        wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		wd.findElement(By.name("summary")).sendKeys("靠打假拳混日子的艾迪生");
		wd.findElement(By.name("explain")).sendKeys("靠打假拳混日子的艾迪生（艾伦饰）");

		wd.findElement(By.xpath("//input[@name='status' and  @value='4']")).click();

//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).click();
//		wd.findElement(By.tagName("body")).sendKeys("靠打假拳混日子的艾迪生（艾伦饰），"
//				+ "本来和正义感十足的体育记者马小（马丽饰）是一对冤家，没想到因为一场意外的电击，男女身体互换。性别错乱后，两人互坑互害，引发了拳坛的大地震，也揭开了假拳界的秘密，惹来一堆麻烦，最终两人在“卷莲门”副掌门张茱萸（沈腾饰）的指点下，"
//				+ "向恶势力挥起了羞羞的铁拳");
//		wd.switchTo().defaultContent();

		wd.findElement(By.xpath("//input[@name='state' and  @value='3']")).click();

		action.sendKeys(Keys.TAB);
		wd.findElement(By.tagName("iframe")).sendKeys("靠打假拳混日子的艾迪生（艾伦饰），"
				+ "本来和正义感十足的体育记者马小（马丽饰）是一对冤家，没想到因为一场意外的电击，男女身体互换。性别错乱后，两人互坑互害，引发了拳坛的大地震，也揭开了假拳界的秘密，惹来一堆麻烦，最终两人在“卷莲门”副掌门张茱萸（沈腾饰）的指点下，"
				+ "向恶势力挥起了羞羞的铁拳");
		Thread.sleep(5000);
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
	}
}

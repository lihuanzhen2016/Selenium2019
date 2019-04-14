package ch09.dataproviderdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage3 extends LoadableComponent<LoginPage3> {

	public WebDriver driver = null;
	@FindBy(linkText = "登录")
	public WebElement linkLogin;
	
	@FindBy(name = "username")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@value='马上登录']")
	public WebElement submitBtn;

	@FindBy(linkText = "退出")
	public WebElement quite;

	public LoginPage3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void login(String u_name, String u_password) throws InterruptedException {

		if (this.driver.getPageSource().contains("退出")) {
			this.quite.click();
		}
		System.out.println("尝试登录");
		this.linkLogin.click();
		this.username.sendKeys(u_name);
		this.password.sendKeys(u_password);
		this.submitBtn.click();
		Thread.sleep(1000);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@Override
	protected void isLoaded() throws Error {
//		Assert.assertTrue(this.driver.getTitle().contains("基于ThinkPHP"));

		System.out.println("等待页面加载");
		WebDriverWait wait = new WebDriverWait(this.driver, 10, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		WebElement u_name = (new WebDriverWait(this.driver, 10)).until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver wd) {
				return wd.findElement(By.name("username"));
			}
		});
	}

	@Override
	protected void load() {
		System.out.println("打开页面");
		this.driver.get("http://localhost:8032/mymovie/index.php/Index/index.html");
	}

}

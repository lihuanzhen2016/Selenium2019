package ch03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.safari.SafariDriver;

public class ProfileForFirefox {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile pro = allprofiles.getProfile("tom");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(pro);
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(options);

	}
}

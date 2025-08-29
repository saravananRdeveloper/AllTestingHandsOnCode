package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://accounts.saucelabs.com/am/XUI/#login/");
		wd.findElement(By.id("idToken1")).sendKeys("standard_user");
		wd.findElement(By.name("callback_1")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		wd.findElement(By.name("callback_2")).click();
//		Thread.sleep(2000);
//		wd.findElement(By.id("login-button")).click();
	}

}

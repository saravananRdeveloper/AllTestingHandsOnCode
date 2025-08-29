package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class AssignmentDataprovider {
	WebDriver wd;
	@Test(dataProvider = "dp")
	public void f(String n, String s) throws InterruptedException {
		wd = new ChromeDriver();
		wd.get("https://testtrack.org/login-demo");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username= wd.findElement(By.id("username"));
		username.sendKeys(n);
		Thread.sleep(3000);
		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys(s);

		WebElement Login = wd.findElement(By.id("login-submit"));
		Login.click();
			wd.close();

	}
	@Test(dataProvider = "dp1")
	public void login(String n, String s) throws InterruptedException {
		wd = new ChromeDriver();
		wd.get("https://testtrack.org/login-demo");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username= wd.findElement(By.id("username"));
		username.sendKeys(n);
		Thread.sleep(3000);
		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys(s);

		WebElement Login = wd.findElement(By.id("login-submit"));
		Login.click();
		//		wd.close();

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "testuser", "password123" },
			new Object[] { "testuser", "b" },
		};

	}
	@DataProvider
	public Object[][] dp1() {
		return new Object[][] {
			new Object[] { "testuser", "password123" },
			new Object[] { "testuser", "b" },
		};
	}
}

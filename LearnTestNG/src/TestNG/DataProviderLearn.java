package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderLearn {
	WebDriver wd;
	@Test(dataProvider = "dp")
	public void Login(String n, String s) throws InterruptedException {
		wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username= wd.findElement(By.name("username"));
		username.sendKeys(n);
		Thread.sleep(3000);
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys(s);
		WebElement Login = wd.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		wd.close();

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "Admin", "admin123" },
			new Object[] { "Admin", "admin12" },
			new Object[] { "Admin", "admin123" },
			new Object[] { "Adm", "admin12" },
			new Object[] { "Admin", "123" },
			new Object[] { "sare", "admin12" },
		};
	}
}

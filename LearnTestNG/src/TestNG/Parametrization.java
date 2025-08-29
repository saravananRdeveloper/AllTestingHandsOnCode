package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	WebDriver wd;
	@Test
	@Parameters({"us","pwd"})
	public void f(String us,String pwd){
		WebElement un = wd.findElement(By.id("idToken1"));
		un.sendKeys(us);
		WebElement password = wd.findElement(By.id("idToken2"));
		password.sendKeys(pwd);
		WebElement Login = wd.findElement(By.id("loginButton_0"));
		Login.click();

	}
	@BeforeTest
	public void beforeTest() {

		wd = new ChromeDriver();
		wd.get("https://accounts.saucelabs.com/am/XUI/#login/");
		wd.manage().window().maximize();
	}


	@AfterTest
	public void afterDown() {
		wd.close();
	}

}

//		  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotLearn {
  @Test
  public void f() throws InterruptedException {
	  WebDriver wd;
	  wd = new ChromeDriver();
		wd.get("https://demoblaze.com/index.html");
		wd.manage().window().maximize();	
//		Thread.sleep(4000);
		WebElement buttonClick=wd.findElement(By.id("id=\"signin2\""));
		buttonClick.click();
		WebElement Signusername = wd.findElement(By.id("sign-username"));
		Signusername.sendKeys("Admin");
		WebElement signpassword = wd.findElement(By.id("sign-password"));
		signpassword.sendKeys("admin123");
		WebElement sign = wd.findElement(By.xpath("//button[@onclick=\"register()\"]"));
		sign.click();
		
  }
}

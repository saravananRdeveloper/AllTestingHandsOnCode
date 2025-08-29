package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationWebpage {
  @Test
  public void login() throws InterruptedException {
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
//	  Thread.sleep(3000);
	  WebElement username= wd.findElement(By.name("username"));
	  username.sendKeys("Admin");
//	  Thread.sleep(3000);
	  WebElement password = wd.findElement(By.name("password"));
	  password.sendKeys("admin123");
//	  Thread.sleep(3000);
	  WebElement Login = wd.findElement(By.xpath("//button[@type='submit']"));
	  Login.click();
	  System.out.println( wd.getTitle());
	  wd.close();
	  
  }
}

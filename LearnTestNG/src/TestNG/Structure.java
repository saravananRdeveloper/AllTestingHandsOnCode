package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Structure {
	WebDriver wd;
  @Test
  public void f() throws InterruptedException {
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement username= wd.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement password = wd.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement Login = wd.findElement(By.xpath("//button[@type='submit']"));
	  Login.click();
	  
  }
  @BeforeTest
  public void beforeSetUp() {
	  wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
  }

  @AfterTest
  public void afterDown() {
	  wd.close();
  }

}

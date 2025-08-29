package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver wd;
	@Test(groups={"smoke"})
  public void loginChrome() throws InterruptedException {
	  wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();	
		Thread.sleep(4000);
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		wd.close();
	  
  }
	@Test(groups={"sanity"})
  public void loginEdge() throws InterruptedException {
	  wd = new EdgeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();	
		Thread.sleep(4000);
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(4000);
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(4000);
		WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		wd.close();
	  
  }
  @Test
  public void loginFirefox() throws InterruptedException {
	  wd = new FirefoxDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();	
		Thread.sleep(4000);
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		wd.close();
	  
  }
}

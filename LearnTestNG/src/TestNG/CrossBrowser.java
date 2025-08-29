package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver wd;
	@Test
	@Parameters({"browser","un","pwd"})
	public void inputs(String browser,String un,String pwd) throws Exception {
		if (browser.equalsIgnoreCase("chrome")){
			wd = new ChromeDriver();
			wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wd.manage().window().maximize();	
			Thread.sleep(4000);
			WebElement username = wd.findElement(By.name("username"));
			username.sendKeys(un);
			WebElement password = wd.findElement(By.name("password"));
			password.sendKeys(pwd);
			WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
			loginbutton.click();


		}else if(browser.equalsIgnoreCase("edge")) {
			wd = new EdgeDriver();
			wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wd.manage().window().maximize();	
			Thread.sleep(4000);
			WebElement username = wd.findElement(By.name("username"));
			username.sendKeys(un);
			WebElement password = wd.findElement(By.name("password"));
			password.sendKeys(pwd);
			WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
			loginbutton.click();

		}
		else if(browser.equalsIgnoreCase("firefox")) {
			wd = new FirefoxDriver();
			wd.manage().window().maximize();	
			Thread.sleep(4000);
			WebElement username = wd.findElement(By.name("username"));
			username.sendKeys(un);
			WebElement password = wd.findElement(By.name("password"));
			password.sendKeys(pwd);
			WebElement loginbutton = wd.findElement(By.xpath("//button[@type='submit']"));
			loginbutton.click();
		}
	}
}
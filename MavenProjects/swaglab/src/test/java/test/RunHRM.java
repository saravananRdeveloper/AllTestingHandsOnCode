package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginOrangeHRM;
public class RunHRM {
	@Test
	@Parameters({"un","pwd"})
	
	public void run(String un,String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginOrangeHRM h=new LoginOrangeHRM(driver);
		Thread.sleep(3000);
		h.enterusername(un);
		h.enterpwd(pwd);
	}
	
}

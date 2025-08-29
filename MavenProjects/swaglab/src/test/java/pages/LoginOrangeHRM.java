package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOrangeHRM {
	WebDriver driver = null;
	By username = By.name("username");
	By pwd = By.name("password");
	public void enterusername(String input) {
		driver.findElement(username).sendKeys(input);
	}
	public void enterpwd(String input) {
		driver.findElement(pwd).sendKeys(input);
	}
	public LoginOrangeHRM(WebDriver driver) {
		this.driver=driver;
	}
}

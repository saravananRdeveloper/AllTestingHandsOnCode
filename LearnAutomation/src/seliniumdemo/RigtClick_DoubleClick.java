package seliniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RigtClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
//		wd.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		wd.get("https://accounts.saucelabs.com/am/XUI/#login/");
		wd.manage().window().maximize();
		WebElement user = wd.findElement(By.name("idToken1"));
		user.sendKeys("Saravanan@321");
		WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(5));
		user.sendKeys("Saravanan@321");
//		WebElement user = wd.findElement(By.id("email"));
		 					//implicit way to wait
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
							
//		Actions act = new Actions(wd);
//		act.moveToElement(user).click().build().perform();
//		act.contextClick(user).build().perform();
//		user.sendKeys("Saravanan@321");
//		act.doubleClick(user).build().perform();
	}

}

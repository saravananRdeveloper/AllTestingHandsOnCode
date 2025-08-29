package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement username= wd.findElement(By.name("username"));
		username.click();
		WebElement Password= wd.findElement(By.name("password"));
		username.click();
		WebElement login= wd.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement Alert= wd.findElement(By.xpath("//span[text()='Required']"));
		System.out.println(Alert.getText());

		
	}

}

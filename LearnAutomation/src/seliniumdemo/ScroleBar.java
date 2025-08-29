package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroleBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().window().maximize();
		WebElement submit = wd.findElement(By.id("Button1"));
		JavascriptExecutor Je = (JavascriptExecutor)wd;
		Thread.sleep(5000);
		Je.executeScript("arguments[0].scrollIntoView();",submit);
		
		
//		JE.executeScript("scroll(0,400)");
		
//		Thread.sleep(5000);
//		JE.executeScript("scroll(0,-150)");
	}

}

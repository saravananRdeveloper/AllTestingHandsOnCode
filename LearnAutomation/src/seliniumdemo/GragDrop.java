package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Static.html");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		Actions action = new Actions(wd);
		WebElement drag = wd.findElement(By.id("angular"));
		WebElement drag1 = wd.findElement(By.id("mongo"));
		WebElement drop = wd.findElement(By.id("droparea"));
		action.dragAndDrop(drag1, drop).build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		
	}

}

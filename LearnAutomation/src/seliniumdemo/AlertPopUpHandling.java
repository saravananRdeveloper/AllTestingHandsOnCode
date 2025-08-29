package seliniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Alerts.html");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button = wd.findElement(By.xpath("//button[@onclick='alertbox()']"));
		button.click();
		Alert al = wd.switchTo().alert();
		Thread.sleep(3000);
//		System.out.println(al.getText());
		al.accept();
		Thread.sleep(3000);
//		WebElement button1 = wd.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']]"));
//		button.click();
		WebElement button2 = wd.findElement(By.xpath("//button[@onclick=\'confirmbox()\']]"));
		button.click();
		
		
//		Alert al1 = wd.switchTo().alert();
//		Thread.sleep(3000);
//		al1.dismiss();
		
	}

}

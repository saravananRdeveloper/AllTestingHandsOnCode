package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registeration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("saro");
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("R");
		wd.findElement(By.tagName("textArea")).sendKeys("aaaa");
		wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Saso@123");
		wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9790641230");
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		wd.findElement(By.xpath("//input[@value='Cricket']")).click();
		wd.findElement(By.id("msdd"));
		Select s = new Select(wd.findElement(By.id("Skills")));
		s.selectByVisibleText("SQL");
		Select Year = new Select(wd.findElement(By.id("yearbox")));
		Year.selectByValue("1934");
		Select Month = new Select(wd.findElement(By.xpath("//select[@ng-model='monthbox']")));
		Month.selectByVisibleText("May");
		Select Day = new Select(wd.findElement(By.id("daybox")));
		Day.selectByValue("19");
		wd.findElement(By.xpath("//div[@id='msdd']")).click();
		wd.findElement(By.xpath("//a[contains(text() , 'Hindi')]")).click();
		wd.findElement(By.id("firstpassword")).sendKeys("qwerty");
		wd.findElement(By.id("secondpassword")).sendKeys("qwerty");
		Thread.sleep(3000);
		wd.findElement(By.id("submitbtn")).click();
		Thread.sleep(10000);
		wd.findElement(By.id("Button1")).click();
		Thread.sleep(5000);
	}

}

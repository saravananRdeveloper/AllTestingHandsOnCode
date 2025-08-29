package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationDemoSite {
	WebDriver wd;
	@Test
	@Parameters({"fn","ln","add","email","num","skill","year","month","day"})
	public void Login(String fn,String ln,String add,String email,String num,String skill,String year,String month,String day) throws InterruptedException {
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln);
		wd.findElement(By.tagName("textArea")).sendKeys(add);
		wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);
		wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(num);
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		wd.findElement(By.xpath("//input[@value='Cricket']")).click();
		wd.findElement(By.id("msdd"));
		Select s = new Select(wd.findElement(By.id("Skills")));
		s.selectByVisibleText(skill);
		Thread.sleep(5000);
		Select Year = new Select(wd.findElement(By.id("yearbox")));
		Year.selectByValue(year);
		Thread.sleep(5000);
		Select Month = new Select(wd.findElement(By.xpath("//select[@ng-model='monthbox']")));
		Month.selectByVisibleText(month);
		Thread.sleep(5000);
		Select Day = new Select(wd.findElement(By.id("daybox")));
		Day.selectByValue(day);
	}
	@BeforeTest
	public void beforeTest() {
		wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		wd.close();
	}
}

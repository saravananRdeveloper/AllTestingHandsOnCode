package Task;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login() throws Exception {
		FileReader fr = new FileReader("C:\\AutomationTesting\\FinalTask\\src\\Task\\lib.properties");
		Properties p = new Properties();
		p.load(fr);
		WebDriver wd = new ChromeDriver();
		wd.get(p.getProperty("url"));
		wd.manage().window().maximize();
		System.out.println(wd.getTitle());

		String Fw= wd.getWindowHandle();
		wd.switchTo().newWindow(WindowType.TAB);
		//		String Sw= wd.getWindowHandle();
		wd.get(p.getProperty("url1"));
		wd.switchTo().window(Fw);

		WebElement fn = wd.findElement(By.id("first_name"));
		Thread.sleep(3000);
		fn.sendKeys(p.getProperty("fn"));
		System.out.println(fn.getAttribute("value"));

		WebElement lastname = wd.findElement(By.id("last_name"));
		Thread.sleep(3000);
		lastname.sendKeys(p.getProperty("ln"));
		System.out.println(lastname.getAttribute("value"));

		WebElement email = wd.findElement(By.id("email"));
		Thread.sleep(3000);
		email.sendKeys(p.getProperty("email"));
		System.out.println(email.getAttribute("value"));

		WebElement phone = wd.findElement(By.id("phone"));
		Thread.sleep(3000);
		phone.sendKeys(p.getProperty("phno"));
		System.out.println(phone.getAttribute("value"));

		WebElement companyname = wd.findElement(By.id("organization"));
		companyname.sendKeys(p.getProperty("company"));
		System.out.println(companyname.getAttribute("value"));

		WebElement countryDropdown = wd.findElement(By.xpath("//select[@class='addressCountry form-control']"));
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText("India");
		System.out.println(countryDropdown.getAttribute("value"));

		WebElement accessTestrail = wd.findElement(By.xpath("//select[@id='users']"));
		Select count = new Select(accessTestrail);
		Thread.sleep(3000);
		count.selectByValue("20");
		System.out.println(accessTestrail.getAttribute("value"));

		WebElement radio = wd.findElement(By.id("type_download"));
		radio.click();

		WebElement checkbox1 = wd.findElement(By.id("terms"));
		checkbox1.click();

		WebElement checkbox2 = wd.findElement(By.id("gdpr"));
		checkbox2.click();

		WebElement submit = wd.findElement(By.xpath("//button[@type='submit']"));
		submit.click();

		wd.close();

	}
}

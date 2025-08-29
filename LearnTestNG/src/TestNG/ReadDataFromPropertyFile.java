package TestNG;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void f() throws Exception {
		FileReader fr= new  FileReader("C:\\AutomationTesting\\LearnTestNG\\src\\TestNG\\data.properties");
		Properties p = new Properties();
		p.load(fr);
		WebDriver d = new ChromeDriver();
		d.get(p.getProperty("url"));
//		d.get(p.getProperty("url1"));
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys(p.getProperty("un"));
		Thread.sleep(3000);
		
	}
}

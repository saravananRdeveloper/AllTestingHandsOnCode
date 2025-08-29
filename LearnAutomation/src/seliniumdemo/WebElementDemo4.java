package seliniumdemo;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class WebElementDemo4 {
 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demoqa.com/automation-practice-form");
		wd.manage().window().maximize();
//		wd.findElement(By.id("firstName")).click();
//		wd.findElement(By.id("firstName")).sendKeys("Praven");
//		wd.findElement(By.id("firstName")).clear();
//		wd.findElement(By.id("firstName")).sendKeys("Praveen");
		WebElement fn = wd.findElement(By.id("firstName"));
		fn.click();
		fn.sendKeys("Praven");
		Thread.sleep(2000);
		fn.clear();
		fn.sendKeys("Praveen");
		System.out.println(fn.getAttribute("value"));
		System.out.println("textbox is present? "+fn.isDisplayed());// textbox is present
		System.out.println("textbox is editable? "+fn.isEnabled());// textbox is editable
		System.out.println("selected ? "+fn.isSelected());
		System.out.println(""+fn.getTagName());
		
		WebElement Radiobutton = wd.findElement(By.id("gender-radio-1"));
		System.out.println(Radiobutton.isEnabled());
		System.out.println(Radiobutton.isSelected());//no default value selected
		System.out.println(Radiobutton.getTagName());
		System.out.println(fn.getSize());
		System.out.println(fn.getLocation());
		
		WebElement dropdown = wd.findElement(By.id("Skills"));
		System.out.println(dropdown.getText());
		
	}
 
}
 
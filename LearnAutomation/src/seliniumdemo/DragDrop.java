package seliniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class DragDrop {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wb = new ChromeDriver();
		wb.get("https://demo.guru99.com/test/drag_drop.html");
		wb.manage().window().maximize();
		Thread.sleep(3000);
		Actions act = new Actions(wb);
		WebElement dragbank=wb.findElement(By.id("credit2"));
		WebElement drop1a = wb.findElement(By.id("bank"));
		act.dragAndDrop(dragbank, drop1a).build().perform();
		
		WebElement dragamt1=wb.findElement(By.id("fourth"));
		WebElement drop1b = wb.findElement(By.id("amt7"));
		act.dragAndDrop(dragamt1, drop1b).build().perform();
		
		WebElement dragsales=wb.findElement(By.id("credit1"));
		WebElement drop2a = wb.findElement(By.id("loan"));
		act.dragAndDrop(dragsales, drop2a).build().perform();
		
		WebElement dragamt2=wb.findElement(By.id("fourth"));
		WebElement drop2b = wb.findElement(By.id("amt8"));
		act.dragAndDrop(dragamt2, drop2b).build().perform();
		
	}
 
}
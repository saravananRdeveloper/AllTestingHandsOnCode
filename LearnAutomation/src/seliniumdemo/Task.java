package seliniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		String pw = wb.getWindowHandle();
		wb.get("https://www.changepond.com/");//tab
		wb.manage().window().maximize();
		Thread.sleep(3000);
		
		wb.switchTo().newWindow(WindowType.TAB);
		String Sw = wb.getWindowHandle();
		wb.get("https://www.google.com/");//tab
		Thread.sleep(3000);
		
		wb.switchTo().newWindow(WindowType.TAB);
		String Tw = wb.getWindowHandle();
		wb.get("https://demoqa.com/automation-practice-form");//tab
		Thread.sleep(3000);
		
		wb.switchTo().window(pw);//3to1
		Thread.sleep(5000);
		wb.switchTo().window(Sw);//1to2
		Thread.sleep(5000);
		wb.switchTo().window(Tw);//2to3
		Thread.sleep(5000);
		wb.switchTo().window(Sw);//3to2
		Thread.sleep(5000);
		wb.switchTo().window(pw);//2to1
		Thread.sleep(5000);
		wb.switchTo().window(Tw);//1to3
		Thread.sleep(5000);
		wb.close();
		wb.quit();
	}

}

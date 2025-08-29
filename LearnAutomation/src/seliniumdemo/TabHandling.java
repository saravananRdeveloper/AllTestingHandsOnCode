package seliniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		String pw = wb.getWindowHandle();
		wb.get("https://www.changepond.com/");
		wb.manage().window().maximize();
		Thread.sleep(3000);
		wb.switchTo().newWindow(WindowType.TAB);
		String Sw = wb.getWindowHandle();
		wb.get("https://www.google.com/");
		Thread.sleep(3000);
		wb.switchTo().window(pw);
	}

}

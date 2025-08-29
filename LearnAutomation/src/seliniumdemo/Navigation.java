package seliniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://redbus.com");
		
		wd.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
		wd.navigate().refresh();
		wd.manage().window().maximize();
		System.out.println(wd.manage().window().getSize());
		
		wd.manage().window().minimize();
}

}

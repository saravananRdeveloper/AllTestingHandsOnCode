package seliniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		String s ="https://www.google.com/";
		WebDriver wd = new ChromeDriver();	// open in chrome Browser
//		WebDriver wd1 = new FirefoxDriver();// open in Firefox Browser
		wd.get(s);//to open web page
		wd.manage().window().maximize();
		Thread.sleep(10000);
		wd.manage().window().minimize();
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getPageSource());
		wd.close();
	}
}

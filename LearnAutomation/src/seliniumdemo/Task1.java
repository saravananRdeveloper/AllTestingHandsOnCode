package seliniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		WebDriver wd1 = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://redbus.com");
		wd1.get("https://www.google.com/");
		
		wd.manage().window().minimize();
		String com=wd.getTitle();
		System.out.println(com);
		if(com.equals("Welcome")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		System.out.println(wd.getPageSource());
//		System.out.println(wd.getCurrentUrl());
		Thread.sleep(10000);
		wd.close();
	
	}

}

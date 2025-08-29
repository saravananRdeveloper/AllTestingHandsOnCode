package seliniumdemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomSize {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		Dimension d = new Dimension(500, 700); //pass the size of the webpage
		wd.manage().window().setSize(d);
	}				

}

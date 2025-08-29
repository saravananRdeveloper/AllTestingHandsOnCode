package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void f() {
	  ChromeDriver wd= new ChromeDriver();
	  wd.get("https://www.google.com");
	  SoftAssert sa = new SoftAssert();
	  String expTitle = wd.getTitle();
	  String actTitle="google";
	  assertEquals(expTitle, actTitle);
	  System.out.println("Test Complete");
	  sa.assertAll();
  }
}

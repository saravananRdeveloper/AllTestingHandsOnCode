package StepDefiniction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginStep {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
 
	@And("user Enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
 
	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
 
	@Then("User should navigate on next page")
	public void user_should_navigate_on_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
	   // throw new io.cucumber.java.PendingException();
	}

 
}
 

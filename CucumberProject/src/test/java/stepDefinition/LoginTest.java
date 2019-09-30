package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("User is on homepage");
	    System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}

	@Then("User loged in successful")
	public void user_loged_in_successful() {
		System.out.println("User loged in successful");
	}
}

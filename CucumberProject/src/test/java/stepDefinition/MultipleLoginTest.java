package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MultipleLoginTest {
	WebDriver driver;
	@Given("User is on DemoWebShop Page")
	public void user_is_on_DemoWebShop_Page() {
	    System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("Display message Logged in successfully")
	public void display_message_Logged_in_successfully() {
	    System.out.println("Logged in successfully");
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
}

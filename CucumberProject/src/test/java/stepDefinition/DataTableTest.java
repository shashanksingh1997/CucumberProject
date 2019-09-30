package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableTest {
	WebDriver driver;
	@Given("user is on HerokuApp page")
	public void user_is_on_HerokuApp_page() {
	    System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable usercredentials) {
	   List<String> data = usercredentials.asList();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0));
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(1));
	   driver.findElement(By.xpath("//i[contains(.,'Login')]"));
	}

	@Then("display message user login successfully")
	public void display_message_user_login_successfully() {
		System.out.println("user login successful");
		driver.close();
	    
	}
}

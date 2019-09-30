package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppTest {
	WebDriver driver;
	@Given("TestMeApp home page")
	public void testmeapp_home_page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8083/TestMeApp/login.htm");
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String username1, String password1) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Then("click on login for successful login")
	public void click_on_login_for_successful_login() throws InterruptedException {
		System.out.println("Successful login");
	    driver.wait(1000);
	    driver.close();
	}
}

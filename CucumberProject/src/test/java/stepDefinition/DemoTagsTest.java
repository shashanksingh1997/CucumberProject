package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTagsTest {

	@Given("Test one Background")
	public void test_one_Background() {
	    System.out.println("Test one Background");
	}

	@When("Test two Background")
	public void test_two_Background() {
		 System.out.println("Test two Background");
	}

	@Then("Test three Background")
	public void test_three_Background() {
		 System.out.println("Test three Background");
	}

	@Given("It is a smoke first step")
	public void it_is_a_smoke_first_step() {
		 System.out.println("It is a smoke first step");
	}

	@When("It is a smoke second step")
	public void it_is_a_smoke_second_step() {
	     System.out.println("It is a smoke second step");
	}

	@Then("It is a smoke third step")
	public void it_is_a_smoke_third_step() {
		 System.out.println("It is a smoke third step");
	}

	@Given("It is a Regression first step")
	public void it_is_a_Regression_first_step() {
		 System.out.println("It is a Regression first step");
	}

	@When("It is a Regression second step")
	public void it_is_a_Regression_second_step() {
		 System.out.println("It is a Regression second step");
	}

	@Then("It is a Regression third step")
	public void it_is_a_Regression_third_step() {
		 System.out.println("It is a Regression third step");
	}

	@Given("It is a Integration first step")
	public void it_is_a_Integration_first_step() {
		 System.out.println("It is a Integration first step");
	}

	@When("It is a Integratuion second step")
	public void it_is_a_Integratuion_second_step() {
		 System.out.println("It is a Integratuion second step");
	}

	@Then("It is a Integration third step")
	public void it_is_a_Integration_third_step() {
		 System.out.println("It is a Integration third step");
	}

}

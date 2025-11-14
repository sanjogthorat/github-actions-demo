package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("user is at application home page")
	public void user_is_at_application_home_page() {
	    System.out.println("----------Pre-condition: user is at application home page----------");
	}

	@Given("user is at sign up page")
	public void user_is_at_sign_up_page() {
	    System.out.println("User is at sign up pgae");
	}

	@When("user enters name as {string} on the form")
	public void user_enters_name_as_on_the_form(String name) {
	   System.out.println("user enters username as a: " + name); 
	}

	@When("user select gender as {string}")
	public void user_select_gender_as(String gender) {
	    System.out.println("User select gender as a: " + gender);
	}

	@When("user select slotnumber as {int}")
	public void user_select_slotnumber_as(Integer slotnumber) {
	    System.out.println("user select slotnumber as a: " + slotnumber);
	}

	@Then("user gets created")
	public void user_gets_created() {
	    System.out.println("User gets created.....");
	}
}

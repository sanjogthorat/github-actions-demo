package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("I have logged into application")
	public void i_have_logged_into_application() {
	    System.out.println("Pre-Condition - Logged In to the application");
	}
	
	@Given("I am at home page")
	public void i_am_at_home_page() {
	   System.out.println("User is at Home page"); 
	}

	@When("I click on Add button")
	public void i_click_on_add_button() {
	    System.out.println("Clikced on the Add button");
	}

	@When("I enter the data")
	public void i_enter_the_data() {
		System.out.println("Data entered");
	}

	@Then("Profile should get added")
	public void profile_should_get_added() {
		System.out.println("profile addition validated!!!!");
	}

	@When("I click on Edit button")
	public void i_click_on_edit_button() {
		System.out.println("Click on Edit button");
	}

	@When("I update the data")
	public void i_update_the_data() {
		System.out.println("Data Updated");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
		System.out.println("Profile Updation Validated!!!!");
	}

	@When("I click on Delete button")
	public void i_click_on_delete_button() {
		System.out.println("Click on delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Profile Deletion Validated!!!!");
	}

}

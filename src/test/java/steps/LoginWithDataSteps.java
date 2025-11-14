package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {

	@Given("user should be at login page")
	public void user_should_be_at_login_page() {
	    System.out.println("Pre-condition - User logged into the application");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	    System.out.println("User enterd the username: " + username);
	}
	
	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
	    System.out.println("User enterd the password: " + password);
	}

	@When("user clicks on the Login {double} button")
	public void user_clicks_on_the_login_button(Double login) {
		System.out.println("Login: " + login);
	}

	@Then("user should get logged into the application")
	public void user_should_get_logged_into_the_application() {
	    System.out.println("user successfully logged into the application");
	}
}

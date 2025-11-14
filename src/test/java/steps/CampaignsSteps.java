package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {

	@Given("user should be at campaign page")
	public void user_should_be_at_campaign_page() {
		System.out.println("Pre-Condition - user is at campaign page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
		System.out.println("user click on create campaign button");
	}

	@When("user enters information")
	public void user_enters_information() {
		System.out.println("user enter information");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	    System.out.println("User get created validated!!!!!");
	}

	@When("user click on shedule campaign")
	public void user_click_on_shedule_campaign() {
		System.out.println("user clicked on sheduled campaign button");
	}

	@When("user enters a shedule time")
	public void user_enters_a_shedule_time() {
		System.out.println("user enterd the sheduled time");
	}

	@Then("campaign should get sheduled")
	public void campaign_should_get_sheduled() {
		System.out.println("campaign get sheduled - Validated!!!!!");
	}

	@When("user click on send campaign")
	public void user_click_on_send_campaign() {
		System.out.println("user click on send button");
	}

	@Then("user should see the sent count of email")
	public void user_should_see_the_sent_count_of_email() {
		System.out.println("user get the sent message count - Validated!!!!");
	}

}

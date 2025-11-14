package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {

	
	@Given("user is at orders page")
	public void user_is_at_orders_page() {
	   System.out.println("Given statement");
	}

	@When("user click on order button")
	public void user_click_on_order_button() {
	 System.out.println("Clicked on order button");
	}

	@When("user click on current order")
	public void user_click_on_current_order() {
	   System.out.println("Clicked on current order");
	}

	@Then("user should see the current order info")
	public void user_should_see_the_current_order_info() {
	  System.out.println("Validate current order info");
	}

	@When("user click on order history")
	public void user_click_on_order_history() {
		System.out.println("Clicked on history");
	}

	@Then("user should see the previously placed order info")
	public void user_should_see_the_previously_placed_order_info() {
		 System.out.println("Validate previous order info");
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		System.out.println("Clicked on cancelled order");
	}

	@Then("user should see the cancelled order info")
	public void user_should_see_the_cancelled_order_info() {
		 System.out.println("Validate cancelled order info");
	}
}

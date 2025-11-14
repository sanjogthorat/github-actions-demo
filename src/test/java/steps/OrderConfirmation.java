package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmation {
	AddingProductToCart apc;
	
	public OrderConfirmation(AddingProductToCart apc) {
		this.apc = apc;
	}

	@When("I click on the place order button")
	public void i_click_on_the_place_order_button() {
	   System.out.println("User clicked on the place order button"); 
	   String productId = apc.getProductId();
	   System.out.println(productId);
	}

	@Then("order should get placed")
	public void order_should_get_placed() {
	    System.out.println("Order get placed!!!!!");
	}
	
}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	
	@Given("user is at accounts page")
	public void user_is_at_accounts_page() {
	    System.out.println("Pre-conition user is at login page");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		
 //===== This is First way to fetch the data from datatable ============================	
	    List<List<String>> data = dataTable.asLists();
	    List<String> secondRowData = data.get(1);
	    String firstName = secondRowData.get(0);
	    String lastName = secondRowData.get(1);
	    String email = secondRowData.get(2);
	    String phone = secondRowData.get(3);
	    System.out.println("FirstName: " + firstName);
	    System.out.println("lastName: " + lastName);
	    System.out.println("Email: " + email);
	    System.out.println("Phone: " + phone);
	   
 //===== This is Second way to fetch the data from datatable ============================
	    
	    for(String element : secondRowData)
	    {
	    	System.out.println(element);
	    }
	    
 //===== This is Third way to fetch the data from datatable ============================
	    
	    firstName = data.get(1).get(0);
	    System.out.println("First row FirstName: " + firstName);
	    
 //===== This is Fourth way to fetch the data from datatable ============================
	    
	   List<Map<String, String>> data1 = dataTable.asMaps();
	   Map<String, String> list1 = data1.get(1);
	   lastName= list1.get("lastname");
	   System.out.println("Last Name by Map: " + lastName);
	   
 //===== This is Fourth way to fetch the data from datatable ============================
	   
	   for(int i = 0 ; i < data1.size()-1 ; i++)
	   {
		   Map<String, String> listOfKeyAndValue = data1.get(0);
		   String valueOfLastName = listOfKeyAndValue.get("lastname");
		   System.out.println("Value od Last Name: ---------" + valueOfLastName);
	   }

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Cliked on the Submit button");
	}

	@Then("user should get confirmation")
	public void user_should_get_confirmation() {
		System.out.println("Confirmation message validated!!");
	}
}

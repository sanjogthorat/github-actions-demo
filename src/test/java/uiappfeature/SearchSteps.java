package uiappfeature;

import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {
	SearchPage search;

	public SearchSteps() {
		search = PageFactoryManager.getSearchPage(DriverFactory.getDriver());
	}

	@When("user searches for {string} in text box")
	public void user_searches_for_in_text_box(String string) {
		search.searchProduct(string);
	}

	@Then("mobile search results should display")
	public void mobile_search_results_should_display() {
		boolean isDisplayed = search.verifyMobile();

		Assert.assertEquals(isDisplayed, true);
	}


}

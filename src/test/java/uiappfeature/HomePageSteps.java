package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.PropReader;

public class HomePageSteps {
	
	HomePage homePage;
	
	public HomePageSteps() {
		homePage = PageFactoryManager.getHomePage(DriverFactory.getDriver());
	}

	@Given("user is at landing page")
	public void user_is_at_landing_page() throws IOException, InterruptedException {
	    WebDriver driver = DriverFactory.getDriver();
	    
	    driver.get(PropReader.readPropData("testsiteurl"));
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String title) {
	    String pageTitle = homePage.getTitleOfPage();
	    boolean isTitlePresent = pageTitle.contains(title);
	    Assert.assertEquals(isTitlePresent, true);
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
	    boolean cartIconDisplayed = homePage.isCartIconDisplayed();
	    Assert.assertEquals(cartIconDisplayed, true);
	}

	@When("user clicks at deals")
	public void user_clicks_at_deals() {
	 homePage.checkOutDealsSection();  
	}

	@Then("user should redrects plants section")
	public void user_should_redrects_plants_section() {
	    boolean isPresent = homePage.validatePlantsSection();
	    Assert.assertEquals(isPresent, true);
	}	
}
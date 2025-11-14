package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage{
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchTextBox;

	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	WebElement searchIcon;

	@FindBy(xpath = "//*[@role='listitem']//*[contains(text(),'Samsung Galaxy M05')]")
	WebElement searchedResult;

	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchProduct(String productName) {
		clearAndSendKeys(searchTextBox, productName);
		clickOn(searchIcon);
	}
	
	public boolean verifyMobile() {
		wait.until(ExpectedConditions.visibilityOf(searchedResult));
		boolean isDisplaying = searchedResult.isDisplayed();
		return isDisplaying;
	}
}
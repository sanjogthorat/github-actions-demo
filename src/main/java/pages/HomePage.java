package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	WebElement cartIcon;

	@FindBy(xpath = "//*[@alt='Daily essentials']/parent::a")
	WebElement dailyEssentials;

	@FindBy(xpath = "//*[@id='s-refinements']//*[text()='Baby']")
	WebElement brandText;

	public HomePage(WebDriver driver) {
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage() {
		String titleOfPage = driver.getTitle();
		return titleOfPage;
	}
	
	public boolean isCartIconDisplayed() {
		boolean isDisplaying = cartIcon.isDisplayed();
		return isDisplaying;
	}
	
	public void checkOutDealsSection() {
		wait.until(ExpectedConditions.visibilityOf(dailyEssentials));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", dailyEssentials);
	}
	
	public boolean validatePlantsSection() {
		wait.until(ExpectedConditions.visibilityOf(brandText));
		boolean isDisplaying = brandText.isDisplayed();
		return isDisplaying;
	}
}
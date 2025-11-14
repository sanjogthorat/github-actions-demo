package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SearchPage;

public class PageFactoryManager {

	private static HomePage homePage;
	private static SearchPage searchPage;
	
	public static HomePage getHomePage(WebDriver driver) {
		if(homePage == null)
		{
			return new HomePage(driver);
		}
		else
		{
			return homePage;
		}
	}
	
	public static SearchPage getSearchPage(WebDriver driver) {
		if(searchPage == null)
		{
			return new SearchPage(driver);
		}
		else
		{
			return searchPage;
		}
	}
}
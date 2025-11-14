package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.PropReader;

public class ApplicationHooks {
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException {
		DriverFactory df = new DriverFactory();
		String browserName = PropReader.readPropData("browser");
		
String browserFromCommandPrompt= System.getProperty("cliBrowser");
		
		System.out.println("Browser value from command prompt is :"+browserFromCommandPrompt);
		
		String environmentValue= System.getProperty("env");
		System.out.println("Env value is "+environmentValue);
		
		if(browserFromCommandPrompt !=null)
		{
			browserName = browserFromCommandPrompt;
		}
		
		driver = df.initBrowser(browserName);
		driver.manage().window().maximize();
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();
		
		if(isScenarioFailed)
		{
			String scenarioName = scenario.getName();
			String newScenarioName = scenarioName.replaceAll(" ", "_");
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", newScenarioName);
		}
	}
	
	@After(order = 1)
	public void quiteBrowser() {
		driver.quit();
	}
}
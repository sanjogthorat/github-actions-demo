package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\ScenarioOutline.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty", "html:target/htmlreport/reports.html"}
		
		)

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests{

}

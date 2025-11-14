package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Orders.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty","html:target/htmlreport/reports.html"}
		)

public class OrderRunner extends AbstractTestNGCucumberTests{

}

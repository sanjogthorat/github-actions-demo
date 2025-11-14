
package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src//test//resources//uiappfeature"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/htmlreport/reports.html"},
		
				tags = "@sanity",
		
		publish = true
		)




public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
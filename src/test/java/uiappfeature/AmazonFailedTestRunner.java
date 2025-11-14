package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"@target/failedrun.txt"},
		//features = {"src\\test\\resources\\uiappfeature"},
		
		glue = {"uiappfeature"},
		
				plugin = {"pretty", "html:target/htmlreport/reports.html", 
						"rerun:target/failedrun.txt"
			},

		tags = "@sanity"
		)

public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests{

	
}

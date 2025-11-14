package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Profile.feature"}, 
		glue = {"steps"}
		
		)

public class ProfileRunner extends AbstractTestNGCucumberTests{

}

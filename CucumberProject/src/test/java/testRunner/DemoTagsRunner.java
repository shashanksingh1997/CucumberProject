package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features\\DemoTags.feature",
		glue = {"stepDefinition"},
		//tags = {"@RegressionTest"}
		//tags = {"@RegressionTest", "@SmokeTest"} //AND
		//tags = {"@RegressionTest, @SmokeTest"} //OR
		tags = {"@FunctionalTest", "~@SmokeTest"}, //Ignore the SmokeTest using ~ sign
		plugin = {"html:target/cucumber-reports/",
				"json:target/cucumber-reports/GFTAug.json"
		}
		)

public class DemoTagsRunner {	

}

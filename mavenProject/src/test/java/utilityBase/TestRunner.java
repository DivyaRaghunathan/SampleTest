package utilityBase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featureFile"
		,glue={"stepDefinitions"}, tags = {"@Run"}
		)

public class TestRunner {

}




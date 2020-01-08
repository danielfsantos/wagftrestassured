package wagftrestassured.wagftrestassured;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features",plugin = "json:target/cucumber-report.json")
public class TestRun extends AbstractTestNGCucumberTests{

	
}

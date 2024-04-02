package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="features",
		glue="stepDefinitions",plugin= {"pretty","html:target/cucumber-reports",
				"json:target/CucumberReport/JSONReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		monochrome=true
	    )
public class RedbusRunnerClass extends AbstractTestNGCucumberTests  {

}

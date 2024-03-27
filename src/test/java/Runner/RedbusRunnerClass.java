package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="features",
		glue="stepDefinitions")
public class RedbusRunnerClass extends AbstractTestNGCucumberTests  {

}

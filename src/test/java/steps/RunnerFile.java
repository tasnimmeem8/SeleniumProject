package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/features",glue="steps",plugin= {"html:reports"},tags={"@WIP"})
public class RunnerFile extends AbstractTestNGCucumberTests {

}
	
	
	


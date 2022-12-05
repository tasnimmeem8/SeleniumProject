package steps1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features1",glue="steps1",plugin= {"html:reports"},tags={"@WIP"})
public class RunnerFile extends AbstractTestNGCucumberTests{

}

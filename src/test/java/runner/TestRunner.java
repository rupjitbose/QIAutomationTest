package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinations",
        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true,
        publish = true
)
public class TestRunner extends  AbstractTestNGCucumberTests{

}

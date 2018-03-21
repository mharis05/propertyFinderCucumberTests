package propertyFinder;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",
        plugin = { "pretty", "html:target/htmlreport"})

public class TestRunner {

}

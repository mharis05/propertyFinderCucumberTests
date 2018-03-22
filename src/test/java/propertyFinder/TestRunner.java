package propertyFinder;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * TestRunner.java
 * Purpose: Cucumber Test Runner class. Contains execution configurations like reporting,
 * which features are to be included in a run.
 *
 * @author Haris Saleem
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",
        plugin = { "pretty", "html:target/htmlreport","com.cucumber.listener.ExtentCucumberFormatter:target/testReport.html"})

public class TestRunner {

    // Generate extentReort (HTML based report) in the target folder
    // Find the report with filename: testReport.html

    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Win 10");
    }

}

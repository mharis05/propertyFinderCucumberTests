package propertyFinder.propertyFinderAssignment;

import cucumber.api.java.en.Given;
import propertyFinder.PropertyFinderWaits;

/**
 * CommonSteps.java
 * Purpose: Steps shared by different Features are defined here. This helps increase
 * accessibility of such stepdefs and can help when Dependency Injection is required.
 * This class can be injected using any DI method into any class as needed.
 *
 * @author Haris Saleem
 */

public class CommonSteps extends BaseTest{
    @Given("^Property Finder Homepage is Open for \"([^\"]*)\"$")
    public void propertyFinderHomepageIsOpen(String domain) {
        driver.get(url + domain);
        PropertyFinderWaits.waitForSeconds(driver,30);
        driver.manage().window().maximize();
    }
}

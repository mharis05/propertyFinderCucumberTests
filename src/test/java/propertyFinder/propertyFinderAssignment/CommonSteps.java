package propertyFinder.propertyFinderAssignment;

import cucumber.api.java.en.Given;
import propertyFinder.PropertyFinderWaits;

// Common Step definitions used by multiple step definition
// classes are placed in this class for ease of access.
// In the future, in case Dependency injection is required,
// this class can be injected directy wherever required.

public class CommonSteps extends BaseTest{
    @Given("^Property Finder Homepage is Open for \"([^\"]*)\"$")
    public void propertyFinderHomepageIsOpen(String domain) {
        driver.get(url + domain);
        PropertyFinderWaits.waitForSeconds(driver,30);
        driver.manage().window().maximize();
    }
}

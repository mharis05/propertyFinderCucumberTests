package propertyFinder.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * AgentSearchResultsPage.java
 * Purpose: Contains implementation of steps pertaining to AgentSearchResults page.
 *
 * @author Haris Saleem
 */

public class AgentSearchResultsPage {

    public void clickNationalityTabDropdown(WebDriver driver) {
        driver.findElement(By.xpath(AgentsSearchResultsPageLocators.nationalityDropDown)).click();
    }

    public void selectNationalityFromDropDown(WebDriver driver, String nationality) {
        String nationalityLocator = AgentsSearchResultsPageLocators.nationalityFromDropDown.replaceAll("NATIONALITY",nationality);
        driver.findElement(By.xpath(nationalityLocator)).click();
    }
}

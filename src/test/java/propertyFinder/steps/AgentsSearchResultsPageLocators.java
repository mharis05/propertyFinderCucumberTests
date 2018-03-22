package propertyFinder.steps;

/**
 * AgentSearchResultsPageLocators.java
 * Purpose: Contains locator definitions for Agent Search Results page.
 *
 * @author Haris Saleem
 */

public interface AgentsSearchResultsPageLocators {

    String nationalityDropDown = "(//div[contains(@class, 'searchform_column') and contains(@class ,'searchform_column-serp')])[3]";
    String nationalityFromDropDown = "(//div[contains(@class, 'searchform_column') and contains(@class ,'searchform_column-serp')])[3]//div[./text()='NATIONALITY']";
}
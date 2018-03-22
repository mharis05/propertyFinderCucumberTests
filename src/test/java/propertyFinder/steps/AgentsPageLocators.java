package propertyFinder.steps;

/**
 * AgentsPageLocators.java
 * Purpose: Contains locator definitions for Agents page.
 *
 * @author Haris Saleem
 */

public interface AgentsPageLocators {

    String languagesDropDown = ".//div[@class='searchform_column'][2]";
    String selectLanguage = ".//div[@class='searchform_column'][2]//div[./text()='LANGUAGE']";

    String nationalityDropDown = ".//div[@class='searchform_column'][3]";
    String selectNationality = ".//div[@class='searchform_column'][3]//div[./text()='NATIONALITY']";

    String findAgentsCount = ".//h1";
    String findAgentButton = ".//button[./text()='Find']";

    String firstAgent = ".//div[@class='tiles']/a[1]";
}

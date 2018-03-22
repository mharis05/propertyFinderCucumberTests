package propertyFinder.steps;

/**
 * AgentDetailsPageLocators.java
 * Purpose: Contains declaration of locators used on the Agent Details page.
 *
 * @author Haris Saleem
 */

public interface AgentDetailsPageLocators {

    String agentName = ".//h1";
    String agentPosition = ".//p[@class='bioinfo_position']";
    String agentNationality = ".//p[@class='table'][1]/span[2]";
    String agentLanguages = ".//p[@class='table'][2]/span[2]";
    String agentLicenseNum = ".//div[@class='pane_column']//span[./text()='License No.:']/following-sibling::span";
    String agentLinkedInURL = ".//div[@class='pane_column']//span[./text()='LinkedIn:']/following-sibling::span/a";
    String agentExperience = ".//div[@class='pane_column']//span[./text()='Experience since:']/following-sibling::span";
    String agentActiveListings = ".//div[@class='pane_column']//span[./text()='Active listings:']/following-sibling::span/a";
    String agentAboutMeTab = ".//a[@title='About me']";
    String agentAboutMeContent = ".//div[@data-qs-content='tab-about']";
    String agentPhoneButton = ".//a[@data-qs='phone-button']";
    String agentCompany = ".//div[@class='brokerthumbnail_text']/p[1]";

    String arabicLanguageSwitch = ".//header//a[@data-qs='language-selector']";


}

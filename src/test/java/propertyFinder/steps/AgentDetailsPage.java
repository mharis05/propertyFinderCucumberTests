package propertyFinder.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import propertyFinder.PropertyFinderWaits;

public class AgentDetailsPage {
    public String getAgentName(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentName)).getText();
    }

    public String getAgentNationality(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentNationality)).getText();
    }

    public String getAgentLicenseNum(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentLicenseNum)).getText();
    }

    public String getAgentAboutMe(WebDriver driver) {
        driver.findElement(By.xpath(AgentDetailsPageLocators.agentAboutMeTab)).click();
        PropertyFinderWaits.waitForSeconds(driver,5);
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentAboutMeContent)).getText();
    }

    public String getAgentPhoneNum(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentPhoneButton)).getAttribute("href");
    }

    public String getAgentCompanyName(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentCompany)).getText();
    }

    public String getAgentExperience(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentExperience)).getText();
    }

    public String getAgentActiveListings(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentActiveListings)).getText().trim();
    }

    public String getAgentLinkedInUrl(WebDriver driver) {
        return driver.findElement(By.xpath(AgentDetailsPageLocators.agentLinkedInURL)).getAttribute("href");
    }

    public void clickArabicLanguageSwitch(WebDriver driver) {
        driver.findElement(By.xpath(AgentDetailsPageLocators.arabicLanguageSwitch)).click();
    }
}

package propertyFinder.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentsPage {


    public void clickLanguagesDropdown(WebDriver driver) {
        driver.findElement(By.xpath(AgentsPageLocators.languagesDropDown)).click();
    }

    public void selectLanguageFromDropDown(WebDriver driver, String language1){
        // This replaces LANGUAGE substring with the provided language
        String languageLocator = AgentsPageLocators.selectLanguage.replaceAll("LANGUAGE",language1);
        driver.findElement(By.xpath(languageLocator)).click();
    }

    public int retrieveNumberOfResults(WebDriver driver) {

        WebElement lblLumberOfResults = driver.findElement(By.xpath(AgentsPageLocators.findAgentsCount));
        String countOfResults = lblLumberOfResults.getText();
        countOfResults = countOfResults.replaceAll("[^\\d.]", "");
        return Integer.parseInt(countOfResults);

    }

    public void clickFindAgentsButton(WebDriver driver) {
        driver.findElement(By.xpath(AgentsPageLocators.findAgentButton)).click();
    }

    public void clickNationalityDropdown(WebDriver driver) {
        driver.findElement(By.xpath(AgentsPageLocators.nationalityDropDown)).click();
    }

    public void selectNationalityFromDropDown(WebDriver driver, String nationality) {
        String nationalityLocator = AgentsPageLocators.selectNationality.replaceAll("NATIONALITY",nationality);
        driver.findElement(By.xpath(nationalityLocator)).click();
    }

    public void selectFirstAgent(WebDriver driver){
        driver.findElement(By.xpath(AgentsPageLocators.firstAgent)).click();
    }
}

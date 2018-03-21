package propertyFinder.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebElement dropDownSelection = null;

    public void selectFromPurchaseTypeDropDown(WebDriver driver, String purchaseType) {


        if (purchaseType.equalsIgnoreCase("Buy")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.purchaseTypeDropdownBuy));
        } else if (purchaseType.equalsIgnoreCase("Rent")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.purchaseTypeDropdownRent));
        } else if (purchaseType.equalsIgnoreCase("Commercial rent")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.purchaseTypeDropdownCommercialRent));
        }
        dropDownSelection.click();
        // We can do same for the other types
        // skipping the implementation to save time

    }

    public void clickPurchaseDropdown(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.purchaseTypeDropDown)).click();
    }

    public void clickPropertyTypeDropdown(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.propertyTypeDropDown)).click();
    }

    public void selectFromPropertyTypeDropdown(WebDriver driver, String propertyType) {

        if (propertyType.equalsIgnoreCase("Villa")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.propertyTypeDropdownVilla));
        } else if (propertyType.equalsIgnoreCase("Appartment")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.propertyTypeDropdownApartment));
        } else if (propertyType.equalsIgnoreCase("Duplex")) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.propertyTypeDropdownDuplex));
        }
        dropDownSelection.click();
        // We can do same for the other types
        // skipping the implementation to save time
    }

    public void clickMinBedsDropdown(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.minBedsDropDown)).click();
    }

    public void selectFromMinBedsDropDown(WebDriver driver, int minBeds) {

        if (minBeds == 1) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.minBedsDropDown1));
        } else if (minBeds == 3) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.minBedsDropDown3));
        }
        dropDownSelection.click();
        // We can do same for the other types
        // skipping the implementation to save time
    }

    public void selectFromMaxBedsDropDown(WebDriver driver, int maxBeds) {

        if (maxBeds == 1) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.maxBedsDropDown1));
        } else if (maxBeds == 7) {
            dropDownSelection = driver.findElement(By.xpath(HomePageLocators.maxBedsDropDown7));
        }
        dropDownSelection.click();
        // We can do same for the other types
        // skipping the implementation to save time
    }

    public void clickMaxBedsDropdown(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.maxBedsDropDown)).click();
    }

    public void enterLocationIntoSearchBox(WebDriver driver, String location) {
        WebElement searchInputBox = driver.findElement(By.xpath(HomePageLocators.searchInputBox));
        searchInputBox.sendKeys(location);
    }

    public void clickFindButton(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.searchButton)).click();
    }

    public void clickFindAgentsTab(WebDriver driver) {
        driver.findElement(By.xpath(HomePageLocators.findAgentsTab)).click();
    }

}

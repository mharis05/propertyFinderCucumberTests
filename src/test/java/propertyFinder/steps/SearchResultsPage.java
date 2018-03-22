package propertyFinder.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import propertyFinder.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * SearchResultsPage.java
 * Purpose: Contains implementation of steps pertaining to Search Results page.
 *
 * @author Haris Saleem
 */

public class SearchResultsPage {

    private List<WebElement> listOfPrices;
    private List<WebElement> listOfNames;
    Utils utils = new Utils();

    public void clickSortResultsDropDown(WebDriver driver) {
        driver.findElement(By.xpath(SearchResultsPageLocators.resultsSortingDropDown)).click();
    }

    public void selectFromSortResultsDropDown(WebDriver driver) {
        driver.findElement(By.xpath(SearchResultsPageLocators.resutsSoftingDropDownPriceHigh)).click();
    }

    public List<String> getAllPricesForResults(WebDriver driver) {
        listOfPrices = driver.findElements(By.xpath(SearchResultsPageLocators.getPricesOfAllListings));
        List<String> listingPrices = new ArrayList<String>();

        for(WebElement m: listOfPrices){
            listingPrices.add(m.getText());
        }

        return listingPrices;
    }

    public List<String> getAllNamesForResults(WebDriver driver) {
        listOfNames = driver.findElements(By.xpath(SearchResultsPageLocators.getNamesOfAllListings));
        List<String> listingNames = new ArrayList<String>();

        for(WebElement m: listOfNames){
            listingNames.add(m.getAttribute("title"));
        }

        return listingNames;
    }

}

package propertyFinder.steps;

/**
 * SearchResultsPageLocators.java
 * Purpose: Contains locator definitions for Property Search Results page.
 *
 * @author Haris Saleem
 */

public interface SearchResultsPageLocators {

    String resultsSortingDropDown = ".//button[@class='ms-choice']/span[contains(text(),'Featured')]";
    String resutsSoftingDropDownPriceLow = ".//div[@class='sort']/select[@name='search-order-by']//following-sibling::div[@class='ms-parent']/div[1]/ul/li[contains(text(),'Price (low)')]";
    String resutsSoftingDropDownPriceHigh = ".//div[@class='sort']/select[@name='search-order-by']//following-sibling::div[@class='ms-parent']/div[1]/ul/li[contains(text(),'Price (high)')]";

    String getPricesOfAllListings = "//span[@class=\"val\"]";
    String getNamesOfAllListings = ".//*[@class='property-content']/h2/a";
}

package propertyFinder.propertyFinderAssignment;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import propertyFinder.PropertyFinderWaits;
import propertyFinder.Utils;
import propertyFinder.steps.HomePage;
import propertyFinder.steps.SearchResultsPage;

import java.io.IOException;
import java.util.List;

public class SearchProperty extends BaseTest {

    private HomePage homepage = new HomePage();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();


    @When("^User selects to \"([^\"]*)\" property of type \"([^\"]*)\" in location \"([^\"]*)\" and sets Min Beds to (\\d+) and Max Beds to (\\d+)$")
    public void userSelectsToPropertyOfTypeAndSetsMinBedsToAndMaxBedsTo(String purchaseType, String propertyType, String location, int minBeds, int maxBeds) {

        //Click on the Purchase Type Dropdown
        homepage.clickPurchaseDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Make selection based on the provided purchase type
        homepage.selectFromPurchaseTypeDropDown(driver,purchaseType);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Click on the Property Type Dropdown
        homepage.clickPropertyTypeDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Make selection based on the provided property type
        homepage.selectFromPropertyTypeDropdown(driver, propertyType);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Click on the Min Beds drop down
        homepage.clickMinBedsDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Make selection based on the provided min beds value
        homepage.selectFromMinBedsDropDown(driver, minBeds);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Click on the Max Beds drop down
        homepage.clickMaxBedsDropdown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Make selection based on the provided max beds value
        homepage.selectFromMaxBedsDropDown(driver, maxBeds);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Enter Location into the Search box
        homepage.enterLocationIntoSearchBox(driver, location);
        PropertyFinderWaits.waitForSeconds(driver,5);

    }

    @And("^User clicks on FIND button$")
    public void userClicksOnFINDButton(){
        //Click on the Find button
        homepage.clickFindButton(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);
    }

    @And("^User sorts the results from Highest Price to Lowest$")
    public void userSortsTheResultsFromHighestPriceToLowest(){

        //Click Sorting DropDown
        searchResultsPage.clickSortResultsDropDown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        // Select High to Low from dropdown
        // Please note that we can parameterize this as well,
        // at this moment, since the requirement is to select just one value,
        // we are selecting only that in the called method.

        searchResultsPage.selectFromSortResultsDropDown(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

    }

    @Then("^Fetch all the prices of the listing and save it in a csv file$")
    public void fetchAllThePricesOfTheListingAndSaveItInACsvFile(){

        //Retrieve list of Prices of all Listings
        List<String> listOfPrices = searchResultsPage.getAllPricesForResults(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Retrieve list of Titles of all Listings
        List<String> listOfNames = searchResultsPage.getAllNamesForResults(driver);
        PropertyFinderWaits.waitForSeconds(driver,5);

        //Write both lists to a CVS File
        try {
            Utils.writeToCSV(listOfNames, listOfPrices);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

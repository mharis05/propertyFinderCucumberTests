package propertyFinder.steps;

public interface HomePageLocators {

    String purchaseTypeDropDown = ".//form[@id='search-form-property']//select[@name='c']/following-sibling::div[@class='ms-parent']/button";
    String purchaseTypeDropdownBuy = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Buy')]";
    String purchaseTypeDropdownRent = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Rent')]";
    String purchaseTypeDropdownCommercialRent = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Commercial rent')]";
    String purchaseTypeDropdownCommercialBuy = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Commercial buy')]";

    String propertyTypeDropDown = ".//*[@class='pure-control-group pure-u-1-1 pure-u-sm-1-2 pure-u-md-1-4 pure-push']";
    String propertyTypeDropdownVilla = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Villa')]";
    String propertyTypeDropdownApartment = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Apartment')]";
    String propertyTypeDropdownDuplex = ".//*[@class='ms-drop ']//ul/li[contains(text(),'Duplex')]";
    //More options can be added as needed

    String minBedsDropDown = ".//*[@class='pure-u-1-2']/select[@name='bf']/following-sibling::div[@class='ms-parent']";
    String maxBedsDropDown = ".//*[@class='pure-u-1-2']/select[@name='bt']/following-sibling::div[@class='ms-parent']";

    //In the following, only the required locators have been declared to save time,
    // we can create other XPaths in similar fashion as needed.

    String minBedsDropDown1 = ".//*[@class='pure-u-1-2']/select[@name='bf']/following-sibling::div[@class='ms-parent']//ul/li[contains(text(),'1 Bed')]";
    String minBedsDropDown3 = ".//*[@class='pure-u-1-2']/select[@name='bf']/following-sibling::div[@class='ms-parent']//ul/li[contains(text(),'3 Beds')]";

    String maxBedsDropDown1 = ".//*[@class='pure-u-1-2']/select[@name='bt']/following-sibling::div[@class='ms-parent']//ul/li[contains(text(),'1 Bed')]";
    String maxBedsDropDown7 = "//*[@class='pure-u-1-2']/select[@name='bt']/following-sibling::div[@class='ms-parent']//ul/li[contains(text(),'7 Beds')]";

    String searchInputBox = ".//input[@name='q']";
    String searchButton = ".//button[@type=\"submit\"]/div[@class='text'][contains(text(),'Find')]";

    String findAgentsTab = ".//a[@class='js-find-agent']";
}

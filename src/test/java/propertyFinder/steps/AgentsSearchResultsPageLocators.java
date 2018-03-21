package propertyFinder.steps;

public interface AgentsSearchResultsPageLocators {

    String nationalityDropDown = "(//div[contains(@class, 'searchform_column') and contains(@class ,'searchform_column-serp')])[3]";
    String nationalityFromDropDown = "(//div[contains(@class, 'searchform_column') and contains(@class ,'searchform_column-serp')])[3]//div[./text()='NATIONALITY']";
}
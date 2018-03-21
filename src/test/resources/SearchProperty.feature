@SearchProperty
Feature: Search Properties
  I want to search properties according to a specific criteria

  Background:
    Given Property Finder Homepage is Open for "qa"

  Scenario: Search for a VILLA based on location and Minimum and Maximum bedrooms criteria, sort
  the results on price low to high and export the results into a CSV file
    When User selects to "Buy" property of type "Villa" in location "The PEARL" and sets Min Beds to 3 and Max Beds to 7
    And User clicks on FIND button
    And User sorts the results from Highest Price to Lowest
    Then Fetch all the prices of the listing and save it in a csv file



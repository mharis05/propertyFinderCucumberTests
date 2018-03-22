@SearchAgents
Feature: Search Agents
  I want to search agents according to a specific criteria

  Background:
    Given Property Finder Homepage is Open for "ae"

  Scenario: Search for an Agent based on language preferences,
  retrieve the count, then further filter the results
  on location, retrieve count again and assert that
  result count has reduced.

    When User navigates to Find Agents page
    And User filters agents who speak "English", "Arabic" or "Hxindi"
    Then Retrieve the number of results for language
    And Filter Agents based in "India"
    And Retrieve the number of results for nationality
    And Assert that count of results has reduced

  Scenario: Capture Details of the first Agent listed on the Agents Page

    When User navigates to Find Agents page
    And User selects the first Agent on the page
    Then Capture First agent's details in a file named "agent.txt"
    And Capture a screenshot
    And Change page language to Arabic
    And Capture a screenshot



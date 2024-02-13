@smoke
Feature: F06_homeSliders | User could use the home slider
  Scenario: First slider is clickable on home page
    When User clicks on first slider
    Then User is directed to the first product's page


    Scenario: Second slider is clickable on home page
      When User clicks on second slider
      Then User is directed to the second product's page
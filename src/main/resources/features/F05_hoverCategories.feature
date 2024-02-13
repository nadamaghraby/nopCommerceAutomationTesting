@smoke
Feature: F05_hoverCategories | User could hover and select from categories
  Scenario: User can select from categories and subcategories
    When User hover on a random category and get their subcategories
    And User selects random subcategory, get the text, and clicks on it
    Then The subcategory title contains the page title

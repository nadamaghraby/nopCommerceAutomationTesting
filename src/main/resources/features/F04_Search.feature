@smoke
Feature: F04_Search | User can search for products
  Scenario Outline: User could search using product name
    When User goes to search bar
    And Type the product name "<productName>"
    Then Search shows relevant results to the product name "<productName>"
    Examples:
      | productName |
      | book |
      | laptop |
      | nike |


  Scenario Outline: User could search using serial number
    When User goes to search bar
    And Type the product serial number "<productSku>"
    Then Search shows relevant results to the product sku"<productSku>"
    Examples:
      | productSku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

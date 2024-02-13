@smoke
  Feature: F03_Currencies | User can choose currency
    Scenario: Euro symbol is shown on products when euro currency is selected
      When user selects euro currency
      Then Euro Symbol is shown on products
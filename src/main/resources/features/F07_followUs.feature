@smoke
  Feature: F07_followUs | User use the follow us logos
    Scenario: User opens facebook link
      When User clicks on facebook logo
      Then Page on Facebook "https://www.facebook.com/nopCommerce" is opened in a new tab

    Scenario: User opens twitter link
      When User clicks on twitter logo
      Then  Account on a twitter "https://twitter.com/nopCommerce" is opened in a new tab

    Scenario: User opens rss link
      When User clicks on rss logo
      Then The URL "https://demo.nopcommerce.com/new-online-store-is-open" is opened in a new tab

    Scenario: User opens youtube link
      When User clicks on youtube logo
      Then Channel on YouTube "https://www.youtube.com/user/nopCommerce" is opened in a new tab
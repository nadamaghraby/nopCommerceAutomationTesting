@smoke
  Feature: F08_Wishlist | User could add products to wishlist
    Scenario: User add product to wishlist successfully
      When User clicks on wishlist button ❤
      Then Product is added to wishlist successfully

      Scenario: User could see his wishlist
        When User clicks on wishlist button ❤
        And User clicks on wishlist tab
        Then There are products in wishlist
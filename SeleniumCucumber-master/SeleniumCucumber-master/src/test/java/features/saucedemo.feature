Feature: Complete Checkout Process

  Scenario: Adding Product to the cart

    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Sort Products using filter
    Then Add To Cart 2 Products
    Then Remove 1 Product
    Then Click on Checkout
    Then Click on Menubar
    Then Logout Application
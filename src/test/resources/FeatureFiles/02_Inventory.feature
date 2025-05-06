Feature: Test Inventory page

  Background: 
    Given User must be login with valid credentials
      | standard_user | secret_sauce |
    Given User is on Inventory page

  Scenario: Test for total product count
    When user get the current count of product
    Then Total product should match to 6

  Scenario: Test for Product details
    When User get the product details
    Then All product should be display

  Scenario: Test for Add product to Cart
    When User add the product to cart "Sauce Labs Bolt T-Shirt"
    Then Product should be added to the cart and open cart page

  #Scenario: Launch add to cart page
    #When user click on Cart option
    #Then Cart page should be open

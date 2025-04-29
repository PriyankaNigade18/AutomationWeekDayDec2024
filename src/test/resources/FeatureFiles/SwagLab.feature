Feature: Test Swaglab application

  Scenario: Test login with valid creadintials
    Given Open Swaglab application with url "https://www.saucedemo.com/"
    When I enter valid "standard_user" and  valid "secret_sauce"
    And I click on SwagLab login button
    Then I should navigate to Inventory page

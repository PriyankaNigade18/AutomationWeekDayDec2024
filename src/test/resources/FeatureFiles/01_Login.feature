Feature: Test SwagLab application for Login

  Background: 
    Given Open Swaglab application

  Scenario: Test for the title
    When User get the current title
    Then Title should be match "Swag Labs"

  Scenario: Test for login functionality with valid credentials
    When User enter valid username and password
    And user click on login button
    Then User should be login and  navigated to Inventory page

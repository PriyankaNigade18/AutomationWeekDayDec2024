Feature: Test CRM application

  Background: 
    Given Open CRM homepage

  Scenario: Test signIn link
    When link is displayed
    Then click on Link

  Scenario: Test Login Functionality
    When User click on signin link
    When user enter valid creadentials "test@gmail.com" and "test123"
    When user click on crm Submit button
    Then User should be navigated to customer page

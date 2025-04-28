Feature: Test Google application


Background:
Given launch Google application

  Scenario: Test Title of Google application homepage
    #Given launch Google application
    When I get the current title of the page
    Then title should match with expected home page title

  Scenario: Test google search with valid keyword
    #Given launch Google application
    When I enter valid keyword into search box
    Then I shuld get valid google search result

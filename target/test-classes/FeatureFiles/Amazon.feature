@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @homepage @smoketest
  Scenario: Test Homepage title
    When I get the current title of amazon home page
    Then title should match with home page

  @sellpage @regressiontest
  Scenario: Test Sell page title
    When I open Sell page
    When I get the current title of Sell page
    Then title should match with Sell page

  @mobilespage @regressiontest @ignore
  Scenario: Test Mobile page title
    When I open Mobile page
    When I get the current title of Mobile page
    Then title should match with Mobile page

  @fashionpage @regressiontest @ignore
  Scenario: Test Fashion page title
    When I open Fashion page
    When I get the current title of Fashion page
    Then title should match with Fashion page

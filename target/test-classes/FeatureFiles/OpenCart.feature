Feature: Test openCart application

  @register
  Scenario: Test Registeration process for new user
    Given Open Register application
    When user enter all required fields
      | fname  | lname  | email              | telephone | password | cpassword |
      | Suresh | Sharma | suresh25@gmail.com | 987766555 | test123  | test123   |
    When User click on yes radio button
    When User check the privacy policy checkbox
    When User click on Continue button
    Then User should be able to register successfully

  @login
  Scenario: Test for same register user login functionality
    Given Open Login page
    When User enter required login fields
      | suresh25@gmail.com | test123 |
    When User click on cart login button
    Then User should navigate account page

Feature: Test Data driven for Orangehrm

  Scenario Outline: Data driven testing for Combinational data
    Given Open Hrm app
    When User enter "<username>" and enter "<password>"
    When user click on hrm login button
    Then only for valid credentials user should be able to login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Rajat    | rajat123 |
      | Admin    | admin123 |
      | Shweta   | test123  |

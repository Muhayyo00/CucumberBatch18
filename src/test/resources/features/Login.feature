Feature: Login functionality
//Feature->should be the first line

  @sprint1 @nasima @poorna @regression @carlos @smoke
  Scenario: Valid admin login
    Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
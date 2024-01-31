Feature: Login functionality
//Feature->should be the first line

  Scenario: Valid admin login
    //in stead of Given/When/Then/And-> we can use * as well as a short cut
    Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
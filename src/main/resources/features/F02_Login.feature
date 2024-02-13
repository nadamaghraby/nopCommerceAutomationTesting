@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    When user goes to login page
    And user login with valid mail "test@example.com" and password "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    When user goes to login page
    And user login with invalid mail "nada@gmail.com" and password "9874365dd"
    And user press on login button
    Then user could not login to the system
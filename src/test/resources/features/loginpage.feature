
Feature: User Login

  Scenario: Valid user login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  Scenario: Invalid user login
    Given the user is on the login page
    When the user enters invalid credentials
    Then an error message should be displayed
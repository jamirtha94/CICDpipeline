
Feature: User Login
@Valid
  Scenario: Valid user login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
  @Invalid
  Scenario Outline: Invalid user login
    Given the user is on the login page
    When the user enters invalid "<username>" and "<password>"
    Then an "<error>" message should be displayed

    Examples:
      | username  | password    | error        |
      | invalid   | password    | Epic sadface |
      | invalid11 | password123 | Epic sadface |
    @Mouse
    Scenario: Mouse Action
      Given the user is on the login page
      When the user enters valid credentials
      Then user perform mouse action to click item
#      Then user perform mouse add item



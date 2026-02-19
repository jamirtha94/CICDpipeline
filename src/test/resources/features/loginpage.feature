
Feature: User Login
#  Background:
#    Given the user is on the login page
@Valid
  Scenario: Valid user login

   When the user enters valid credentials
    Then the user should be redirected to the dashboard
  @Invalid
  Scenario Outline: Invalid user login
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
  @Dynamic
  Scenario: Dynamic webpage handling
    Given user is on Amazon homepage
    When user searches for laptop
    Then search results should be displayed



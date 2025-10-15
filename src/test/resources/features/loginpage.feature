
Feature: User Login
@login
  Scenario: Valid user login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
  @first
  Scenario Outline: Invalid user login
    Given the user is on the login page
    When the user enters invalid "<username>" and "<password>"
    Then an "<error>" message should be displayed

    Examples:
      | username  | password    | error        |
      | invalid   | password    | Epic sadface |
      | invalid11 | password123 | Epic sadface |


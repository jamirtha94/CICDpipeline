Feature: Sample Feature
  @Example
Scenario: Purchase
Given the user clicks on Alert
@Example1
  Scenario: Window Handle
    Given The user is on login page

  @Example2
  Scenario: Dropdown
    Given the user clicks on drop down

  @link_count
  Scenario Outline: PNC link
    Given the user is on the "<url>"

    Examples:
      | url |
      | https://www.pnc.com/en/personal-banking.html |






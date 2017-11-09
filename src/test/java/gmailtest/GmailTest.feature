Feature: test for log in operation
  Scenario: Log in gmail.com
    Given open browser
    And go to page gmailcom
    When  enter login
    And enter Password
    Then browser close




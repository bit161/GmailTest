Feature: test for log in operation
  Scenario: Log in gmail.com
    Given open browser
    And go to page gmailcom
    When  enter login
    Then enter Password

  Scenario: Send letter
    Given click button compose
    When eneter the recipients
    And eneter the subject
    Then click send


Feature: test for log in operation
  Scenario: Log in gmail.com
    Given open browser
    And go to paga gmailcom
    When  enter login
    Then enter Password
  Scenario: Send letter
    Given click button compose
    And eneter the recipients
    When enter the subject using the virtual keyboard
    Then send the letter



    Then close browser
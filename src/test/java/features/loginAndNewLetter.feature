@login
Feature: test send letter
  Scenario: Send letter
    Given open gmail
    When click button compose
    And eneter the recipients
    And enter the subject using the virtual keyboard
    And click button send
    Then browser close

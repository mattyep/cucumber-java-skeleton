Feature: Test logout feature

  Scenario: logout
    Given I am authenticated
    When I click on logout
    Then I am logged out

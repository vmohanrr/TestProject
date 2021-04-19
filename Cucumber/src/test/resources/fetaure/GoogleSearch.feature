@google
Feature: Google search functionality

  Scenario: Check login with valid credentials
    Given Browser is open
    And User is in google search page
    When User enters a text in search
    And hit enter
    Then Search results will display


@CRMTest
Feature: Free CRM login feature

  Scenario: Free CRM login test scenario.
  
    Given user is in login page
    When Title of page is free CRM
    And User enters username and password
    And User clicks on login button
    Then User is on homepage

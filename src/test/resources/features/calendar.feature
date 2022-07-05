Feature: User should be able to display Calendar functionality.

  Background:
    Given User is on Agileprocrm url successfully

  @SCRUM-861
  Scenario: Verify that User can display 'My Calendar' function.
    Given HR User is on homepage
    When User click Calendar button
    Then User should be able to display My Calendar page


  Scenario: Verify that User can display 'My Calendar' function.
    Given Marketing User is on homepage
    When User click Calendar button
    Then User should be able to display My Calendar page


  Scenario: Verify that User can display 'My Calendar' function.
    Given Helpdesk User is on homepage
    When User click Calendar button
    Then User should be able to display My Calendar page


  @SCRUM-862
  Scenario: Verify that As an HR User can add an event on My Calendar.
    Given HR User is on homepage
    And User click Calendar button
    When User click ADD button
    And Fill event name as "Test" and date as "02/01/2023" and click All day checkbox and save the event
    Then User should be able to see event is created on the calendar


  @SCRUM-863
 Scenario: Verify that User can display Company Calendar function.
    Given HR User is on homepage
    When User click Calendar button
    And User click Company Calendar button
    Then User should be able to display Company Calendar page


  Scenario: Verify that User can display Company Calendar function.
    Given Marketing User is on homepage
    When User click Calendar button
    And User click Company Calendar button
    Then User should be able to display Company Calendar page


  Scenario: Verify that User can display Company Calendar function.
    Given Helpdesk User is on homepage
    When User click Calendar button
    And User click Company Calendar button
    Then User should be able to display Company Calendar page
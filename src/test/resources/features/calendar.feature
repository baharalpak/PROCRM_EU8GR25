Feature: User should be able to display Calendar functionality.

  Background:
    Given User is on Agileprocrm url successfully

  @SCRUM-861
  Scenario Outline: Verify that User can display 'My Calendar' function.
    Given "<User>" is on homepage
    When User click Calendar button
    Then User should be able to display My Calendar page

    Examples:
      | User      |
      | hr        |
      | marketing |
      | helpdesk  |


  @SCRUM-862
  Scenario Outline: Verify that As an HR User can add an event on My Calendar.
    Given HR User is on homepage
    And User click Calendar button
    When User click ADD button
    And Fill event name as "Test" and "<start date>" and "<end date>" click All day checkbox and save the event
    Then User should be able to see event is created on the calendar

    Examples:
      | start date | end date   |
      | 07/01/2022 | 07/02/2022 |
      | 07/15/2022 | 07/03/2022 |
      | 07/05/2022 | 07/14/2022 |
      | 07/16/2022 | 07/17/2022 |


  @SCRUM-863
  Scenario Outline: Verify that User can display Company Calendar function.
    Given "<User>" is on homepage
    When User click Calendar button
    And User click Company Calendar button
    Then User should be able to display Company Calendar page

    Examples:
      | User      |
      | hr        |
      | marketing |
      | helpdesk  |
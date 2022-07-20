@pollTab

Feature: User should be able to create a poll by clicking on Poll tab under Active Stream.
  Background: user is expected to be on Home Page

  Scenario Outline: User should be able to land on Poll Tab Under Activity Stream
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
    Then user should be able to see  text box to create a poll

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


    Scenario:  User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
      Given "<user>" user is on poll tap
      When User

Scenario: User should be able to attach link using the link button
Given "<user>" user is on poll tap
  When user click on link button
  And add a link to link box
  And clicks on save button
  Then User should be able to see the link in the text box.

  Scenario: User should be able to attach link and add mention using the link and add mention icon respectively.
  Scenario: User should be able to create and edit questions and answers.

  Scenario: User should be able to send a pool.

  #1. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  #2. User should be able to attach link by clicking on the link icon.
  #3. User should be able to add mention by clicking on the add mention icon.
  #4. User should be able to add questions and multiple answers.
  #5. User should be able to delete questions and multiple answers.
  #6. User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  #7. User should be able to send a poll. #/
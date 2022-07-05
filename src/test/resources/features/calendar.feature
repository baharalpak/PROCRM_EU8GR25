@smoke
Feature: User should be able to display Calendar functionality.

  Background:
   Given User is on Agileprocrm url successfully

  @SCRUM-861
  Scenario Outline: Verify that User can display 'My Calendar' function.
    When User enters "<username>" and "<password>"
    And  User click on Log In button
    And  User should land on home page
    And  User click "Calendar" button
    Then User verify displaying "My Calendar" function successfully

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |

  @SCRUM-862
  Scenario: Verify that As an HR User can add an event on My Calendar.
    When User enters username "hr1@cybertekschool.com" and  password "UserUser"
    And  User click on Log In button
    And  User should land on home page
    And  User click "Calendar" button
    And  User display "My Calendar" function
    And  User click "ADD" button
    And  User should be able to see "New Event" page
    Then Verify that User "SAVE(CTRL+ENTER)" the "New Event" on My Calendar page successfully


  @SCRUM-863
  Scenario Outline: Verify that User can display Company Calendar function.
    When User enters "<username>" and "<password>"
    And  User click on Log In button
    And  User should land on home page
    And  User click "Calendar" button
    Then User verify displaying "Company Calendar" function successfully

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |
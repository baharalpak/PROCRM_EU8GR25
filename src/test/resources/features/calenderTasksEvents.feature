@SCRUM-890
Feature: Calendar feature
  As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.

  Scenario: Hr User can add new event with specific information
    Given "HR" user is on Home Page.
    And User click Calendar button
    When User click ADD button
    And  enters below event details and SAVE
      | Event Name   | Important Test Event             |
      | Description  | MY_FIRST_DESCRIPTION_OF_BIRTHDAY |
      | Importance   | This event is important          |
      | Start Date   | 08/25/2022                       |
      | Start Time   | 10:00 am                         |
      | End Date     | 08/30/2022                       |
      | End Time     | 5:00 pm                          |
      | Repeat       | Yearly                           |
      | TimeZone     | (UTC +03:00) Europe/Athens       |
      | Location     | My office                        |
      | Attendees-1  | marketing1@cybertekschool.com    |
      | Attendees-2  | helpdesk1@cybertekschool.com     |
      | Color        | Pink                             |
      | Availability | Occupied                         |
    Then user verifies the new calendar event is displayed

  Scenario: HR user can create and important repeating event with certain location
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    * Edit event location as "Central Meeting Room"
    * User clicks Save
    Then verify user should be able create repeating event with certain location

  Scenario Outline: Verify that As an HR User can edit an event color on My Calendar.
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    And Edit event color as "<event color>"
    * User clicks Save
    Then Verify "<event color>" is displayed with updated information
    Examples:
      | event color |
      | navy blue   |

  Scenario Outline: Verify that As an HR User can edit privacy of the event on My Calendar.
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    * Edit "<privacy>"
    * User clicks Save
    Then HR User should be able to see the event as "private"
    But "Marketing" user can not see the event on his or her calendar
    Examples:
      | privacy       |
      | Private event |

  Scenario Outline: HR User can edit his or her availability.
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    * Edit "<availability>" as "private"
    * User clicks Save
    Then HR User can edit his or her availability.
    Examples:
      | availability |
      | private      |

  Scenario: HR user can add one more attendee by editing the event
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    * User add attendee
    * User clicks Save
    Then Verify that user should be able to add an attendee

  Scenario: HR user can delete attendee by editing the event
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    * User delete an attendee
    * User clicks Save
    Then Verify that user should be able to delete an attendee

  Scenario: Marketing user can display invitations by using "Filter and search" box
    Given "Marketing" user is on Home Page.
    And User click Calendar button
    When User click Filter and search
     * User click INVITATIONS
    Then Verify user should be able to display invitations by using "Filter and search" box

  Scenario: HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button.
    Given "HR" user is on homepage
    And User click Calendar button
    When User click Filter and search
    And Click I'M AN ORGANISER
    Then verify that user should be able to display the related events
  @selma
  Scenario: Helpdesk User can reset after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status".
    Given "Helpdesk" user is on homepage
    And User click Calendar button
    When User click Filter and search
    * User select Yes under event with participants menu and Invited under participant status
    * User click Search
    * User click Reset
    Then verify that user should be able to reset Filter and Search options

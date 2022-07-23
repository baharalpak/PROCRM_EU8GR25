@SCRUM-890
Feature: Calendar feature
  As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.

  @selma
  Scenario: Hr User can add event with specific information
    Given "HR" user is on Home Page.
    And User click Calendar button
    When User click ADD button
    And  enters below event details and SAVE
      | Description  | MY FIRST DESCRIPTION OF BIRTHDAY |
      | Importance   | This event is important          |
      | Start Date   | 08/25/2022                       |
      | Start Time   | 10:00 am                         |
      | End Date     | 08/30/2022                       |
      | End Time     | 5:00 pm                          |
      | Repeat       | Yearly                           |
      | TimeZone     | (UTC +03:00) Europe/Athens       |
      | Location     | Central Meeting Room             |
      | Attendees-1  | marketing1@cybertekschool.com    |
      | Attendees-2  | helpdesk1@cybertekschool.com     |
      | Color        | Pink                             |
      | Availability | Occupied                         |
    Then user verifies the new calendar event is displayed

  Scenario Outline: Verify that As an HR User can edit an event on My Calendar.
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    And Edit event name as "<event name>"
    * event color as "<event color>"
    * his or her availability as "<availability>"
    * repeat section as "<repeat>" and save the event
    Then User should be able to see event with updated information
    Examples:
      | event name    | event color | availability | repeat |
      | MY_TEST_EVENT | navy blue   | unsure       | daily  |

  Scenario Outline: HR User can edit the event's privacy as "Private event".
    Given "HR" user is on homepage
    And User click Calendar button
    When User click EDIT button
    And Edit event privacy as "<event privacy>"
    Then HR User should be able to see the event with updated information
    But "Marketing" user can not see the event on his or her calendar
    Examples:
      | event privacy |
      | private       |


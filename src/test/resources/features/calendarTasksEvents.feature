@SCRUM-890
Feature:Calendar feature
  As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
@wip
  Scenario: "Hr User" can add event with specific information
    Given HR User is on homepage
    And User click Calendar button
    When User click ADD button and enters below event details
      | Description  | "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"                             |
      | Importance   | This event is important                                        |
      | Start Date   | 25/08/2022                                                     |
      | End Date     | 30/08/2022                                                     |
      | Repeat       | Yearly                                                         |
      | TimeZone     | Europe/Athens                                                               |
      | Location     | Central Meeting Room                                           |
      | Attendees    | "marketing1@cybertekschool.com","helpdesk1@cybertekschool.com" |
      | Color        | Pink                                                           |
      | Availability | Occupied                                                       |
    Then user verifies the new calendar event is displayed
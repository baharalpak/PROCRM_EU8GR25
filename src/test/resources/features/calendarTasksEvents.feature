@SCRUM-890
Feature: Calendar feature
  As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.

  @selma
  Scenario: Hr User can add event with specific information
    Given "HR" user is on Home Page.
    And User click Calendar button
    When User click ADD button
    And  enters below event details
      | Description  | "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"                             |
      | Importance   | This event is important                                        |
      | Start Date   | 25/08/2022                                                     |
      | Start Time   | 10:00 am                                                       |
      | End Date     | 30/08/2022                                                     |
      | End Time     | 5:00 pm                                                        |
      | Repeat       | Yearly                                                         |
      | TimeZone     | (UTC +03:00) Europe/Athens                                                 |
      | Location     | Central Meeting Room                                           |
      | Attendees    | "marketing1@cybertekschool.com","helpdesk1@cybertekschool.com" |
      | Color        | Pink                                                           |
      | Availability | Occupied                                                       |
    Then user verifies the new calendar event is displayed
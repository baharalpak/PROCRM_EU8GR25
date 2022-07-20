Feature: Task Feature SCRUM_889
  As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
@Scrum889
  Scenario: 1.	HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And Enters below task details
      | priority | High Priority           |
      | title    | Test Case 5             |
      | deadline | Tomorrows Date          |
      | mention  | hr19@cybertekschool.com |
    And User clicks "Add Task" button.
    Then "HR" user should be able to display new task created on My Tasks Page

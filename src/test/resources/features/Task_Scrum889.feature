@SCRUM-933
Feature: Task Feature SCRUM_889
  As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
  @SCRUM-907
  Scenario: Verify that HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And Fills "task" details
      | priority | High Priority                  |
      | title    | Acceptance Criteria            |
      | body     | Daily Stand-up: 19.00CEST      |
      | deadline | Tomorrows Date                 |
      | mention  | marketing73@cybertekschool.com |
    And User clicks "Add Task" button.
    Then User should be able to display new task created on My Tasks Page
  @SCRUM-929
  Scenario: Verify that the user cannot create two identical tasks
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And Fills "task" details
      | priority | High Priority                  |
      | title    | Acceptance Criteria            |
      | body     | Daily Stand-up: 19.00CEST      |
      | deadline | Tomorrows Date                 |
      | mention  | marketing73@cybertekschool.com |
    And User clicks "Add Task" button.
    Then User can not create same task
  @SCRUM-908
  Scenario Outline: Verify that HR User can edit the task for adding time tracking,reminder to e-mail and add dependent tasks.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When "HR" user clicks on the last created task.
    And User clicks "Edit" button.
    * Edit task responsible as "<responsible>"
    * Edit task reminder as "<reminder>"
    * Edit task dependant as "<dependant>"
    * Edit task hours "<hours>"
    * Edit task minutes "<minutes>"
    * User clicks "Save Changes" button
    * User clicks "Close" button.
    Then User should be able to see edited task.
    Examples:
      | responsible              | reminder                | dependant   | hours | minutes |
      | alper@cybertekschool.com | One day before deadline | Test Case 5 | 2     | 30      |
  @SCRUM-909
  Scenario: Verify that Marketing User can add participants, observers and add checklist to already created task by editing.
    Given "Marketing" user is on Home Page.
    And User clicks on Tasks module.
    When "Marketing" user clicks on the last created task
    And User clicks "Edit" button.
    * Edit "task" details with  below specific information
      | participant | marketing1@cybertekschool.com |
      | observer    | hr2@cybertekschool.com        |
      | checklist1  | TEST1                         |
      | checklist2  | TEST2                         |
      | checklist3  | TEST3                         |
    * User clicks "Save Changes" button
    * User clicks "Close" button.
    Then User should be able to see edited task.
  @SCRUM-910
  Scenario: Verify that HR User can add one more responsible person by editing created task.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When "HR" user clicks on the last created task.
    And User clicks "Edit" button.
    * User clicks responsible person button and add one more responsible person
    * User clicks "Save Changes" button
    * User clicks "Close" button.
    Then User should be able to add more responsible people.
  @SCRUM-911
  Scenario: Verify that Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
    Given "Marketing" user is on Home Page.
    And User clicks plus button on Tasks module.
    * Fills "task" details
      | priority | High Priority           |
      | title    | Subtask                 |
      | body     | For marketing           |
      | deadline | Tomorrows Date          |
      | mention  | hr19@cybertekschool.com |
    * User add subtask as "Test Case"
    * User clicks "Add Task" button.
    Then User should be able to see new task created.
  @SCRUM-912
  Scenario: Verify that HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section and redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task Template" button under "New Task"
    And User clicks "ADD" button in the New Task Template
    * Fills "task" details below
      | priority    | High Priority                  |
      | responsible | him/herself                    |
      | title       | Test Case new Templates        |
      | deadline    | 5days 2 hours 15 minutes       |
      | mention     | marketing14@cybertekschool.com |
    * User clicks "CREATE TASK TEMPLATE" button
    * User clicks on Tasks module.
    * User clicks "New Task Template" button under "New Task"
    Then User should be able to redirected to "Task templates" page

  @SCRUM-913
  Scenario: Verify that HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User select last created task
    And User select "Delete" section under "SELECT ACTION" dropdown menu
    * User clicks "APPLY" button and "Continue" button
    Then User should be able to delete task.
  @SCRUM-930
  Scenario: Verify that Marketing User can edit the task by declaring himself/herself as responsible person
    Given "Marketing" user is on Home Page.
    And User clicks on Tasks module.
    When "Marketing" user clicks on the last created task
    And User clicks "Edit" button.
    * User declare himself herself "marketing73@cybertekschool.com"
    Then User should be able to declare himself herself as responsible person
  @SCRUM-931
  Scenario Outline: Verify that user can not create a new task without not fill in Task Name
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And User clicks "<priority>"
    * User types body as "<body>"
    * User types deadline as "<deadline>"
    * User mention as "<mention>"
    * User clicks "Add Task" button.
    Then User should see error message "The task name is not specified."

    Examples:
      | body                      | priority      | deadline       | mention                 |
      | Daily Stand-up: 19.00CEST | High Priority | Tomorrows Date | hr12@cybertekschool.com |
  @SCRUM-932
  Scenario Outline: Verify that user can not create a new task without deadline
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And User clicks "<priority>"
    * User types title as "<title>"
    * User mention as "<mention>"
    * User clicks "Add Task" button.
    Then User can not create new task  without deadline
    Examples:
      | priority      | title          | mention                 |
      | High Priority | Daily Stand-up | hr12@cybertekschool.com |

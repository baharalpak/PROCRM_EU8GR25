
Feature: Task Feature SCRUM_889
  As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.

  Scenario:    HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task" button.
    And Fills "task" details
      | priority | High Priority           |
      | title    | Test Case 5             |
      | deadline | Tomorrows Date          |
      | mention  | hr19@cybertekschool.com |
    And User clicks "Add Task" button.
    Then User should be able to display new task created on My Tasks Page

  Scenario: HR User can edit the task for adding time tracking.
  HR User can edit the task for adding reminder to e-mail.
  HR User can add dependent tasks by editing the already created task.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When "HR" user clicks on the last created task.
    And User clicks "Edit" button.
    * Edit "task" details with  below information
      | time hours     | 2                        |
      | time minutes   | 30                       |
      | responsible    | alper@cybertekschool.com |
      | reminder       | One day before deadline  |
      | dependant task | Dependant Task for test  |
    * User clicks "Sava Changes" button
    * User clicks "Close" button.
    Then User should be able to see edited task.


  Scenario: Marketing User can edit the task by declaring himself/herself as responsible person
  Marketing User can add participants and observers to already created task by editing.
  Marketing User can add checklist to an already created task by editing.
    Given "Marketing" user is on Home Page.
    And User clicks on Tasks module.
    When "Marketing" user clicks on the last created task
    And User clicks "Edit" button.
    * Edit "task" details with  below information
      | responsible | marketing73@cybertekschool.com |
      | participant | marketing1@cybertekschool.com  |
      | observer    | hr2@cybertekschool.com         |
      | checklist1  | TEST1                          |
      | checklist2  | TEST2                          |
      | checklist3  | TEST3                          |
    * User clicks "Sava Changes" button
    * User clicks "Close" button.
    Then User should be able to see edited task.

  Scenario: HR User can add one more responsible person by editing created task.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When "HR" user clicks on the last created task.
    And User clicks "Edit" button.
    And User clicks responsible person button and add one more responsible person
    Then User should be able to add more responsible people.

  Scenario: Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
    Given "HR" user is on Home Page.
    And User clicks plus button on Tasks module.
    And Fills "task" details
      | priority | High Priority           |
      | title    | Test Case 5             |
      | deadline | Tomorrows Date          |
      | mention  | hr19@cybertekschool.com |
      | subtask  | first created task      |
    And User clicks "Add Task" button.
    Then User should be able to see new task created.

  Scenario:HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
  HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User clicks "New Task Template" button.
    And User clicks "ADD" button.
    * Fills "task" details
      | priority    | High Priority                  |
      | responsible | him/herself                    |
      | title       | Test Case 5                    |
      | deadline    | 5days 2 hours 15 minutes       |
      | mention     | marketing19@cybertekschool.com |
    * User clicks "Add Task" button.
    * User clicks on Tasks module.
    * User clicks "New Task Template" button.
    Then User should be able to redirected to "Task templates" page

  @Scrum889
  Scenario: HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
    Given "HR" user is on Home Page.
    And User clicks on Tasks module.
    When User select last created task
    And User select "Delete" section under "SELECT ACTION" dropdown menu
    And User clicks "APPLY" button and "Continue" button
    Then User should be able to delete task.














Feature: SCRUM-575 - Tasks Feature.
#  SCRUM-875: Test Execution for SCRUM-575

  As a user I should be able to see All Tasks, Ongoing Tasks and Only HR user should be able to create a new task and edit tasks.
  Accounts are : HR, Helpdesk, Marketing.

  @SCRUM-734 @HR
  Scenario: HR user should be able to see the All Tasks.
    Given "HR" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "All" button.
    Then User should be able to display All Tasks.

  @SCRUM-735 @Marketing
  Scenario: Marketing user should be able to see the All Tasks.
    Given "Marketing" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "All" button.
    Then User should be able to display All Tasks.

  @SCRUM-736 @Helpdesk
  Scenario: Helpdesk user should be able to see the All Tasks.
    Given "Helpdesk" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "All" button.
    Then User should be able to display All Tasks.

  @SCRUM-737 @HR
  Scenario: HR user should be able to see Ongoing Tasks.
    Given "HR" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "Ongoing" button.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-738 @Marketing
  Scenario: Marketing user should be able to see Ongoing Tasks.
    Given "Marketing" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "Ongoing" button.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-739 @Helpdesk
  Scenario: Helpdesk user should be able to see Ongoing Tasks.
    Given "Helpdesk" user is on Home Page.
    When User clicks on Tasks module.
    And User clicks "Ongoing" button.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-864 @HR
  Scenario: HR user should be able to create a new task.
    Given "HR" user is on Home Page.
    Given User clicks on Tasks module.
    When User clicks "New Task" button.
    And User fills in Task Name which is mandatory field with "Test".
    And User clicks "Add Task" button.
    Then "HR" user should be able to display new task created on My Tasks Page.

  @SCRUM-865 @Helpdesk @negativeScenario
  Scenario: Helpdesk user CAN NOT BE ABLE TO create a new task.
    Given "Helpdesk" user is on Home Page.
    Given User clicks on Tasks module.
    When User clicks "New Task" button.
    And User fills in Task Name which is mandatory field with "Test".
    And User clicks "Add Task" button.
    Then "Helpdesk" user CAN NOT BE ABLE TO display new task created.

  @SCRUM-866 @Marketing @negativeScenario
  Scenario: Marketing user CAN NOT BE ABLE TO create a new task.
    Given "Marketing" user is on Home Page.
    Given User clicks on Tasks module.
    When User clicks "New Task" button.
    And User fills in Task Name which is mandatory field with "Test".
    And User clicks "Add Task" button.
    Then "Marketing" user CAN NOT BE ABLE TO display new task created.

  @SCRUM-867 @HR
  Scenario: HR user should be able to edit task.
    Given "HR" user is on Home Page.
    Given User clicks on Tasks module.
    When User clicks "New Task" button.
    And User fills in Task Name which is mandatory field with "Test".
    And User clicks "Add Task" button.
    And "HR" user clicks on the last created task.
    And User clicks "Edit" button.
    And "HR" user edits the Task Name as "Test 10" and clicks Save Changes button.
    And User clicks "Close" button.
    Then HR user should be able to see "Test 10" which is edited on My Tasks Page.



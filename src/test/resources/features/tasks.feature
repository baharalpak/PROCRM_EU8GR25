@wip
Feature: SCRUM-575 - Tasks Feature.

  As a user I should be able to see All Tasks, Ongoing Tasks and Only HR user should be able to create a new task and edit tasks.
  Accounts are : HR, Helpdesk, Marketing.

  @SCRUM-734 @HR
  Scenario: HR user should be able to see the All Tasks.
    Given HR user is on Home Page.
    When User clicks on Tasks module.
    Then User clicks All button on My Tasks Page.
    Then User should be able to display All Tasks.

  @SCRUM-736 @Helpdesk
  Scenario: Helpdesk user should be able to see the All Tasks.
    Given Helpdesk user is on Home Page.
    When User clicks on Tasks module.
    Then User clicks All button on My Tasks Page.
    Then User should be able to display All Tasks.

  @SCRUM-735 @Marketing
  Scenario: Marketing user should be able to see the All Tasks.
    Given Marketing user is on Home Page.
    When User clicks on Tasks module.
    Then User clicks All button on My Tasks Page.
    Then User should be able to display All Tasks.

  @SCRUM-737 @HR
  Scenario: HR user should be able to see Ongoing Tasks.
    Given HR user is on Home Page.
    When User clicks on Tasks module.
    And User clicks Ongoing button on My Tasks Page.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-739 @Helpdesk
  Scenario: Helpdesk user should be able to see Ongoing Tasks.
    Given Helpdesk user is on Home Page.
    When User clicks on Tasks module.
    And User clicks Ongoing button on My Tasks Page.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-738 @Marketing
  Scenario: Marketing user should be able to see Ongoing Tasks.
    Given Marketing user is on Home Page.
    When User clicks on Tasks module.
    And User clicks Ongoing button on My Tasks Page.
    Then User should be able to see Ongoing Tasks.

  @SCRUM-864 @HR
  Scenario: HR user should be able to create a new task.
    Given HR user is on My Tasks Page.
    When HR user clicks "New Task" button.
    And HR user fills in "Task Name" which is mandatory field with "Test".
    And HR user clicks "Add Tasks" button to create a new task.
    Then HR user should be able to display new task created on My Tasks Page.

  @SCRUM-865 @Helpdesk @negativeScenario
  Scenario: Helpdesk user CAN NOT BE ABLE TO create a new task.
    Given Helpdesk user is on My Tasks Page.
    When Helpdesk user clicks "New Task" button.
    And Helpdesk user fills in "Task Name" which is mandatory field with "Test".
    And Helpdesk user clicks "Add Tasks" button to create a new task.
    Then Helpdesk user CAN NOT BE ABLE TO display new task created.

  @SCRUM-866 @Marketing @negativeScenario
  Scenario: Marketing user CAN NOT BE ABLE TO create a new task.
    Given Marketing user is on My Tasks Page.
    When Marketing user clicks "New Task" button.
    And Marketing user fills in "Task Name" which is mandatory field with "Test".
    And Marketing user clicks "Add Tasks" button to create a new task.
    Then Marketing user CAN NOT BE ABLE TO display new task created.

  @SCRUM-867 @HR
  Scenario: HR user should be able to edit task.
    Given HR user is on My Tasks Page.
    When HR user clicks on the last created task .
    And HR user clicks "Edit" button.
    And HR user edits the Task Name as "Test 1" and clicks "Save Changes" button.
    And HR user clicks "Close" button.
    Then HR user should be able to see the saved changes on My Tasks Page.

  @SCRUM-868 @Helpdesk @negativeScenario
  Scenario: Helpdesk user CAN NOT BE ABLE TO edit task.
    Given Helpdesk user is on My Tasks Page.
    When Helpdesk user clicks on the last created task .
    And Helpdesk user clicks "Edit" button.
    Then Helpdesk user CAN NOT BE ABLE TO edit task.

  @SCRUM-869 @Marketing @negativeScenario
  Scenario: Marketing user CAN NOT BE ABLE TO edit task.
    Given Marketing user is on My Tasks Page.
    When Marketing user clicks on the last created task .
    And Marketing user clicks "Edit" button.
    Then Marketing user CAN NOT BE ABLE TO edit task.


Feature: Workgroups feature of ProCrm Application

  User Story: As  a user, I should be able to join groups

  Background: For the scenarios in the feature file, user is expected to be on home page
    Given user is logged in and on the  homepage

  Scenario: Joining workgroups
    When "user" clicks on workgroup module
    And "user" clicks on "workgroup"
    Then "user" clicks on join button to send request


  Scenario:  Being able to sort groups
    When "user" clicks on dropdown menu
    And "user"  can sort the groups in a demanded order provided in application
    Then "user" can see the sorted groups

  Scenario:  User can leave any joint groups
    When "user" clicks on group name
    And "user" sees a pop up window
    Then "user" clicks on revoke wokrgroup memebership request button to leave the group


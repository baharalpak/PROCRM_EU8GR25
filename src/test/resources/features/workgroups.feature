
Feature: Workgroups feature of ProCrm Application

  User Story: As  a user, I should be able to join groups

  Background: For the scenarios in the feature file, user is expected to be on home page


@work1
  Scenario Outline: Joining workgroups
    Given "<user>" user is on homepage
    When user clicks on workgroup module
    And user clicks on small join button
    And user clicks on sale
    Then user clicks on revoke workgroup membership request button to leave the group
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  Scenario Outline:  Being able to sort groups
    Given "<user>" user is on homepage
    When user clicks on workgroup module
    And user clicks sort by
    And user can sort the groups in a demanded order provided in application.
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  Scenario Outline:  User can leave any joint groups
    Given "<user>" user is on homepage
    When user clicks on workgroup module
    And user clicks on small join button
  When  user clicks on sale
    And user clicks on revoke workgroup membership request button to leave the group
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
Feature: Functions Under Employee Menu
  #As a user, I should be able to use functions under employee menu

  @Scrum-893
  Scenario Outline: Display company structure
    Given "<user>" user is on homepage
    When user clicks Employees button
    And user clicks Company Structure button
    Then user should see the Company Structure

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario: Add a department
    Given "HR" user is on homepage
    When user clicks Employees button
    And user clicks Company Structure button
    And user clicks ADD Department button
    And user types department name
    Then user clicks on ADD button

  Scenario Outline:Find employees
    Given "<user>" user is on homepage





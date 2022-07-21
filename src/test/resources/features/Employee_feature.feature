@CompanyStructure
Feature: Functionality of Employee Feature Application
  #As a user, I should be able display the company structure and telephone directory

  Scenario Outline: Display company structure
    Given "<user>" logs in home page
    When user clicks Employees button
    And user clicks Company Structure button
    Then  user should see the Company Structure
    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Display Telephone Directory
    Given "<user>" logs in home page
    When user clicks Employees button
    And user clicks Telephone Directory button
    Then user should see the telephone directory
    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |




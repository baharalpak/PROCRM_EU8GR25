Feature: Functions Under Employee Menu
  #As a user, I should be able to use functions under employee menu


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
  @Scrum-893
  Scenario: Add a department
    Given "HR" user is on homepage
    When user clicks Employees button
    And user clicks Company Structure button
    And user clicks ADD Department button
    And user types department name
    And user clicks add
    Then user can see the name of the newly created department

  @Scrum-893
  Scenario Outline:Find employees by search box
    Given "<user>" user is on homepage
    When user clicks Find Employees
    And user types "name of employee" in the search box
    Then user can see "name of employee" employee info displayed

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline:Can not type nothing to find employees
    When user clicks Find Employees
    And user types nothing in the search box
    And user click search button
    Then user can not see any employee info displayed

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  Scenario Outline:Find employees by search box
    Given "<user>" user is on homepage
    When user click Find Employees
    And  user clicks Search By Alphabet button
    And user clicks the letter "letter"
    Then user can see employee info

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  Scenario Outline:Can not type a special character to find employees
    When user clicks Find Employees
    And user types some "special characters" in the search box
    And user click search button
    Then user can not see any employee info displayed

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline: Export the employee list
    Given "<user>" user is on homepage
    When user clicks Find Employees
    And user clicks the more button
    And user clicks Export to Excel
    Then user download the file

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

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

  Scenario Outline: User send message to employee from the telephone directory
    Given "<user>" logs in home page
    Given there are two users in application as "<sender>" and "<receiver>"
    When "<sender>" send "date" to "<receiver>"
    And  "<receiver>" login
    Then verify that "<receiver>" gets "date"

    Examples:
      | sender            | receiver     |
      | James             | Nick Owhadi  |

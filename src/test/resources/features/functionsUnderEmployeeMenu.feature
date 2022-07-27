Feature: Functions Under Employee Menu
    #As a user, I should be able to use functions under employee menu
  @Scrum-893
  Scenario Outline: Display company structure
    Given "<user>" user is on homepage.
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
    Given "HR" user is on homepage.
    When user clicks Employees button
    And user clicks Company Structure button
    * user clicks ADD Department button
    * user types department name
    * user clicks add
    Then user can see the name of the newly created department

  @Scrum-893
  Scenario Outline:Find employees by search box
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types name of employee "James" in the search box
    Then user can see name of employee "James" employee info displayed

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline:Can not type nothing to find employees
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types wrong employee name "Jimi" in the search box
    * user click search button
    Then user can see this message "Your search did not match any employees."
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline:Find employees by Alphabet
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    *  user clicks Search By Alphabet button
    * user clicks the letter A
    Then user disable to see the result of input

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline:Can not type a special character to find employees
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types some "?!@" in the search box
    Then user can see this message "Your search did not match any employees."

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline: Export the employee list
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user clicks the more button
    * user clicks Export to Excel
    Then user download the file

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893 @a
  Scenario Outline: Display Telephone Directory
    Given "<user>" user is on homepage.
    When user clicks Employees button
    And user clicks Telephone Directory button
    Then user should see the telephone directory
    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |

  @Scrum-893
  Scenario Outline: User send message to employee from the telephone directory
    Given "HR" user is on homepage.
    When user clicks Employees button
    And user clicks Telephone Directory button
    * user find name of receiver as"<receiver>"
    * "<sender>" send "date" to "<receiver>"
    *  "<receiver>" login
    Then verify that "<receiver>" gets "date"

    Examples:
      | sender | receiver |
      | HR     | James    |


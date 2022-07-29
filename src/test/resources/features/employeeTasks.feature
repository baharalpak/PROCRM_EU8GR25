Feature: Functions Under Employee Menu
    #As a user, I should be able to use functions under employee menu
  @Scrum-893
  Scenario Outline: Display company structure
    Given "<user>" user is on homepage.
    When user clicks Employees button
    And user clicks Company Structure button
    Then Verify that user should see the Company Structure

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
    * user clicks ADD Department button.
    * user types department name
    * user clicks add
    Then Verify that user can see the name of the newly created department


  @Scrum-893
  Scenario: HR can not Add 2 departments with the same name(Negative)
    Given "HR" user is on homepage.
    When user clicks Employees button
    And user clicks Company Structure button
    * user clicks ADD Department button.
    * user types department name
    * user clicks add
    Then Verify that user can see this message "You do not allowed added two same department name."


  @Scrum-893
  Scenario Outline:Find employees by search box
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types name of employee "James" in the search box
    Then Verify that user can see name of employee "James" employee info displayed

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline:Find employees by search box (Negative)
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types wrong employee name "Jimi" in the search box
    Then Verify that user can see this message "Your search did not match any employees."
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
    * user clicks the letter "A"
    Then Verify that user disable to see the result of input

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline:Can not type a special character to find employees(Negative)
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Find Employees
    * user types some "?!@" in the search box
    Then Verify that user can see this message "Your search did not match any employees."

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
    Then Verify that user download the file

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @Scrum-893
  Scenario Outline: Display Telephone Directory
    Given "<user>" user is on homepage.
    When user clicks Employees button
    And user clicks Telephone Directory button
    Then Verify that user should see the telephone directory
    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |

  @Scrum-893
  Scenario Outline: User send message to employee from the telephone directory
    Given "<user>" user is on homepage.
    When user clicks Employees button
    And user clicks Telephone Directory button
    * user find name of receiver as "helpdesk1@cybertekschool.com"
    * user clicks "send message" button
    * user types "Hi helpdesk73" and send message
    Then verify that "<receiver>" gets "message"

    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |


  @Scrum-893
  Scenario Outline: User send message to employee from the telephone directory(Negative)
    Given "<user>" user is on homepage.
    When user clicks Employees button.
    And user clicks Telephone Directory button
    * user find name of receiver as "helpdesk10@cybertekschool.com"
    * user clicks "send message" button
    * user types "Hi helpdesk73" and send message "6" times
    Then verify that "<receiver>" gets an "Error message"

    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |



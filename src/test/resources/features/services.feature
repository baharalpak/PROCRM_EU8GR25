Feature: CRM services feature.

  #..... --> potential jira ticket number

  Scenario Outline: Hr, Helpesk and Marketing user can display 'My Courses'
    Given "<usertype>" user is on home page
    When User clicks on the services tab.
    And  User clicks on the training tab.
    And  User clicks on the my courses tab to see their courses
    Then "My Courses" should be displayed
  Examples:
    | usertype  |  |
    | hr        |  |
    | helpdesk  |  |
    | marketing |  |


  Scenario Outline: Hr, Helpesk and Marketing user can display 'Grade Book'
    Given "<usertype>" user is on home page
    When User clicks on the services tab.
    And  User clicks on the training tab.
    And  User clicks on the grade book tab to see their grades
    Then "Grade Book" should be displayed
    Examples:
      | usertype  |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |

  @wipmustafa
  Scenario Outline: Hr, Helpesk and Marketing user can edit their data under Student's Profile
    Given "<usertype>" user is on home page
    When User clicks on the services tab.
    And  User clicks on the training tab.
    And  User clicks on the profile tab.
    And  User edits the student profile and clicks on the save button
    Then Student's Profile data should be edited successfully
    Examples:
      | usertype  |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |






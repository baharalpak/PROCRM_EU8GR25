Feature: CRM services feature.

  #..... --> potential jira ticket number

  Scenario: Displaying my courses.
    Given User is on home page
    When User clicks on the services tab.
    And   User clicks on the training tab.
    Then  User clicks on the my courses tab to see his/her courses.

  Scenario: Displaying the grade book.
    Given User is on home page
    When User clicks on the services tab.
    And   User clicks on the training tab.
    Then  User clicks on the grade book tab to see his/her grades.

  Scenario: Editing the student profile.
    Given User is on home page
    When User clicks on the services tab.
    And   User clicks on the training tab.
    And   User clicks on the profile tab.
    Then  User edits the student profile and clicks on the save button.






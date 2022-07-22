Feature: Functionality of Employee Feature Application
  #As a user, I should be able display the company structure and telephone directory

  Background:
    Given user launch  the given url
  Scenario Outline: Display company structure
    When user enters "<username>" and "<password>"
    And  user click on login button
    Then user should land on home page
    And user clicks "Company Structure" button
    Then user verifies Page Title as "Company Structure"

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com | UserUser |


  Scenario Outline: Display Telephone Directory
    When user enters "<username>" and "<password>"
    And  user click on login button
    Then user should land on home page
    And user clicks "Telephone Directory" button
    Then user verifies Page Title as "Telephone Directory"

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com | UserUser |






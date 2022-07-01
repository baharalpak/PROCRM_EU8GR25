Feature: Login Functionality of Procrm

  As a user ,I should be able to login with valid credentials and land home page
  Accounts are: helpdesk, hr, marketing


  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user launch  the given url

  @pozitiveScenario
  Scenario Outline: Login as user

    When user enters "<username>" and "<password>"
    And  user click on login button
    Then user should land on home page
    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |


  @negativeScenario
  Scenario Outline: Login as user

    When user enters invalid "<username>" and "<password>"
    And  user click on login button
    Then user should not login on home page
    Examples:
      | username                     | password |
      | hr1@cybertekschool.com       | Userr    |
      | marketin1@cybertekschool.com | UserUser |
      | helbdesk1@cybertekschool.com | useruser |
      |                              |          |
      |                              | abcdf    |
      | wrongusername                |          |
      |                              | UserUser |
      | hr1@cybertekschool.com       |          |


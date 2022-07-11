@Drive
Feature:
  Background: user is expected to be on Home Page



  Scenario Outline:
    Given "<user>" user is on homepage
    When  click on Drive module.
    Then user should be able to see and access My Drive.
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |





  Scenario Outline:
    Given "<user>" user is on homepage
    When user click on Drive module.
    And user click on All Documents.
    Then user should be able to see All Documents.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |





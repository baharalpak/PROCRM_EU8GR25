@Drive
Feature:
  Background: user is expected to be on Home Page



  Scenario:
    Given HR user is on Home Page.
    When  click on Drive module.
    Then user should be able to see and access My Drive.


  Scenario:
    Given Marketing1 user is on Home Page.
    When  user click on Drive module.
    Then user should be able to see and access My Drive.

  Scenario:
    Given HelpDesk user is on Home Page.
        When  user click on Drive module.
    Then user should be able to see and access My Drive.

  Scenario:
    Given HR user is on Home Page.
    When user click on Drive module.
    And user click on All Documents.
    Then user should be able to see All Documents.

  Scenario:
    Given Marketing user is on Home Page.
    When  user click on Drive module.
    And user click on All Documents.
    Then user should be able to see All Documents.

  Scenario:
    Given HelpDesk user is on Home Page.
    When user click on Drive module.
    And user click on All Documents.
    Then user should be able to see All Documents.



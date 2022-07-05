Feature:
  Background: user is expecter to be on Home Page

    Given user is on Home Page.

  Scenario:
  When user click on Drive module.
    Then user should be able to see My Driver

    Scenario:
      Given user is on Driver module.
      Then user click on All Documents.
      Then user should be able to see All Documents.



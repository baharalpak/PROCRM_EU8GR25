@pollTab

Feature: User should be able to create a poll by clicking on Poll tab under Active Stream.
  Background: user is expected to be on Home Page

  Scenario Outline:User can display 'Contact Information' on My Profile
    Given "<user>" user is on homepage
    When user clicks on profile name
    And clicks on My Profile link from dropdown menu
    Then user should be able to see personal information under Contact Information

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
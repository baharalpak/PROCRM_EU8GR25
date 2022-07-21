Feature: SCRUM-897

  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the video URL.
    Given "<user>" user is on homepage
    When User fills "Message Title" with "New Message".
    And User clicks "MESSAGE" button.
    And User clicks "Insert video icon" button.
    And User fills "Video source box" with "video URL".
    Then User clicks "Save" button.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline: User should be able to create a quote by clicking on the Comma icon.
    Given "<user>" user is on homepage
    And User clicks "MESSAGE" button.
    And User clicks "Comma icon" button.
    And User fills "Quote box" with "quote input".
    Then User clicks "Save" button.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline: User should be able to add mention by clicking on the Add mention icon.
    Given "<user>" user is on homepage
    And User clicks "MESSAGE" button.
    And User clicks "Add mention icon" button.
    And User adds mentions below.
      | hr13@cybertekschool.com        |
      | hr91@cybertekschool.com        |
      | marketing67@cybertekschool.com |
      | helpdesk47@cybertekschool.com  |
      | helpdesk77@cybertekschool.com  |
    Then User clicks "Save" button.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |



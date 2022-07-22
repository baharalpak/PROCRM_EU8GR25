Feature: SCRUM-897

  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  @SCRUM-901
  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the YOUTUBE video URL.
    Given "<user>" user is on homepage
    When User clicks "MESSAGE" button.
    And User clicks "Insert video icon" button.
    And User fills "Video source box" with "YouTube video URL".
    And User clicks "Save" button.
    Then Verify that user can add video.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-902
  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the VIMEO video URL.
    Given "<user>" user is on homepage
    When User clicks "MESSAGE" button.
    And User clicks "Insert video icon" button.
    And User fills "Video source box" with "Vimeo video URL".
    And User clicks "Save" button.
    Then Verify that user can add video.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-903
  Scenario Outline: User should be able to create a quote by clicking on the Comma icon.
    Given "<user>" user is on homepage
    When User clicks "MESSAGE" button.
    And User clicks "Comma icon" button.
    And User fills "Quote box" with "quote input".
    And User clicks "Save" button.
    Then Verify that user can create quote.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-904
  Scenario Outline: User should be able to add mention by clicking on the Add mention icon.
    Given "<user>" user is on homepage
    When User clicks "MESSAGE" button.
    And User clicks "Add mention icon" button.
    And User adds mentions below.
      | hr13@cybertekschool.com        |
      | hr91@cybertekschool.com        |
      | marketing67@cybertekschool.com |
      | helpdesk47@cybertekschool.com  |
      | helpdesk77@cybertekschool.com  |
    And User clicks "Save" button.
    Then Verify that user can add mention.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-905
  Scenario Outline: User should be able to send a message.
    Given "<user>" user is on homepage
    When User clicks "MESSAGE" button.
    And User fills Message Title which is mandatory field with "New Message".
    And User clicks "Send" button.
    Then Verify that user can send a message.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |



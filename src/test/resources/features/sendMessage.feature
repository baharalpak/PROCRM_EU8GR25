Feature: SCRUM-897

  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  @SCRUM-901 @BUG @DONE
  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the YOUTUBE video URL.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Insert video icon.
    And User fills Video source box with "https://www.youtube.com/watch?v=H_XxH66lm3U".
    Then Verify that user can add video.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-902 @BUG @DONE
  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the VIMEO video URL.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Insert video icon.
    And User fills Video source box with "https://vimeo.com/259411563".
    Then Verify that user can add video.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-903 @DONE
  Scenario Outline: User should be able to create a quote by clicking on the Comma icon.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Comma icon.
    And User fills Quote box with a quote.
    And User clicks Send button.
    Then Verify that user can "create quote".

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-904 @DONE
  Scenario Outline: User should be able to add mention by clicking on the Add mention icon.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Add mention icon.
    And User fills Message Title which is mandatory field with a message title.
    And User clicks on Add more link.
    And User clicks Employees and Departments.
    And User adds mentions.
    And User clicks Send button.
    Then Verify that user can "add mention".

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  @SCRUM-905 @DONE
  Scenario Outline: User should be able to send a message.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User fills Message Title which is mandatory field with a message title.
    And User clicks Send button.
    Then Verify that user can "send a message".

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-906 @negative @DONE
  Scenario Outline: User CAN NOT send a message without filling mandatory fields.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Send button.
    Then Verify that user CAN NOT send a message.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-914
  Scenario Outline: User should be able to click on upload files icon to upload FILES from local disks.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Upload Files icon.
    And User uploads "THE FILE" to Upload files and images box.
    And User clicks Send button.
    Then Verify that user can upload the file.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-915
  Scenario Outline: User should be able to click on upload files icon to upload PICTURES from local disks.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Upload Files icon.
    And User uploads "THE PICTURE" to Upload files and images box.
    And User clicks Send button.
    Then Verify that user can upload the picture.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-916 @wipBahar @DONE
  Scenario Outline: User should be able to attach link by clicking on the link icon.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User clicks Link icon.
    And User attach the link to Link URL Box.
    And User clicks Save button.
    And User clicks Send button.
    Then Verify that user can "attach link".

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-917
  Scenario Outline: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    Given "<user>" user is on homepage
    When User clicks Message button.
    And User fills Message Title which is mandatory field with "New Message".
    And User clicks ADD MORE link on TO BOX.
    And User clicks Employees and Departments link.
    And User adds multiple users from selecting multiple contacts below.
      | hr1@cybertekschool.com         |
      | helpdesk19@cybertekschool.com  |
      | marketing37@cybertekschool.com |
      | hr83@cybertekschool.com        |
      | helpdesk31@cybertekschool.com  |
      | marketing59@cybertekschool.com |
      | Test1                          |
    And User clicks Close button.
    And User clicks Send button.
    Then Verify that user can add users.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
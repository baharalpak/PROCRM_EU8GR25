Feature: SCRUM-897

  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Scenario Outline: User should be able to click on upload files icon to upload files and pictures from local disks.
    Given "<user>" user is on homepage
    When "<user>" clicks on upload files icon

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
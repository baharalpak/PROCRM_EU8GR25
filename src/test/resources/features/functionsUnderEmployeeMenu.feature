Feature: Functions Under Employee Menu
  #As a user, I should be able to use functions under employee menu

  @Scrum-893
  Scenario Outline: Display company structure
    Given "<user>" user is on homepage

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
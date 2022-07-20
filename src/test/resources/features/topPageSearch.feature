@SCRUM-882
Feature: agileprocrm top page search feature

  As a user, when I am on the agileprocrm page should I be able to search whatever I write on search box
  Accounts are:hr,helpdesk,marketing

  @SCRUM-876
  Scenario Outline: User searches for a conversations
    Given "<user>" user is on homepage
    When user types "Conversations" in the agileprocrm search box and press enter
    Then user should see Conversations in the page
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-877
  Scenario Outline: User searches find related items to written keyword
    Given "HR" user is on homepage
    When user types following "<word>" in the agileprocrm search box and press enter
    Then related "<word>" is displayed
    Examples: search values we are going to be using in this scenario is a below
      | word           |
      | Test Value     |
      | Find Employee  |
      | Chat and Calls |

  @SCRUM-878
  Scenario Outline: User searches group
    Given "HR" user is on homepage
    When user types "<groupName>" in the agileprocrm search box and press enter
    Then user should see "<groupName>" in the page

    Examples:search values we are going to be using in this scenario is a below
      | groupName                 |
      | Soccer Team               |
      | Corporate Christmas Party |

  @SCRUM-879
  Scenario Outline: User can't search with non-related characters
    Given "HR" user is on homepage
    When user types non-related characters "<nonRelatedCharacters>" in the agileprocrm search box and press enter
    Then user should not see search result "<nonRelatedCharacters>"

    Examples: search values we are going to be using in this scenario is a below
      | nonRelatedCharacters |
      | :){%$                |
      | .&#€£                |
      | x!?/***y             |

  @SCRUM-880
  Scenario Outline: User can't find non-related topic with written keyword
    Given "HR" user is on homepage
    When user types non-related characters "<nonRelatedCharacters>" in the agileprocrm search box and press enter
    Then user should not see search result "<nonRelatedCharacters>"

    Examples: search values we are going to be using in this scenario is a below
      | nonRelatedCharacters |
      | kids                 |
      | cook                 |
      | shopping             |

  @SCRUM-881
  Scenario Outline:    User can't search without providing input
    Given "<user>" user is on homepage
    When user does not types anything
    Then user cannot search
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |





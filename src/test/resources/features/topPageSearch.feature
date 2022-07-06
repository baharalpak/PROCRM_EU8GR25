Feature: agileprocrm top page search feature

  As a user, when I am on the agileprocrm page should I be able to search whatever I write on search box
  Accounts are:hr,helpdesk,marketing


  Background: for the scenarios in the feature file ,user is expected to be on homepage

    Given "hr" user is on homepage


  Scenario: User searches for a conversations
    When user types "Conversations" in the agileprocrm search box and press enter
    Then user should see Conversations in the page

  @feature
  Scenario Outline: User searches find related items to written keyword
    When user types "<searchWord>" in the agileprocrm search box and press enter
    Then user should see "<expectedResult>" in the page

    Examples: search values we are going to be using in this scenario is a below
      | searchWord | expectedResult    |
      | test value | Test Value        |
      | employees  | Company Structure |
      | Chat       | Chat and Calls    |


  Scenario Outline: User searches group
    When user types "<groupName>" in the agileprocrm search box and press enter
    Then user should see "<groups>" in the page

    Examples:search values we are going to be using in this scenario is a below
      | groupName                 | groups                    |
      | Soccer Team               | Soccer team               |
      | Sales                     | Sales                     |
      | Corporate Christmas Party | Corporate Christmas Party |


  Scenario Outline:    User can't search with non-related characters
    When user types non-related characters "<nonRelatedCharacters>" in the agileprocrm search box and press enter
    Then user should not see search result "<searchResult>"

    Examples: search values we are going to be using in this scenario is a below
      | nonRelatedCharacters | searchResult |
      | kids                 | kids         |
      | cook                 | cook         |
      | Students             | Students     |
      | x!?/***y             | x!?/***y     |


  Scenario:    User can't search without providing input
    When user does not types anything
    Then user cannot search





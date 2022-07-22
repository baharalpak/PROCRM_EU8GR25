Feature: Interact With Employees on the Posts

  User Story:
  As a user, I should be able to interact with employees on the posts that I have access to.

  Users: Hr,Marketing,Helpdesk

  Background:
    Given User is on Agileprocrm url successfully
  @SCRUM-896
  Scenario Outline: Verify that User can make a comment on other employees' posts.
    Given "<user>" user is on homepage.
    When User click comment button other employees' posts
    And User write comment in the INPUT BOX "Thank you"
    And User click the send button at the INPUT BOX.
    Then User should see own comment on other employees' posts is applicable.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline: Verify that User can make a like on other employees' posts.
    Given "<user>" user is on homepage.
    When User click the like button at the INPUT BOX.
    Then User should see like on other employees' posts.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

    Scenario Outline: Verify that User can make a unfollow on other employees' posts.
      Given "<user>" user is on homepage.
      When User click the unfollow button at the INPUT BOX.
      Then User should see follow button on other employees' posts.

      Examples:
        | user      |
        | hr        |
        | marketing |
        | helpdesk  |

      Scenario Outline: Verify that User should be able to like on all other reviewers's comments.
        Given "<user>" user is on homepage.
        When User click the like button at the reviewers's comments.
        Then User should see like on other reviewers's comments.

        Examples:
          | user      |
          | hr        |
          | marketing |
          | helpdesk  |

  Scenario Outline: Verify that User should be able to comments on all other reviewers's comments.
    Given "<user>" user is on homepage.
    When User click the comments button at the reviewers's comments.
    And User write comment in the INPUT BOX "Thank you" at the reviewers's comments.
    And User click the send button at the INPUT BOX at the reviewers's comments.
    Then User should see own comment on other reviewers's comments is applicable.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

    Scenario Outline: Verify that User should be able to click on reviewers' name and visit their profiles.
      Given "<user>" user is on homepage.
      When User click the reviewers' name
      Then User should be able to see reviewers' profiles.

      Examples:
        | user      |
        | hr        |
        | marketing |
        | helpdesk  |

      Scenario Outline: Verify that User should be able to add others' posts to favorite by clicking on the Star icon.
        Given "<user>" user is on homepage.
        When User click the star icon.
        Then User should be able to see yellow star icon is applicable

        Examples:
          | user      |
          | hr        |
          | marketing |
          | helpdesk  |



Feature: Interact With Employees on the Posts

  User Story:
  As a user, I should be able to interact with employees on the posts that I have access to.

  Users: Hr,Marketing,Helpdesk

  Background:
    Given User is on Agileprocrm url successfully
@SCRUM-896
  Scenario Outline: User can make a comment on other employees' posts.
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

  Scenario:
    When User click the like button at the INPUT BOX.
    Then User should see like on other employees' posts.






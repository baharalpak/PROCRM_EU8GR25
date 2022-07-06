Feature: My Profile Feature

  As a user, I should be able to display and edit "Contact Information" on My Profile so that I can display my personal information

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

  Scenario Outline:User can edit 'Contact Information' on My Profile and see updated personal information after editing
    Given "<user>" user is on homepage
    When user clicks on profile name
    And clicks on My Profile link from dropdown menu
    And clicks on Edit profile button.
    And provide e-mail,Web site,ICQ,phone,fax,mobile,work phone,extension number,skype and clicks SAVE button
    Then user should be able to see updated information on the profile page

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario Outline:User cannot leave all the fields empty while editing profile
    Given "<user>" user is on homepage
    When user clicks on profile name
    When clicks on Edit profile button
    And leave all the fields empty and clicks SAVE button
    Then Error message is thrown and HR user can not edit profile

  Scenario: Marketing user cannot leave all the fields empty while editing profile
    Given marketing user click on My profile option
    When marketing user clicks on Edit profile button
    And leave all the fields empty and clicks SAVE button
    Then Error message is thrown and marketing user can not edit profile

  Scenario: Helpdesk user cannot leave all the fields empty while editing profile
    Given helpdesk user click on My profile option
    When helpdesk user clicks on Edit profile button
    And leave all the fields empty and clicks SAVE button
    Then Error message is thrown and helpdesk user can not edit profile
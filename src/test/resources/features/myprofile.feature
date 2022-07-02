@regression
Feature: My Profile Feature

  As a user, I should be able to display and edit "Contact Information" on My Profile so that I can display my personal information

  Scenario: HR user can display 'Contact Information' on My Profile
    Given HR user is on homepage
    When HR user clicks on profile name
    And clicks on My Profile link from dropdown menu
    Then HR user should be able to see personal information under Contact Information

  Scenario: Marketing user can display 'Contact Information' on My Profile
    Given marketing user is on homepage
    When marketing user clicks on profile name
    And clicks on My Profile link from dropdown menu
    Then marketing user should be able to see personal information under Contact Information

  Scenario: Helpdesk user can display 'Contact Information' on My Profile
    Given helpdesk is on homepage
    When helpdesk user clicks on profile name
    And clicks on My Profile link from dropdown menu
    Then helpdesk user should be able to see personal information under Contact Information

  Scenario: HR user can edit 'Contact Information' on My Profile and see updated personal information after editing
    Given HR user click on My profile option
    When HR user clicks on Edit profile button
    And provide e-mail,Web site,ICQ,phone,fax,mobile,work phone,extension number,skype and clicks SAVE button
    Then HR user should be able to see updated information on the profile page

  Scenario: Marketing user can edit 'Contact Information' on My Profile and see updated personal information after editing
    Given marketing user click on My profile option
    When marketing user clicks on Edit profile button
    And provide e-mail,Web site,ICQ,phone,fax,mobile,work phone,extension number,skype and clicks SAVE button
    Then marketing user should be able to see updated information on the profile page

  Scenario: Helpdesk user can edit 'Contact Information' on My Profile and see updated personal information after editing
    Given helpdesk user click on My profile option
    When helpdesk user clicks on Edit profile button
    And provide e-mail,Web site,ICQ,phone,fax,mobile,work phone,extension number,skype and clicks SAVE button
    Then helpdesk user should be able to see updated information on the profile page

  Scenario: HR user cannot leave all the fields empty while editing profile
    Given HR user click on My profile option
    When HR user clicks on Edit profile button
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
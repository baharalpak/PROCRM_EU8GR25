@SCRUM-895
Feature: Appreciation Feature
  As a user, I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream


  Scenario Outline: User uploads files and pictures from local disks
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User uploads a file and a picture
    Then the file and the picture should be uploaded successfully
    Examples:
      | user      |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |
  @wip
  Scenario Outline: User adds users from selecting multiple contacts from Employees and Departments contact lists
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds users from Employees and Departments contact lists
    Then users should be added successfully
    Examples:
      | user      |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |
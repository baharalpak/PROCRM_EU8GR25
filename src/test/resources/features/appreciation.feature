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


  Scenario Outline: User adds multiple contacts from Employees and Departments contact lists
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds users from Employees and Departments contact lists
    Then users should be added successfully
    Examples:
      | user      |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |


  Scenario Outline: User attaches link by clicking on the link icon
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds a text and the URL address of the link
    Then link should be attached successfully
    Examples:
      | user      |  |
      | hr        |  |
      | helpdesk  |  |
      | marketing |  |

    Scenario Outline: User inserts videos by entering the video URL.
      Given "<user>" user is on homepage
      When User clicks on appreciation tab
      Examples:
        | user      |  |
        | hr        |  |
        | helpdesk  |  |
        | marketing |  |
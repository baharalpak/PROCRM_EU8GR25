@SCRUM-895
Feature: Appreciation Feature
  As a user, I should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream

  @SCRUM-943 @DONE
  Scenario Outline: User uploads files and pictures from local disks
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User uploads a file and a picture
    Then the file and the picture should be uploaded successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-944
  Scenario Outline: User adds multiple contacts from Employees and Departments contact lists
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds below emails from Employees and Departments contact lists
      | helpdesk19@cybertekschool.com  |
      | marketing37@cybertekschool.com |
      | hr83@cybertekschool.com        |
    Then users should be added successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-945 @DONE
  Scenario Outline: User attaches link by clicking on the link icon
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds a text and the URL address of the link
    Then link should be attached successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-946 @BUG
  Scenario Outline: User inserts videos by entering the video URL
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds video URLs
    Then videos should be inserted successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-947 @DONE
  Scenario Outline:  User creates a quote by clicking on the Comma icon
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User creates a quote
    Then quotes should be created successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-948 @DONE
  Scenario Outline: User adds mention by clicking on the Add mention icon
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User adds below emails from Employees and Departments contact lists to mention
      | helpdesk35@cybertekschool.com |
      | marketing26@cybertekschool.com |
      | hr89@cybertekschool.com        |
    Then mentions should be created successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @SCRUM-949 @DONE
  Scenario Outline: User should be able to send appreciation
    Given "<user>" user is on homepage
    When User clicks on appreciation tab
    And User writes message as it is mandatory to send appreciation
    Then appreciation should be sent successfully
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |



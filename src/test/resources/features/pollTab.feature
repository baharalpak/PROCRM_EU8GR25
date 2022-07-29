@pollTab

Feature: User should be able to create a poll by clicking on Poll tab under Active Stream.
  Background: user is expected to be on Home Page
@pollTab0
  Scenario Outline: User should be able to land on Poll Tab Under Activity Stream
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
  When User clicks on add more
  And user click on Employees and Departments button
  And user add employees emails
    Then user should be able to see  text box to create a poll

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @pollTab1
  Scenario Outline: User should be able to land on Poll Tab Under Activity Stream
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
    When user click on link button
    And add a link to link box
    And add text to text box
    And clicks on save button
    Then User should be able to see the link in the text box.

    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
  @pollTab2
  Scenario Outline: User should be able to land on Poll Tab Under Activity Stream
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
    When user click on mention icon.
    And user click on Employees and Departments button
    And user mention employees from contact list
    Then User should be able to see the mention in the text box.


    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @pollTab3
  Scenario Outline: User should be able to land on Poll Tab Under Activity Stream
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
    When user click on Question text Box
    And User add a question
    And user edit the question
    When user click on answer1 text box
    And user add an answer to the text box
    And user edit the answer
    When user click on answer2 text box
    And user add an second answer to the text box
    And user edit the second answer


    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @pollTab4
  Scenario Outline: User should be able to delete questions and multiple answers, and user should be able select  the Allow multiple choice checkbox.
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu
       And User add a question
        And user add an answer to the text box
        And user add an second answer to the text box
    And user click on multiple choice checkbox.

    And user click on delete answerOne icon
    And user click on delete answerTwo icon
    And user click on delete question icon





    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @pollTab5
  Scenario Outline:  User should be able to send a pool.
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    When User clicks on add more
    And user click on Employees and Departments button
    And user add employees emails

    * User add a question
    * user add an answer to the text box
    * user add an second answer to the text box
    And user click on multiple choice checkbox.
    When user click on send button
    Then user should be able to send the message.
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  @pollN1
  Scenario Outline:  User should  NOT be able add same answer twice.
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    When User clicks on add more
    And user click on Employees and Departments button
    And user add employees emails

    * User add a question
    * user add an answer to the text box
    * user add an second answer as same one  to the text box
    * user click on multiple choice checkbox.
    When user click on send button
    Then user should NOT be able to send the message.



    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |
  @pollN2
  Scenario Outline:  User should  NOT be able to attach Text without a Link (Negative )
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    When User clicks on add more
    * user click on Employees and Departments button
    * user add employees emails

    When user click on link button
    And add a Text to link box
    * clicks on save button


    When user click on send button
    Then user should NOT be able to send the message.


    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  @pollTabN3

  Scenario Outline:  User should NOT be able to send a pool with invalid credential
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    When User clicks on add more
    And user click on Employees and Departments button
    And user add invalid employees emails


    When user click on send button
    Then user should be able to send the message.
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  @pollTabN4

  Scenario Outline:  User should NOT be able to send a pool without message title
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    When User clicks on add more
    And user click on Employees and Departments button
    And user add employees emails


    When user click on send button
    Then user should be able to send the message.
    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |


  @pollTabN5
  Scenario Outline: User should not be able to SEND A POLL without a question but with answers select  the Allow multiple choice checkbox.
    Given "<user>" user is on homepage
    When user clicks on Activity Stream
    And clicks on Poll tap  from top menu

    * user add an answer to the text box
    * user add an second answer to the text box
    * user click on multiple choice checkbox.

    When User clicks on add more
    And user click on Employees and Departments button
    * user add employees emails

    When user click on link button
    And add a Text to link box
    * clicks on save button


    When user click on send button
    Then user should be able to send the message.


    Examples:
      | user      |
      | hr        |
      | marketing |
      | helpdesk  |

  Scenario: User should be able to  add mention using add mention icon.

    Given "<user>" user is on homepage
    And user clicks on Activity Stream
    * clicks on Poll tap  from top menu
    When user click on mention icon.
    And user click on Employees and Departments button
    * user mention employees from contact list
    Then User should be able to see the mention in the text box.

  Scenario: User should be able to create and edit questions and answers.
    Given "<user>" user is on homepage
    And user clicks on Activity Stream
    * clicks on Poll tap  from top menu
    When user click on Question text Box
    And User add a question
    * user edit the question

    And user add an answer to the text box
    * user edit the answer

    And user add an second answer to the text box
    * user edit the second answer
Scenario:  User should be able to delete questions and multiple answers, and user should be able select  the Allow multiple choice checkbox.

  Given "<user>" user is on homepage
  And user clicks on Activity Stream
  * clicks on Poll tap  from top menu
  And user click on delete question icon
  Then the question will be deleted

  Then the answers should be deleted
  And user click on multiple choice checkbox.





  #1. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  #2. User should be able to attach link by clicking on the link icon.
  #3. User should be able to add mention by clicking on the add mention icon.
  #4. User should be able to add questions and multiple answers.
  #5. User should be able to delete questions and multiple answers.
  #6. User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  #7. User should be able to send a poll. #/
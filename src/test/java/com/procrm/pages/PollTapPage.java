package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.stream.Stream;

public class PollTapPage {
    public PollTapPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_live_feed\"]/a/span[1]")
    public WebElement Activity_StreamButton;


    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement PollTap;
    //Poll tap


    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-container\"]")
    public WebElement AddMore;
    ////*[@id="feed-add-post-destination-container"]
    //AddMore
    //Driver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperty("helpdeskUser"))

    @FindBy(xpath = "//*[contains(@id,\"destDepartmentTab\")]")
    public WebElement EmployeesDepartments;
    //      And user click on Employees and Departments
    ////*[@id="destDepartmentTab_destination8011297"]
    ////*[@id="destDepartmentTab_mention67270847"]
    ////*[contains(@id,"destDepartmentTab")]

    @FindBy(xpath = "//*[@title=\"Link\"]/i")
    ////*[@id="bx-b-link-blogPostForm"]/span/i
    public WebElement Link;
    //      And user click on link button
    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement AddLink;
    //And add a link to link box
    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-text\"]")
    public WebElement AddText;
    //And add a text to text box

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement SaveButton;
    //  And clicks on save button


    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement MentionButton;
    //Scenario: User should be able to  add mention using add mention icon.
    //

    //    When user click on mention icon.


    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[6]/div[1]/div[1]")
    public WebElement MentionEDButton;
    //    And user click on Employees and Departments button

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-input\"]")
    public WebElement addEmployee ;
    //    And user mention employees from contact list


    //    Then User should be able to see the mention in the text box.


    @FindBy(xpath = "//*[@id=\"question_0\"]")
    public WebElement questionTextBox;
// When user click on Question text Box and add a question

//    And User add a question

//    And user edit the question
//    When user click on 1 answer text box
    @FindBy(xpath = "//*[@id=\"answer_0__0_\"]")
    public WebElement answer1;
//    And user add an answer to the text box
//    And user edit the answer
//    When user click on 2 answer text box
@FindBy(xpath = "//*[@id=\"answer_0__1_\"]")
public WebElement answer2;

    @FindBy(xpath = "//*[@id=\"answer_0__2_\"]")
    public WebElement answer3;
//    And user add an second answer to the text box
//    And user edit the second answer

    @FindBy(xpath ="//*[@title=\"Delete question\"]" )
    public WebElement deleteQuestion;
    // And user click on delete question icon
    @FindBy(xpath = "//*[@for=\"answer_0__0_\"]")
    public WebElement deleteAnswer1;

    @FindBy(xpath = "//*[@for=\"answer_0__1_\"]")
    public WebElement deleteAnswer2;

    @FindBy(xpath = "//*[@for=\"answer_0__2_\"]")
    public WebElement deleteAnswer3;

    @FindBy(xpath = "//*[@id=\"multi_0\"]")
    public WebElement MultiCheckBox;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public  WebElement SendButton;

    @FindBy(xpath = "//*[@id=\"tasks-iframe-wrap\"]")
    public WebElement PollTextBox;
@FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[2]")
    public  WebElement deleteToBox;



}
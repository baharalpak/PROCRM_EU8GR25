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


    @FindBy(xpath = "//*[@id=\"undefined\"]")
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


}
package com.procrm.pages;

import com.procrm.step_definitions.SendMessage_StepDefinition;
import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {

    public SendMessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageTitleIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageTitleBox;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement lastCreatedMessage;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]//iframe")
    public WebElement videoInsertedIframe;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoSourceBox;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoNotAddedError;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement commaIcon;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement quoteBoxIframe;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteBox;

    @FindBy(xpath = "(//table[@class='blogquote'])[1]")
    public WebElement quoteTextElement;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartments;

//    @FindBy(xpath = "//div[.='hr13@cybertekschool.com']")
//    public WebElement mention1;
//
//    @FindBy(xpath = "//div[.='hr91@cybertekschool.com']")
//    public WebElement mention2;
//
//    @FindBy(xpath = "//div[.='marketing67@cybertekschool.com']")
//    public WebElement mention3;
//
//    @FindBy(xpath = "//div[.='helpdesk47@cybertekschool.com']")
//    public WebElement mention4;
//
//    @FindBy(xpath = "//div[.='helpdesk77@cybertekschool.com']")
//    public WebElement mention5;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[1]")
    public WebElement moreRecipientLink;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement mention1Text;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement mention2Text;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[3]")
    public WebElement mention3Text;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[4]")
    public WebElement mention4Text;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[5]")
    public WebElement mention5Text;


}
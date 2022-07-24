package com.procrm.pages;

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

    @FindBy(css = ".bx-editor-iframe")
    public WebElement messageTitleIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageTitleBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoIcon;

    @FindBy(css = ".bx-editor-iframe")
    public WebElement videoInsertIframe;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoSourceBox;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoNotAddedError;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;


}
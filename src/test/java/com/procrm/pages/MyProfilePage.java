package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement profileName;

    @FindBy(linkText = "My Profile")
    public WebElement myProfileLink;

    @FindBy(className = "user-profile-block-title")
    public WebElement contactInformation;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div/div[2]/a[1]")
    public WebElement editProfile;

    @FindBy(name = "EMAIL")
    public WebElement email;

    @FindBy(name = "PERSONAL_WWW")
    public WebElement webSite;

    @FindBy(name="PERSONAL_ICQ")
    public WebElement ICQ;

    @FindBy(name="PERSONAL_PHONE")
    public WebElement phoneNumber;

    @FindBy(name="PERSONAL_FAX")
    public WebElement faxNumber;

    @FindBy(name="PERSONAL_MOBILE")
    public WebElement mobileNumber;

    @FindBy(name = "WORK_PHONE")
    public WebElement workPhone;

    @FindBy(name="UF_PHONE_INNER")
    public WebElement extensionNumber;

    @FindBy(name = "UF_SKYPE")
    public WebElement skype;

    @FindBy(className = "webform-button-text")
    public WebElement saveButton;

    @FindBy(className = "content-edit-form-notice-error")
    public WebElement errorMessage_IncorrectEmail;
}
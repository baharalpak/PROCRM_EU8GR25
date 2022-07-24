package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class MyProfilePage {
    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement profileName;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[1]/span[2]")
    public WebElement myProfileLink;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[1]/td")
    public WebElement contactInformation;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div/div[2]/a[1]")
    public WebElement editProfile;

    @FindBy(name = "EMAIL")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[2]/td[2]/a")
    public WebElement emailTextBox;
    @FindBy(name = "PERSONAL_WWW")
    public WebElement webSite;

    @FindBy(name = "PERSONAL_ICQ")
    public WebElement ICQ;

    @FindBy(name = "PERSONAL_PHONE")
    public WebElement phoneNumber;
    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[5]/td[2]/a")
    public WebElement updatedPhoneNumber;
    @FindBy(name = "PERSONAL_FAX")
    public WebElement faxNumber;

    @FindBy(name = "PERSONAL_MOBILE")
    public WebElement mobileNumber;

    @FindBy(name = "WORK_PHONE")
    public WebElement workPhone;

    @FindBy(name = "UF_PHONE_INNER")
    public WebElement extensionNumber;

    @FindBy(name = "UF_SKYPE")
    public WebElement skype;

    @FindBy(className = "webform-button-text")
    public WebElement saveButton;

    @FindBy(className = "content-edit-form-notice-error")
    public WebElement errorMessage_IncorrectEmail;
}
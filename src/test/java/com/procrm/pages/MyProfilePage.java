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

    @FindBy(className = "user-profile-events-item user-profile-edit")
    public WebElement editProfile;
}

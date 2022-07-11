package com.procrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.procrm.utilities.Driver;

public class DriverPage {
    public DriverPage () {PageFactory.initElements(Driver.getDriver(),this);    }

        @FindBy(xpath = "(//span[@class='menu-item-link-text'])[5]")
        public WebElement DriverButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement AllDocumentsButton;
//"(//span[@class='main-buttons-item-text-title'])[2]"

}


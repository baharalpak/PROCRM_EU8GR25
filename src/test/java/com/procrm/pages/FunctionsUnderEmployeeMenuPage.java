package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionsUnderEmployeeMenuPage {

    public FunctionsUnderEmployeeMenuPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartment;

    @FindBy(id = "NAME")
    public WebElement addDepartmentName;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//a[@title='Department25']")
    public WebElement createdDepartmentName;


}

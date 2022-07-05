package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage{

    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Tasks']")
    public WebElement tasksModuleButton;

    @FindBy(xpath = "//span[.='All']")
    public WebElement allTabButton;

}

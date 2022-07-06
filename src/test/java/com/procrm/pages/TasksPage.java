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

    @FindBy(xpath = "(//input[@class='main-grid-checkbox main-grid-row-checkbox main-grid-check-all'])[1]")
    public WebElement allTasks;

    @FindBy(xpath = "//div[@class='main-ui-filter-search-square main-ui-filter-search-square-preset main-ui-square']")
    public WebElement inProgress;

}

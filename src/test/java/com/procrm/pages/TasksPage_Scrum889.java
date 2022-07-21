package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksPage_Scrum889 {
    public TasksPage_Scrum889() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriority;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskTitle;

    @FindBy(id = "bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement addMention;

    @FindBy(id = "destDepartmentTab_mention95440246")
    public WebElement addMentionEmployee;

    //@FindBy(xpath = "//input[@class='task-options-inp']")
    @FindBy(xpath = "(//span[@class='task-options-inp-container task-options-date t-empty'])[1]")
    public WebElement deadline;

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement iframeNewTask;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeBody;

    // @FindBy(xpath = "(//body[@class='vsc-initialized'])[1]")
    @FindBy(className = "vsc-initialized")
    public WebElement body;

    @FindBy(xpath = "(//span[@class='bx-calendar-button-text'])[1]")
    public WebElement calendar;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement timeHours;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement timeMinutes;

    @FindBy(xpath = "//a[@class='bx-calendar-form-arrow-top']")
    public WebElement PM;

    @FindBy(xpath = "(//span[@class='bx-finder-groupbox-content']/a)[7]")
    public WebElement addMentionPerson;

    @FindBy(xpath = "(((//tr[@class='main-grid-row main-grid-row-body'])//td)[3]/span/a)")
    public WebElement newTask;

    @FindBy(xpath = "(//tbody/tr/td/..//span/a)[18]")
    public WebElement edit;

    //@FindBy(xpath = "(//span[@class='task-additional-alt-promo-text'])[2]")
    @FindBy(xpath = "//div[@class='task-additional-alt-more']")
    public WebElement moreButton;

    @FindBy(xpath = "//input[@class='js-id-timeestimate-flag task-options-checkbox']")
    public WebElement timeTracking;

    @FindBy(xpath = "//input[@class='js-id-timeestimate-time js-id-timeestimate-hour task-options-inp']")
    public WebElement timeTrackingHours;

    @FindBy(xpath = "//input[@class='js-id-timeestimate-time js-id-timeestimate-minute task-options-inp']")
    public WebElement timeTrackingMinutes;

    //@FindBy(xpath = "//span[.='Add reminder']")
    @FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[9]")
    public WebElement reminder;

    @FindBy(xpath = "(//input[@class='task-popup-inp'])[1]")
    public WebElement reminderCalendar;

    @FindBy(xpath = "//span[@id='bx-component-scope-dependson-bitrix_tasks_task_default_1']")
    public WebElement dependantTasks;

    @FindBy(xpath = "//div[@class='finder-box-item finder-box-item-selected']")
    public WebElement addDependentTask;

    @FindBy(xpath = "(((//tr[@class='main-grid-row main-grid-row-body main-grid-row-checked'])//td)[3]/span/a)")
    public WebElement editCreatedTask;

    @FindBy(xpath = "(//span[.='Observers'])[1]")
    public WebElement observers;

    @FindBy(xpath = "(//span[@class='task-form-field-controls'])[4]")
    public WebElement addObservers;




}

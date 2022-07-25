package com.procrm.pages;

import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
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

    @FindBy(xpath = "(//div[@class='bx-finder-box-tabs']/a)[2]")
    public WebElement addMentionEmployees;

    @FindBy(css = "[class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesList;
    public WebElement addMentionMarketing(String mentionUserEmployee) {
        WebElement expectedMention=null;
        for (WebElement el : employeesList) {
            if(el.getText().equalsIgnoreCase(mentionUserEmployee))
            expectedMention=el;
        }
        return expectedMention;
    }

    @FindBy(css="[class='bx-calendar-cell']")
    public List<WebElement> calendarWeekDays;
    public WebElement addTaskDayCalendar(String taskDay){
        WebElement expectedDay=null;
        for (WebElement day : calendarWeekDays){
            if (day.getText().equalsIgnoreCase(taskDay))
                expectedDay=day;
        }
        return expectedDay;
    }

    //@FindBy(xpath = "//input[@class='task-options-inp']")
    @FindBy(xpath = "(//span[@class='task-options-inp-container task-options-date t-empty'])[1]")
    public WebElement deadline;

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement iframeNewTask;
    @FindBy(xpath = "(//span[@class='bx-calendar-button-text'])[1]")
    public WebElement calendar;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement timeHours;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement timeMinutes;

    @FindBy(xpath = "//a[@class='bx-calendar-form-arrow-top']")
    public WebElement PM;

    @FindBy(xpath = "(((//tr[@class='main-grid-row main-grid-row-body'])//td)[3]/span/a)")
    public WebElement newTask;

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

    @FindBy(xpath = "//span[@class='task-reminder-type-changer']/span/a")
    public WebElement reminderUsing;

    //@FindBy(xpath = "(//span[@class='menu-popup-item menu-popup-no-icon '])[2]")
    @FindBy(xpath = " (//div[@id='menu-popup-reminder-bitrix_tasks_task_default_1-form-form-transport']/div/div/div/span)[2]")
    public WebElement reminderDeadline;

    @FindBy(xpath = "//a[@title='Send e-mail message']")
    public WebElement sendEMail;

    @FindBy(xpath = "//div[@class='task-popup-label-add']")
    public WebElement addReminderWithEmail;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-link'])[1]")
    public WebElement changeResponsible;

    @FindBy(xpath = "(//input[@class='js-id-tdp-mem-sel-is-search js-id-network-selector-search task-form-field-search task-form-field-input'])[1]")
    public WebElement addResponsiblePeople;


    @FindBy(xpath = "(//input[@class='task-popup-inp'])[1]")
    public WebElement reminderCalendar;
    @FindBy(xpath = "(//span[@id='bx-component-scope-dependson-bitrix_tasks_task_default_1']/span)[2]")
    // @FindBy(xpath = "//span[@id='bx-component-scope-dependson-bitrix_tasks_task_default_1']")
    public WebElement dependantTasks;

    @FindBy(xpath = "//input[@id='dependson_task_input']")
    public WebElement dependentSearchBox;

    @FindBy(xpath = "((//div[@class='finder-box-tabs-content'])[3]/div/div/div)[1]")
    public WebElement selectDependent;

    @FindBy(xpath = "(//div[@class='popup-window-buttons'])[2]/span")
    public WebElement selectDependentButton;
    @FindBy(xpath = "(//span[@class='task-options-item-param'])[15]")
    public WebElement scrollDown;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-success']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//span[@title='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@class='finder-box-item finder-box-item-selected']")
    public WebElement addDependentTask;

    @FindBy(xpath = "(((//tr[@class='main-grid-row main-grid-row-body main-grid-row-checked'])//td)[3]/span/a)")
    public WebElement editCreatedTask;

    @FindBy(xpath = "(//span[.='Observers'])[1]")
    public WebElement observers;

    //@FindBy(xpath = "(//span[@class='task-form-field-controls'])[4]")
    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-auditor\"]/span[2]/a[2]")
    public WebElement addObservers;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-auditor\"]/span[2]/input")
    public WebElement sendObservers;

    @FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[2]")
    public WebElement participants;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-accomplice\"]/span[2]/a[2]")
    public WebElement addParticipants;

    @FindBy(xpath = "(//*[@id='bx-component-scope-bitrix_tasks_task_default_1-accomplice']/span)[2]/input")
    public WebElement sendParticipants;

    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[5]")
    public WebElement checklist;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[3]/span/span/input")
    public WebElement addChecklist;


    @FindBy(xpath = "(//tr[@class='main-grid-row main-grid-row-body'])[1]//td[3]/span/a")
    public WebElement lastCreated;

    ////////////////////////////
    //@FindBy(xpath = "((//tr[@class='main-grid-row main-grid-row-body'])//td)[1]/span/input")
    //@FindBy(xpath = "//*[@id=\"checkbox_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_663\"]")
    @FindBy(xpath = "//*[@id=\"TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table\"]/tbody/tr[6]/td[1]/span")
    public WebElement checkboxForDelete;

    @FindBy(xpath = "(//span[@class='main-grid-panel-content-title'])[1]")
    public WebElement scrollDownForDelete;

    //@FindBy(xpath = "//span[@id='action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N']")
    @FindBy(xpath = "//*[@id=\"action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control\"]")
    public WebElement selectOption;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control_menu\"]/div/div/span[13]/span[2]/span")
    public WebElement deleteUnderSelection;

    @FindBy(xpath = "//*[@id=\"apply_button_control\"]")
    public WebElement applyButtonForDelete;

    @FindBy(xpath = "//*[@id=\"task-confirm-popup\"]/div[2]/span[1]")
    public WebElement continueForDelete;

    //////////////
    @FindBy(xpath = "//*[@id=\"TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table\"]/tbody/tr[1]/td[3]/span/a")
    public WebElement lastCreatedForMarketing;

    //////
    @FindBy(xpath="//span[@id='tasks-popupMenuAdd']")
    public WebElement newTaskDropDown;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-popupMenuAdd\"]/div/div/a[2]/span[2]")
    public WebElement allTemplates;

    @FindBy(xpath = "//*[@id=\"content-table\"]/table/tbody/tr[1]/td/div/div[2]/div/div[4]/a")
    public WebElement addAllTemplatesNewTask;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_template_default_1-frame\"]/div[3]/div[1]/div[5]/div/div[1]/div/span[2]/span[3]")
    public WebElement addDeadlineMinutes;

    @FindBy(xpath = "//input[@class='js-id-task-template-edit-title']")
    public WebElement titleAllTemplatesNewTask;

    @FindBy(xpath = "//*[@id=\"bx-b-mention-task-form-bitrix_tasks_task_template_default_1\"]")
    public WebElement addMentionAllTemplates;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_template_default_1-frame\"]/div[3]/div[1]/div[5]/div/div[1]/div/span[2]/span[3]")
    public WebElement deadlineMinutes;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_template_default_1-frame\"]/div[3]/div[1]/div[5]/div/div[1]/div/span[1]/input[1]")
    public WebElement deadlineBox;

    @FindBy(xpath = "//button[@class='js-id-wfr-edit-form-submit webform-small-button webform-small-button-accept']")
    public WebElement createTaskTemplate;

    @FindBy(xpath = "//*[@id=\"pagetitle-menu\"]/div/div/a[1]")
    public WebElement backToList;

    @FindBy(xpath = "//*[@id=\"TASKS_TEMPLATES_FILTER_ID_table\"]/tbody/tr[1]/td[3]/span/a")
    public WebElement lastCreatedForNewTemplate;

    //////
    //@FindBy(xpath = "//a[@href='/company/personal/user/664/tasks/']")
    @FindBy(xpath = "//a[@title='Tasks']")
    public WebElement tasksModuleButton;

    //@FindBy(css="[class=menu-item-plus-icon]")
    @FindBy(xpath = "//span[@class='menu-item-plus']/a")
    public WebElement plusTaskButton;
    @FindBy(xpath = "//span[.='Subtask of']")
    public WebElement subTaskTitle;
    @FindBy(xpath = "//*[@id=\"bx-component-scope-parenttask-bitrix_tasks_task_default_1\"]/span[2]/a/span[1]")
    public WebElement addSubTask;

    @FindBy(xpath = "//input[@id='parenttask_task_input']")
    public WebElement searchSubTask;

    @FindBy(xpath = "//*[@id=\"parenttask_search\"]/div[1]/div[1]")
    public WebElement selectSearchSubTask;
    //@FindBy(className = "popup-window-button popup-window-button-accept")
    @FindBy(xpath = "//*[@id=\"task-item-set-popupparenttask\"]/div[2]/span[1]")
    public WebElement selectButton;

    //
    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-link'])[1]")
    public WebElement responsibleChange;


}

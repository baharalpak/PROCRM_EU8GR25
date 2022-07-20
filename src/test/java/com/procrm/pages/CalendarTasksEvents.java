package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarTasksEvents {
    public CalendarTasksEvents(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="name")
    public WebElement eventDescription;

    @FindBy(name="importance")
    public WebElement importanceCheckBox;

    @FindBy(name = "date_from")
    public WebElement startDate;

    @FindBy(name ="time_from")
    public WebElement startTime;

    @FindBy (name = "date_to")
    public WebElement endDate;

    @FindBy(name="time_to")
    public WebElement endTime;

    @FindBy(className="calendar-options-timezone-collapse-btn")
    public WebElement specifyTimeZone;

    @FindBy(name="tz_from")
    public WebElement eventStartTimeZoneDropdown;

    @FindBy(name="tz_to")
    public WebElement eventEndTimeZoneDropdown;

    @FindBy(name="EVENT_RRULE[FREQ]")
    public WebElement specifyRepeat;

    @FindBy(name="lo_cation")
    public WebElement locationDropdown;

}

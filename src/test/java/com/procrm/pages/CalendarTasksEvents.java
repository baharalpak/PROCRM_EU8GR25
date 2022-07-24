package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarTasksEvents {
    public CalendarTasksEvents() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "name")
    public WebElement eventDescription;

    @FindBy(name = "importance")
    public WebElement importanceCheckBox;

    @FindBy(name = "date_from")
    public WebElement startDate;

    @FindBy(name = "time_from")
    public WebElement startTime;

    @FindBy(name = "date_to")
    public WebElement endDate;

    @FindBy(name = "time_to")
    public WebElement endTime;

    @FindBy(className = "calendar-options-timezone-collapse-btn")
    public WebElement specifyTimeZone;

    @FindBy(name = "tz_from")
    public WebElement eventStartTimeZoneDropdown;

    @FindBy(name = "tz_to")
    public WebElement eventEndTimeZoneDropdown;

    @FindBy(name = "EVENT_RRULE[FREQ]")
    public WebElement specifyRepeat;

    @FindBy(name = "lo_cation")
    public WebElement locationDropdown;

    @FindBy(className = "feed-event-del-but")
    public WebElement attendeesDelButton;

    @FindBy(xpath = "(//div[@class='event-grid-dest-wrap']/span)[3]")
    public WebElement addPersonNmeGroupLink;

    @FindBy(xpath = "//div[@class='event-grid-dest-wrap']/span/input")
    public WebElement attendeesInput;

    @FindBy(className = "feed-add-destination-link")
    public WebElement addMoreAttendee;

    @FindBy(xpath = "//*[@class='calendar-additional-block']")
    public WebElement more;

    @FindBy(xpath = "//ul[@class='calendar-field-colorpicker']/li[@style='background-color: rgb(248, 115, 150);']")
    public WebElement pinkColour;

   // @FindBy(linkText = "(Cmd+Enter)")
    //public WebElement saveButton;

    @FindBy(xpath = "//div[@class='calendar-form-footer-container' and text()='Save']")
    public WebElement saveButton;

    @FindBy(className = "calendar-field-colorpicker-color-item-more-link")
    public WebElement moreEventColor;

    @FindBy(className = "main-color-picker-custom-action")
    public WebElement customColor;

    @FindBy(className = "main-color-picker-custom-textbox")
    public WebElement colorValueBox;

    @FindBy (xpath = "//*[@class='calendar-field calendar-field-select' and @name='accessibility']")
    public WebElement selectAvailability;

}
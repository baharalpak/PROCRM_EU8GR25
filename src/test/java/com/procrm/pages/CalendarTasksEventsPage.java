package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarTasksEventsPage {

    public CalendarTasksEventsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "name")
    public WebElement eventName;

    //@FindBy(css = "div[class*='calendar-field-container-textarea']")
    @FindBy(xpath = "//body[@style='min-height: 104px;']")
    public WebElement description;

    @FindBy(xpath = "//*[@class='bx-editor-iframe']")
    public WebElement iframe;

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

    @FindBy(xpath = "(//*[@class='main-ui-filter-sidebar-item-text'])[3]")
    public WebElement IamOrganizer;

    @FindBy(xpath = "(//*[@class='main-ui-filter-sidebar-item-text'])[1]")
    public WebElement invitations;
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

    @FindBy(xpath = "//div[contains(text(),'More')]")
    //@FindBy(xpath="//div[@class='calendar-additional-alt-more']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[@class='calendar-field-colorpicker-color-item-more-link']")
    public WebElement otherColorSelect;

    @FindBy(xpath = "(//span[@class='calendar-additional-alt-promo-text'])[3]")
    public WebElement moreEventColor;

    @FindBy(xpath = "//ul[@class='calendar-field-colorpicker']/li[@style='background-color: rgb(248, 115, 150);']")
    public WebElement pinkColour;

    //@FindBy(linkText = "(Cmd+Enter)")
    //public WebElement saveButton;

    @FindBy(xpath = "(//div[@class='calendar-form-footer-container']/button)[1]")
    public WebElement saveButton;

    //@FindBy( css = "[id*='save_cmd']")
    //public WebElement saveButton;

    //@FindBy(className = "calendar-field-colorpicker-color-item-more-link")
    //@FindBy(xpath = "//ul[@class='calendar-field-colorpicker']/li[@class='calendar-field-colorpicker-color-item-more-link']")

    // @FindBy(className = "calendar-field-colorpicker-color-item-more-link")
    // public WebElement otherEventColor;

    @FindBy(className = "main-color-picker-custom-action")
    public WebElement customColor;

    @FindBy(className = "main-color-picker-custom-textbox")
    public WebElement colorValueBox;

    @FindBy(xpath = "//*[@class='calendar-field calendar-field-select' and @name='accessibility']")
    public WebElement selectAvailability;

    @FindBy(xpath = "(//input[@tabindex='1'])[1]")
    public WebElement filterAndSearch;
////*[@id="calendar-filter-personal_search"]

    @FindBy(name = "private_event")
    public WebElement privacyCheckBox;

    @FindBy(xpath = "(//*[@class='calendar-right-block-event-info-btn'])[2]")
    public WebElement editButton;

    @FindBy(xpath = "(//*[@class='calendar-slider-view-buttonset-inner'])")
    public WebElement edit;

    @FindBy(xpath = "(//div[@class='calendar-timeline-stream-section']/div/div/div)[2]/span[2]")
    public WebElement searchedEvent;

    @FindBy(className = "calendar-counter-inner")
    public WebElement invitationsCounter;

    @FindBy(className = "main-ui-control main-ui-select")
    public WebElement eventWithParticipants;

    @FindBy(className = "//*[@id=\"popup-window-content-calendar-filter-personal_search_container\"]/div/div/div[3]/div[2]/div/button")
    public WebElement eventWithParticipantsSearch;
    @FindBy(className = "calendar-search-cancel")
    public WebElement reset;
}
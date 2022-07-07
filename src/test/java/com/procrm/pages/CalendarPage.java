package com.procrm.pages;

import com.procrm.utilities.Driver;
import io.cucumber.java.ca.Cal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends LoginPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[6]")
    public WebElement calendarButton;

    @FindBy(className = "ui-btn-main")
    public WebElement addButton;

    @FindBy(name = "name")
    public WebElement eventNameBox;

    @FindBy(name = "date_from")
    public WebElement dateFrom;

    @FindBy(name = "date_to")
    public WebElement dateTo;


    @FindBy(name = "skip_time")
    public WebElement allDayBox;

    @FindBy(xpath = "//span[.='(Ctrl+Enter)']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Company Calendar']")
    public WebElement companyCalendarButton;






}

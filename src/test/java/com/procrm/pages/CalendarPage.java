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

    @FindBy(id = "calendar_slider_15039_entry_name")
    public WebElement eventNameBox;

    @FindBy(id = "calendar_slider_15039_date_from")
    public WebElement dateBox;

    @FindBy(id = "calendar_slider_15039_date_full_day")
    public WebElement allDayBox;

    @FindBy(id = "calendar_slider_15039_save_cmd")
    public WebElement saveButton;






}

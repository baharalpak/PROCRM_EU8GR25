package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.stream.Stream;

public class PollTapPage {
    public PollTapPage () {PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_live_feed\"]/a/span[1]")
    public WebElement Activity_StreamButton;


    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement PollTap;
    //Poll tap


    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-input\"]")
    public WebElement AddMore;
    //AddMore
    //Driver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperty("helpdeskUser"))

    @FindBy(xpath = " ")
    public WebElement EmployeesDepartments;
    //      And user click on Employees and Departments
}

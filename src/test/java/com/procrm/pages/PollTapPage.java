package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.stream.Stream;

public class PollTapPage {
    public PollTapPage () {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = " ")
    public WebElement Activity_StreamButton;


    @FindBy(xpath = " ")
    public WebElement PollTap;
    //Poll tap


    @FindBy(xpath = " ")
    public WebElement AddMore;
    //AddMore

    @FindBy(xpath = " ")
    public WebElement EmployeesDepartments;
    //      And user click on Employees and Departments
}

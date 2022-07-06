package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {

    public ServicesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Services']/span")
    public WebElement servicesTab;

    @FindBy(xpath = "//a/span[contains(.,'Training')]")
    public WebElement trainingTab;

    @FindBy(xpath = "//a/span[contains(.,'My Courses')]")
    public WebElement myCourses;

    @FindBy(className = "pagetitle-item")
    private WebElement myCoursesPageTitle;

    @FindBy(xpath = "//tr/th[text()='Course']")
    private WebElement thCourse;

    @FindBy(xpath = "//tr/th[text()='Name']")
    private WebElement thName;


    public boolean isCourseReportTitleDisplayed()
    {
        boolean flag=false;
        String pageTitle = myCoursesPageTitle.getText();
        if(myCoursesPageTitle.isDisplayed() && pageTitle.contains("Course report"))
        {flag = true;}
        return flag;
    }
    public boolean isCoursesTableDisplayed()
    {
        boolean flag=false;
        if(thCourse.isDisplayed() && thName.isDisplayed() )
        {flag = true;}
        return flag;
    }
}

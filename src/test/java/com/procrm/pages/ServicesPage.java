package com.procrm.pages;

import com.github.javafaker.Faker;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicesPage {


    public ServicesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();
    public String randomEmailAddress;

    @FindBy(xpath = "//*[@title='Services']/span")
    public WebElement servicesTab;

    @FindBy(xpath = "//a/span[contains(.,'Training')]")
    public WebElement trainingTab;

    @FindBy(className = "pagetitle-item")
    private WebElement pageTitle;

    @FindBy(xpath = "//*[@name='save']")
    public WebElement btnSave;

    //My Courses
    @FindBy(xpath = "//a/span[contains(.,'My Courses')]")
    public WebElement myCourses;

    @FindBy(xpath = "//tr/th[text()='Course']")
    private WebElement thCourse;

    @FindBy(xpath = "//tr/th[text()='Name']")
    private WebElement thName;

    //Grade Book
    @FindBy(xpath = "//span[.='Grade Book']")
    public WebElement gradeBook;

    @FindBy(xpath = "//tr/th[text()='Last score']")
    private WebElement thLastScore;

    @FindBy(xpath = "//tr/th[text()='Passed']")
    private WebElement thPassed;

    @FindBy(xpath = "//tr/th[text()='Attempts']")
    private WebElement thAttempts;

    //Profile
    //Profile - Personal Data
    @FindBy(xpath = "//a/span[contains(.,'Profile')]")
    public WebElement profile;

    @FindBy(name = "NAME")
    public WebElement inputFirstName;

    @FindBy(name = "LAST_NAME")
    public WebElement inputLastName;

    @FindBy(name = "EMAIL")
    public WebElement inputEmail;

    @FindBy(name = "PERSONAL_WWW")
    public WebElement inputWebsite;

    @FindBy(name = "PERSONAL_ICQ")
    public WebElement inputICQ;

    //Profile - Profile Setting
    @FindBy(name = "RESUME")
    public WebElement inputResume;

    @FindBy(name = "PUBLIC_PROFILE")
    public WebElement chkPublicProfile;

    //Profile - Postal Address
    @FindBy(name = "PERSONAL_COUNTRY")
    public WebElement ddCountry;

    @FindBy(xpath = "//select/option[.='United Kingdom']")
    public WebElement ddCountry_UK;

    @FindBy(name = "PERSONAL_ZIP")
    public WebElement inputZipCode;


    //METHODS
    public String courseReportPageTitle() {
        return pageTitle.getText();
    }

    public boolean isCoursesTableDisplayed() {
        boolean flag = false;
        if (thCourse.isDisplayed() && thName.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public String testResultsPageTitle() {
        return pageTitle.getText();
    }

    public boolean isGradeBookTableDisplayed() {
        boolean flag = false;
        if (thCourse.isDisplayed() && thLastScore.isDisplayed() && thPassed.isDisplayed() && thAttempts.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public void editPersonalData() {

        randomEmailAddress = faker.internet().emailAddress();

        inputFirstName.clear();
        inputFirstName.sendKeys("Mustafa");
        inputLastName.clear();
        inputLastName.sendKeys("Y");
        inputEmail.clear();
        inputEmail.sendKeys(randomEmailAddress);
        inputWebsite.clear();
        inputWebsite.sendKeys("www.xxxxx.com");
        inputICQ.clear();
        inputICQ.sendKeys("123");
        BrowserUtilities.sleep(2);
    }

    public void editProfileSetting() {
        if (!chkPublicProfile.isSelected()) {
            chkPublicProfile.click();
        }

        inputResume.clear();
        inputResume.sendKeys("MY RESUME");
        BrowserUtilities.sleep(2);
    }

    public void editPostalAddress() {
        ddCountry.click();
        ddCountry_UK.click();
        inputZipCode.clear();
        inputZipCode.sendKeys("AA12 3BC");
        BrowserUtilities.sleep(2);
    }

    public void saveProfileChanges() {
        btnSave.click();
        BrowserUtilities.sleep(2);
    }

    public Map<String, String> retrievePersonalData() {
        HashMap hm = new HashMap();
        // hm.put("FirstName",inputFirstName.getText());
        hm.put("FirstName", inputFirstName.getAttribute("value"));
        hm.put("LastName", inputLastName.getAttribute("value"));
        hm.put("Email", inputEmail.getAttribute("value"));
        hm.put("Website", inputWebsite.getAttribute("value"));
        hm.put("ICQ", inputICQ.getAttribute("value"));
        return hm;
    }

    public Map<String, String> retrievePostalAddress() {
        HashMap hm = new HashMap();
        Select select = new Select(ddCountry);

        hm.put("Country", select.getFirstSelectedOption().getText());
        hm.put("ZipCode", inputZipCode.getAttribute("value"));
        return hm;
    }
}

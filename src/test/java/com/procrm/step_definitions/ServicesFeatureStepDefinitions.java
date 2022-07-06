package com.procrm.step_definitions;

import com.procrm.pages.ServicesPage;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.procrm.pages.BasePage;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Locale;

public class ServicesFeatureStepDefinitions {

    ServicesPage servicesPage = new ServicesPage();
    @Given("{string} user is on home page")
    public void user_is_on_home_page(String userType) {
        if(userType.toLowerCase().equals("marketing"))
        {BasePage.loginAsMarketing();}
        else if(userType.toLowerCase().equals("helpdesk"))
        {BasePage.loginAsHelpDesk();}
        else
        {BasePage.loginAsHR();}
    }
    @When("User clicks on the services tab.")
    public void user_clicks_on_the_services_tab() {
        servicesPage.servicesTab.click();
        BrowserUtilities.sleep(3);
    }
    @When("User clicks on the training tab.")
    public void user_clicks_on_the_training_tab() {
        servicesPage.trainingTab.click();
        BrowserUtilities.sleep(2);
    }
    @When("User clicks on the my courses tab to see their courses")
    public void user_clicks_on_the_my_courses_tab_to_see_their_courses() {
        servicesPage.myCourses.click();
        BrowserUtilities.sleep(2);
    }
    @Then("{string} should be displayed")
    public void should_be_displayed(String str) {
        switch (str) {
            case "My Courses":
                Assert.assertEquals("Course report",servicesPage.courseReportPageTitle());
                Assert.assertTrue(servicesPage.isCoursesTableDisplayed());
                break;
            case "Grade Book":
                Assert.assertEquals("Test results",servicesPage.testResultsPageTitle());
                Assert.assertTrue(servicesPage.isGradeBookTableDisplayed());
                break;
            default:
                //
        }
    }
    @When("User clicks on the grade book tab to see their grades")
    public void user_clicks_on_the_grade_book_tab_to_see_their_grades() {
        servicesPage.gradeBook.click();
        BrowserUtilities.sleep(2);
    }

    @When("User clicks on the profile tab.")
    public void user_clicks_on_the_profile_tab() {
        servicesPage.profile.click();
        BrowserUtilities.sleep(2);
    }
    @When("User edits the student profile and clicks on the save button")
    public void user_edits_the_student_profile_and_clicks_on_the_save_button() {
        servicesPage.editPersonalData();
        servicesPage.editProfileSetting();
        servicesPage.editPostalAddress();
        servicesPage.saveProfileChanges();

    }
    @Then("Student's Profile data should be edited successfully")
    public void student_s_profile_data_should_be_edited_successfully() {
        HashMap hm1 = new HashMap();
        hm1 = (HashMap) servicesPage.retrievePersonalData();
        Assert.assertEquals("Mustafa",hm1.get("FirstName"));
        Assert.assertEquals("Y",hm1.get("LastName"));
        Assert.assertEquals("my@gmail.com",hm1.get("Email"));
        Assert.assertEquals("www.xxxxx.com",hm1.get("Website"));
        Assert.assertEquals("123",hm1.get("ICQ"));

        HashMap hm2 = new HashMap();
        hm2 = (HashMap) servicesPage.retrievePostalAddress();
        Assert.assertEquals("United Kingdom",hm2.get("Country"));
        Assert.assertEquals("AA12 3BC",hm2.get("ZipCode"));

        Assert.assertTrue(servicesPage.chkPublicProfile.isSelected());
    }


}

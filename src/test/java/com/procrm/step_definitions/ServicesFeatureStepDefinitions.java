package com.procrm.step_definitions;

import com.procrm.pages.ServicesPage;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.procrm.pages.BasePage;
import org.junit.Assert;

import java.util.Locale;

public class ServicesFeatureStepDefinitions {

    ServicesPage servicesPage = new ServicesPage();

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
    @When("User clicks on the my courses tab to see his\\/her courses")
    public void user_clicks_on_the_my_courses_tab_to_see_his_her_courses() {
        servicesPage.myCourses.click();
        BrowserUtilities.sleep(2);
    }
    @Then("{string} should be displayed")
    public void should_be_displayed(String str) {
        switch (str) {
            case "My Courses":
                Assert.assertTrue(servicesPage.isCourseReportTitleDisplayed());
                Assert.assertTrue(servicesPage.isCoursesTableDisplayed());
                break;
            case "Grade Book":
                //
                break;
            default:
                //
        }
    }




}

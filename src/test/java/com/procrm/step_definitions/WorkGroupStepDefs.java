package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.WorkgroupsPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WorkGroupStepDefs {


    WorkgroupsPage workgroupsPage= new WorkgroupsPage();

    @Given("user is logged in and on the  homepage")
    public void user_is_logged_in_and_on_the_homepage() {
        BasePage.loginAsHR();

    }
    @When("{string} clicks on workgroup module")
    public void clicks_on_workgroup_module(String string) {
        workgroupsPage.workgroupLink.click();
        BrowserUtilities.sleep(5);
    }

    @When("{string} clicks on {string}")
    public void clicks_on(String string, String string2) {
        workgroupsPage.saleGroup.click();
        BrowserUtilities.sleep(5);
    }
    @Then("{string} clicks on join button to send request")
    public void clicks_on_join_button_to_send_request(String string) {
        workgroupsPage.joinButton.click();
       BrowserUtilities.sleep(5);
    }
//2. seneryo
    @When("{string} clicks sort by")
    public void clicks_sort_by(String string) {
        BrowserUtilities.sleep(5);
       workgroupsPage.sortBy.click();
        BrowserUtilities.sleep(5);

    }
    @When("{string} can sort the groups in a demanded order provided in application.")
    public void can_sort_the_groups_in_a_demanded_order_provided_in_application(String string) {
        workgroupsPage.selectNumberOfMembers.click();
        BrowserUtilities.sleep(5);
    }
    @Then("{string} can see the groups sorted in a demanded order")
    public void can_see_the_groups_sorted_in_a_demanded_order(String string) {
       // Assert.assertTrue(workgroupsPage.isSorted.isDisplayed());

    }

    @When("{string} clicks on group name")
    public void clicks_on_group_name(String string) {
        workgroupsPage.leaveRequestSaleGroup.click();

    }
    @When("{string} sees a pop up window")
    public void sees_a_pop_up_window(String string) {
        workgroupsPage.popupWindow.isDisplayed();

    }
    @Then("{string} clicks on revoke workgroup membership request button to leave the group")
    public void clicks_on_revoke_workgroup_membership_request_button_to_leave_the_group(String string) {
        workgroupsPage.revokeButton.click();



    }

}
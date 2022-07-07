package com.procrm.step_definitions;

import com.procrm.pages.WorkgroupsPage;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkGroupsStepDef {

    WorkgroupsPage workgroupsPage = new WorkgroupsPage();



    @When("user clicks on workgroup module")
    public void user_clicks_on_workgroup_module() {
        workgroupsPage.workgroupLink.click();
        BrowserUtilities.sleep(2);

    }


    @When("user clicks sort by")
    public void user_clicks_sort_by() {
        workgroupsPage.sortBy.click();
        BrowserUtilities.sleep(2);
    }


    @When("user can sort the groups in a demanded order provided in application.")
    public void user_can_sort_the_groups_in_a_demanded_order_provided_in_application() {
        workgroupsPage.selectNumberOfMembers.click();
        BrowserUtilities.sleep(2);
    }

    @And("user clicks on small join button")
    public void userClicksOnSmallJoinButton() {

        //workgroupsPage.smalljoinBtn.click();
        BrowserUtilities.sleep(5);
    }

    @When("user clicks on sale")
    public void user_clicks_on_sale() {
        workgroupsPage.saleGroup.click();
        BrowserUtilities.sleep(5);
    }


    @Then("user clicks on revoke workgroup membership request button to leave the group")
    public void user_clicks_on_revoke_workgroup_membership_request_button_to_leave_the_group() {
        workgroupsPage.revokeButton.click();
        BrowserUtilities.sleep(5);

    }



}
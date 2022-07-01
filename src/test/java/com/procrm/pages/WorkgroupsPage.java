package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkgroupsPage {

    public WorkgroupsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//a[@href='/workgroups/'])[1]")
    public WebElement workgroupLink;

   @FindBy(xpath="(//a[@href='/workgroups/group/3/'])[4]")
    public WebElement saleGroup;

   //@FindBy(className ="")
   //public WebElement sortBy;

   @FindBy(id= "bx-sonet-groups-request-3")
   public WebElement groupRequest;

   @FindBy(id="bx-group-join-submit")
    public WebElement SaleClick;

   @FindBy(xpath= "(//span[.='Number of members'])[2]")
    public WebElement selectNumberOfMembers;

   @FindBy(id= "bx-sonet-groups-sort-value")
    public WebElement isSorted;
}

   /*
   ps

    And "user" can sort the groups in a demanded order provided in application.
    Then "user" can see the groups sorted in a demanded order

  Scenario:  User can leave any joint groups
    When "user" clicks on group name
    And "user" sees a pop up window
    Then "user" clicks on revoke workgroup membership request button to leave the group
    */



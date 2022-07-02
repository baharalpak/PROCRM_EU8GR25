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

  @FindBy(id = "bx-group-join-submit")
  public WebElement joinButton;

  // /////////////////////////////////////////////////////////////////////////


   @FindBy(className= "sonet-groups-content-sort-btn")
   public WebElement sortBy;

   // @FindBy(xpath= "(//span[.='Number of members'])[2]")
    @FindBy(id= "popup-window popup-window-no-paddings")
    public WebElement selectNumberOfMembers;

    @FindBy(id= "bx-sonet-groups-sort-value")
    public WebElement isSorted;

    @FindBy(xpath="(//a[@href='/workgroups/group/3/'])[4]")
   public WebElement leaveRequestSaleGroup;

    @FindBy(className ="ui-btn ui-btn-md ui-btn-danger")
    public WebElement revokeButton;






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



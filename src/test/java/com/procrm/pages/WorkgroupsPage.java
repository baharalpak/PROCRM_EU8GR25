package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkgroupsPage {

    public WorkgroupsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[@class= 'menu-item-link-text'])[4]")
    public WebElement workgroupLink;

    @FindBy(xpath="(//a[@href='/workgroups/group/3/'])[1]")
    public WebElement saleGroup;

    @FindBy(xpath = "(//a[@href='/workgroups/group/3/user_request/'])")
    public WebElement joinButton;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-success']")
    public WebElement joinGroupButton;

    // /////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "//span[@class='sonet-groups-content-sort-btn']")
    public WebElement sortBy;


    @FindBy(xpath= "(//span[@class='menu-popup-item-text'])[4]")

    public WebElement selectNumberOfMembers;

    //@FindBy(id= "bx-sonet-groups-sort-value")
    // public WebElement isSorted;

    @FindBy(xpath="(//a[@href='/workgroups/group/3/'])[4]")
    public WebElement leaveRequestSaleGroup;

    @FindBy(xpath  ="//button[@class='ui-btn ui-btn-md ui-btn-danger']")
    public WebElement revokeButton;

    @FindBy(id= "bx-group-join-successfull-request-popup")
    public WebElement popupWindow;







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





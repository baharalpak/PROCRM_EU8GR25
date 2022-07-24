package com.procrm.pages;

import com.procrm.utilities.BrowserUtilities;
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


    @FindBy(xpath = "//span[@class='sonet-groups-content-sort-btn']")
    public WebElement sortBy;


    @FindBy(xpath = "(//span[@class = 'menu-popup-item-text'])[1]")
    public WebElement abcGroup;

    @FindBy(xpath = "(//span[@class = 'menu-popup-item-text'])[2]")
    public WebElement timeJoined;

    @FindBy(xpath = "(//span[@class = 'menu-popup-item-text'])[3]")
    public WebElement lastViewed;


    @FindBy(xpath= "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement selectNumberOfMembers;

    @FindBy(xpath = "(//span[@class = 'menu-popup-item-text'])[5]")
    public WebElement lastActive;

    @FindBy(xpath = "(//span[@class = 'menu-popup-item-text'])[6]")
    public WebElement timeCreated;

    @FindBy(xpath = "(//span[@class = 'popup-window-button'])[3]")
    public WebElement smalljoinBtn;


    @FindBy(xpath="(//a[@href='/workgroups/group/3/'])[3]")
    public WebElement saleGroup;

    @FindBy(xpath  ="//button[@class='ui-btn ui-btn-md ui-btn-danger']")
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





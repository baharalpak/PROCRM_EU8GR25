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

   @FindBy(xpath= "href=\"/workgroups/group/3/\"")
    public WebElement saleGroup;

   @FindBy(className = "sonet-groups-content-sort-btn")
   public WebElement abcOrder;

   @FindBy(id= "bx-sonet-groups-request-3")
   public WebElement groupRequest;

   @FindBy(id="bx-group-join-submit")
    public WebElement SaleClick;

   public void joinGroup(){
       workgroupLink.click();
       saleGroup.click();
       abcOrder.click();

   }

}

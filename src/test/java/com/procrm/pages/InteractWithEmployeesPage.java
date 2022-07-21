package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractWithEmployeesPage {

    public InteractWithEmployeesPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "(//a[.='Comment'])[1]")
    public WebElement commentButton;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement commentInputBox;


   @FindBy(id="lhe_button_submit_blogCommentFormWbPP")
    public WebElement sendButton;

   @FindBy(id = "record-BLOG_103-15")
    public WebElement isVisibleName;







}

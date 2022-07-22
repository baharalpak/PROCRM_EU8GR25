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





}

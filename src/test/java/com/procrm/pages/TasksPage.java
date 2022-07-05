package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}

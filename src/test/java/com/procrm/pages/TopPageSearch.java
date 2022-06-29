package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TopPageSearch {
    public TopPageSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}

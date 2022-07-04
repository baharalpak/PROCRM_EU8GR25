package com.procrm.pages;

import com.procrm.utilities.Driver;
import io.cucumber.java.ca.Cal;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends LoginPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Override
    public void login(String username, String password) {
        super.login(username, password);
    }


}

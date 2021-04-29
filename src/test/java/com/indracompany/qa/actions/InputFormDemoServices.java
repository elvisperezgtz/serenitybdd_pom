package com.indracompany.qa.actions;

import com.indracompany.qa.pages.InputForDemoPage;
import org.openqa.selenium.WebDriver;

public class InputFormDemoServices extends InputForDemoPage {
    public InputFormDemoServices(WebDriver driver) {
        super(driver);
    }
    public void enterPersonalInformation(String firstName, String lastName, String email){
        enter(firstName).into(getFirstNameField());
        enter(lastName).into(getLastNameField());
        enter(email).into(getEmailField());
        getSendButton().click();
    }
}

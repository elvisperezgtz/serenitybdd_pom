package com.indracompany.qa.services;

import com.indracompany.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginServices extends LoginPage {


    public LoginServices(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password){
        fillTheForm(username, password);
        getButtonLogin().click();
    }
    public void fillTheForm(String username, String password){
        enter(username).into(getEmailField());
        enter(password).into(getPasswordField());
    }

}

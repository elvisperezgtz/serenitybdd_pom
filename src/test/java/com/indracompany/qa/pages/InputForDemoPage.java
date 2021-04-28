package com.indracompany.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.seleniumeasy.com/test/input-form-demo.html")
public class InputForDemoPage extends PageObject {
    @FindBy(name = "first_name")
    WebElementFacade firstNameField;
    @FindBy(name = "last_name")
    WebElementFacade lastNameField;
    @FindBy(name = "email")
    WebElementFacade emailField;
    @FindBy(css = ".btn.btn-default")
    WebElementFacade sendButton;
    public InputForDemoPage (WebDriver driver){
        super(driver);
    }

    public WebElementFacade getFirstNameField() {
        return firstNameField;
    }

    public WebElementFacade getLastNameField() {
        return lastNameField;
    }

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getSendButton() {
        return sendButton;
    }
}

package com.indracompany.qa.pages;


import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@Data

@DefaultUrl("https://www.phptravels.net/login")
public class LoginPage extends PageObject {

    @FindBy(id = "identifierId")
    private WebElementFacade emailField;
    @FindBy(name="password")
    private WebElementFacade passwordField;
    @FindBy(xpath="//button[@type='button' and contains(.,'Siguiente')]")
    private WebElementFacade buttonLogin;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getButtonLogin() {
        return buttonLogin;
    }
}

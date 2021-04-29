package com.indracompany.qa.pages;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
@Data
public class FormularioRegistroPage extends PageObject {

    public FormularioRegistroPage(WebDriver driver){
        super(driver);
    }

    @FindBy(name="first_name")
    private WebElementFacade firstNameField;
    @FindBy(name="last_name")
    private WebElementFacade lastNameField;
    @FindBy(name="email")
    private WebElementFacade emailField;
    @FindBy(name="phone")
    private WebElementFacade phoneField;
    @FindBy(name="address")
    private WebElementFacade addressSelect;

    public WebElementFacade getCityField() {
        return cityField;
    }

    @FindBy(name="city")
    private WebElementFacade cityField;
    @FindBy(name="state")
    private WebElementFacade stateField;
    @FindBy(name="zip")
    private WebElementFacade zipField;
    @FindBy(name="comment")
    private WebElementFacade commentField;
    @FindBy(className = "btn.btn-default")
    private WebElementFacade sendButton;

    public WebElementFacade getFirstNameField() {
        return firstNameField;
    }

    public WebElementFacade getLastNameField() {
        return lastNameField;
    }

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getPhoneField() {
        return phoneField;
    }

    public WebElementFacade getAddressSelect() {
        return addressSelect;
    }

    public WebElementFacade getStateField() {
        return stateField;
    }

    public WebElementFacade getZipField() {
        return zipField;
    }

    public WebElementFacade getCommentField() {
        return commentField;
    }

    public WebElementFacade getSendButton() {
        return sendButton;
    }

}

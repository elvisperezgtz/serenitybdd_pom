package com.indracompany.qa.steps;

import com.indracompany.qa.models.Credential;
import com.indracompany.qa.services.LoginServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class LoginSteps {
    @Managed
    WebDriver driver;
    LoginServices loginServices = new LoginServices(getDriver());
    @Given("He is on the login page")
    public void heIsOnTheLoginPage() {
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       
    }

    @When("he logs in whit her credentials")
    public void heLogsInWhitHerCredentials(List<Credential> credentials) {
//        InputFormDemoServices demoPage = new InputFormDemoServices(getDriver());
//        demoPage.enterPersonalInformation("Elvis", "perez", "elvisperez@gmail.com");

        loginServices.login(credentials.get(0).getUsername(), credentials.get(0).getPassword());

    }

    @Then("he should be able to see the system greeting")
    public void heShouldBeAbleToSeeTheSystemGreeting() {
        
       
    }

    @Then("^he should be able to see the error message$")
    public void heShouldBeAbleToSeeTheErrorMessage() {
    }

    @When("^he logs in whit wrong credentials$")
    public void heLogsInWhitWrongCredentials(List<Credential> credentials) {
        loginServices.fillTheForm(credentials.get(0).getUsername(), credentials.get(0).getPassword());
    }
}


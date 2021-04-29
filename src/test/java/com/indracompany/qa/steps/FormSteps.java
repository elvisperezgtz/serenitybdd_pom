package com.indracompany.qa.steps;

import com.indracompany.qa.actions.FormularioRegistroActions;
import com.indracompany.qa.models.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FormSteps {
    @Managed
    WebDriver driver;

    @Steps
    FormularioRegistroActions actions = new FormularioRegistroActions(getDriver());

    @Given("^el esta en la pagina de registro$")
    public void elEstaEnLaPaginaDeRegistro() {
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
    }

    @When("^el ingresa los datos de registro$")
    public void elIngresaLosDatosDeRegistro(List<User>users) {
        actions.llena_el_formulario_con_la_informacion_del_usuario(users.get(0));
    }

    @Then("^el deberia poder ver que se creo el registro correctamente$")
    public void elDeberiaPoderVerQueSeCreoElRegistroCorrectamente() {
    }
}

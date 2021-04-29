package com.indracompany.qa.actions;

import com.indracompany.qa.models.User;
import com.indracompany.qa.pages.FormularioRegistroPage;
import lombok.Data;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class FormularioRegistroActions extends FormularioRegistroPage {
    private String actor;

    public FormularioRegistroActions(WebDriver driver) {
        super(driver);
    }

    @Step("#actor llena el formaulario con la informacion solicitada")

    public void llena_el_formulario_con_la_informacion_del_usuario(User user){
        enter(user.getFirstName()).into(getFirstNameField());
        enter(user.getLastName()).into(getLastNameField());
        enter(user.getEmail()).into(getEmailField());
        enter(user.getPhone()).into(getPhoneField());
        enter(user.getAddress()).into(getAddressSelect());
        enter(user.getCity()).into(getCityField());
        selectFromDropdown(getStateField(),user.getState());


    }

}

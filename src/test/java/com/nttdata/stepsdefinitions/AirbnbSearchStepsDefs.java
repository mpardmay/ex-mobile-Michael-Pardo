package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me enuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        //airbnbSearchSteps.clickClose();
    }
    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }
    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @Given("que me enuentro en el login de Swag Labs")
    public void queMeEnuentroEnElLoginDeSwagLabs() {
        airbnbSearchSteps.initTest();
    }

    @When("digito mi usuario {string} y contraseña {string}")
    public void digitoMiUsuarioYContraseña(String user, String password) {
        airbnbSearchSteps.getUsername(user);
        airbnbSearchSteps.getPassword(password);
    }

    @And("presiono el boton login")
    public void presionoElBotonLogin() {
        airbnbSearchSteps.clickLogin();
    }

    @Then("verifico que este el titulo {string}")
    public void verificoQueEsteElTitulo(String expectedText) {
        airbnbSearchSteps.validateText(expectedText);
    }

    @And("verifico que exista almenos un item")
    public void verificoQueExistaAlmenosUnItem() {
    }
}

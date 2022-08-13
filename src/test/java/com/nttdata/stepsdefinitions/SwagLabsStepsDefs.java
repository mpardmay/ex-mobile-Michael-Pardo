package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabsStepsDefs {

    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("que me encuentro en el login de Swag Labs")
    public void queMeEncuentroEnElLoginDeSwagLabs() {
        swagLabsSteps.initTest();
    }

    @And("presiono el boton login")
    public void presionoElBotonLogin() {
        swagLabsSteps.clickLogin();
    }


    @And("verifico que exista almenos un item")
    public void verificoQueExistaAlmenosUnItem() {
        swagLabsSteps.getExistItem();
    }

    @When("digito mi usuario {string} y contrasena {string}")
    public void digitoMiUsuarioYContrasena(String user, String pass) {
        swagLabsSteps.getUsername(user);
        swagLabsSteps.getPassword(pass);
    }

    @Then("verifico que este el titulo {string}")
    public void verificoQueEsteElTitulo(String expectedText) {
        swagLabsSteps.validateText(expectedText);
    }
}

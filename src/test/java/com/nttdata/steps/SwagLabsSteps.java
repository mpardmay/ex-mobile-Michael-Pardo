package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SwagLabsSteps {

    LoginScreen loginScreen;

    @Step("Inicializar todo")
    public void initTest(){
        loginScreen.initTest();
    }

    @Step("loguearse")
    public void getUsername(String user){
        loginScreen.getUsername(user);
    }
    public void getPassword(String password){
        loginScreen.getPassword(password);
    }

    public void clickLogin(){
        loginScreen.clickLoginButon();
    }


    @Step("validar texto")
    public void validateText(String expectedText){
      loginScreen.validateText(expectedText);
    }
    @Step("validar producto")
    public void getExistItem(){
        loginScreen.getExistItem();
    }
}

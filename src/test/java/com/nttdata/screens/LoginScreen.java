package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    //casilla usuario
    @AndroidFindBy(id = "test-Username")
    private WebElement username;

    //casilla contraseña
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement password;

    //boton login
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")
    private WebElement loginButon;

    //obtener valor "PRODUCTS"
    @AndroidFindBy(id = "00000000-0000-00d8-ffff-ffff00000042")
    private WebElement validateProductText;

    public void initTest(){

    }
    public void getUsername(String user){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        username.click();
        username.sendKeys(user);
    }

    public void getPassword(String pass){
        password.click();
        password.sendKeys(pass);
    }

    public void clickLoginButon(){
        loginButon.click();
    }

    public void validateText(String expectedText){
        String fetchedText = validateProductText.getText();
        Assert.assertEquals(expectedText, fetchedText);
    }
}

package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    //casilla usuario
    @AndroidFindBy(accessibility = "test-Username")
    public WebElement username;

    //casilla contraseña
    @AndroidFindBy(accessibility = "test-Password")
    public WebElement password;

    //boton login
    @AndroidFindBy(accessibility = "test-LOGIN")
    public WebElement loginButon;

    //obtener valor "PRODUCTS"
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    public WebElement validateProductText;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]")
    public WebElement existItem;

    public void initTest(){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
    public void getUsername(String user){
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

    public void getExistItem(){
        boolean exist;
        if (existItem != null) {
            exist = true;
        } else {
            exist = false;
        }
        Assert.assertTrue(exist);
    }
}

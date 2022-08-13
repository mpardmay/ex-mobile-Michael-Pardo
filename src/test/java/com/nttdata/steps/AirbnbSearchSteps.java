package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

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

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }

    @Step("validar texto")
    public void validateText(String expectedText){
      loginScreen.validateText(expectedText);
    }
}

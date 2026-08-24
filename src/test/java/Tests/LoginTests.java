package Tests;

import org.testng.annotations.Test;

public class LoginTests extends base{


    @Test
    public void clickLoginButton() throws InterruptedException {
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests(){
        loginPage.enterUsername("njceles@gmail.com");
    }

    //ToDo - Implement tests for clicking the login button

    @Test(priority = 2)
    public void enterPassword(){
        loginPage.enterPassword("@12345678");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton(){
        loginPage.clickLoginSubmitButton();
    }

}

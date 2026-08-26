package Tests;

import Basics.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginToNdosiWebsite() throws InterruptedException {

        homePage.clickLoginButton();

        loginPage.login(
                "siz.ngwenya@gmail.com",
                "@12345678"
        );

        System.out.println("Login Successful");
    }
}
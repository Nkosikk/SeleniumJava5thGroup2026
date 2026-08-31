package Tests;

import Basics.BaseTest;
import ExtentReports.Listener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class LoginTest extends BaseTest {

    @Test
    public void LoginToNdosiWebsite() {

        homePage.clickLoginButton();

        loginPage.login(
                "siz.ngwenya@gmail.com",
                "@12345678"
        );

        Assert.assertTrue(
                homePage.isUserLoggedIn(),
                "Login failed"
        );

        System.out.println("Login Successful");
    }
}
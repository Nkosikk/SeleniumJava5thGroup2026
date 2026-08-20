package Tests;

import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void LoginToNdosiWebsite() throws InterruptedException {
        homePage.clickLoginButton();

    }
}

package Basics;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver =
            browserFactory.LaunchBrowser(
                    "Edge",
                    "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage =
            PageFactory.initElements(driver, HomePage.class);

    public LoginPage loginPage =
            new LoginPage(driver);
}
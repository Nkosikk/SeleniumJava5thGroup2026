package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToNdosiWebsite {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://ndosisimplifiedautomation.vercel.app/");
    }

    @Test
    public void clickLoginButton() {

        driver.findElement(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button")).click();
    }

    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUserName() {

        driver.findElement(By.id("login-email")).sendKeys("siz.ngwenya@gmail.com");

    }

    @Test(dependsOnMethods = {"enterUserName"})
    public void enterPassword() {

        driver.findElement(By.id("login-password")).sendKeys("@12345678");
    }

    @Test(dependsOnMethods = {"enterPassword"})
    public void clickLoginSubmitButton() {

        driver.findElement(By.id("login-submit")).click();
    }

    @Test(dependsOnMethods = {"clickLoginSubmitButton"})
    public void verifyLoginSuccess() {

        driver.findElement(By.xpath("//*[@id='app-root']/nav/div[1]/div[2]/div[3]/button")).isDisplayed();

        System.out.println("Login Successful");
    }

    @AfterTest
    public void quit() {

        if (driver != null) {

            driver.quit();
        }
    }
}
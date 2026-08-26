package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginButton =
            By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button/span[2]");

    public void clickLoginButton() {

        driver.findElement(loginButton).click();
    }
}
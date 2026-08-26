package Tests;

import Utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


import static Utils.BrowserFactory.driver;

public class WebAutomationAdvanceTest {

    private WebDriverWait wait;

    public WebAutomationAdvanceTest() {

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test
    public void AutomateAdvanceWebAutomation() throws InterruptedException {

        BrowserFactory.LaunchBrowser("Edge", "https://ndosisimplifiedautomation.vercel.app/#overview");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("This is a test for Web Automation Advance");

        driver.manage().window().maximize();

        // Login to the Website

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button/span[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-email']"))).sendKeys("siz.ngwenya@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-password']"))).sendKeys("@12345678");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-submit']"))).click();

        // Access and Work with the Advanced Web Automation Section

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app-root']/nav/div[1]/div[2]/div[1]/button/span[3]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app-root']/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tab-btn-web']/span[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='assessment-instructions']/summary"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='deviceType']/option[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='brand']/option[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='storage-128GB']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='color']/option[4]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='quantity']"))).sendKeys("2");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='address']"))).sendKeys("123 Test Street");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inventory-next-btn']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shipping-express']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='warranty-1yr']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='discount-code']"))).sendKeys("SAVE10");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='apply-discount-btn']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='purchase-device-btn']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='view-history-btn']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='view-invoice-INV-1787591774428']"))).click();

        System.out.println("Advanced Web Automation Test Completed Successfully");

        Thread.sleep(2000);

        driver.quit();

    }
}

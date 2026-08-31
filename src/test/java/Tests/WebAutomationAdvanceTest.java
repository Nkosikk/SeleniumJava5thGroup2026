package Tests;

import ExtentReports.Listener;
import Utils.BrowserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

import static Utils.BrowserFactory.driver;

@Listeners(Listener.class)
public class WebAutomationAdvanceTest {

    private WebDriverWait wait;

    @Test
    public void AutomateAdvanceWebAutomation() throws InterruptedException {

        BrowserFactory.LaunchBrowser(
                "Edge",
                "https://ndosisimplifiedautomation.vercel.app/"
        );

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("This is a test for Web Automation Advance");

        driver.manage().window().maximize();

        // Login

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button/span[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email"))).sendKeys("siz.ngwenya@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password"))).sendKeys("@12345678");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit"))).click();

        // Navigate to Advanced Automation

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app-root']/nav/div[1]/div[2]/div[1]/button/span[3]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app-root']/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("tab-btn-web"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='assessment-instructions']/summary"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='deviceType']/option[2]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='brand']/option[2]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("storage-128GB"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='color']/option[4]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quantity"))).sendKeys("2");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address"))).sendKeys("123 Test Street");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("inventory-next-btn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("shipping-express"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("warranty-1yr"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("discount-code"))).sendKeys("SAVE10");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("apply-discount-btn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("purchase-device-btn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("view-history-btn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'view-invoice-')]"))).click();

        System.out.println("Advanced Web Automation Test Completed Successfully");

        Thread.sleep(2000);

        driver.quit();
    }
}
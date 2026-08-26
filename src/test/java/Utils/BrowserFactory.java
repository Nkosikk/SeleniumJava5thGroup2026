package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver LaunchBrowser(String browserChoice, String url) {

        if (browserChoice.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");

            driver = new ChromeDriver(options);

        } else if (browserChoice.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        } else {

            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

    public static void CloseBrowser() {

        if (driver != null) {

            driver.quit();
            driver = null;
        }
    }
}
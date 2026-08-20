import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginToNdosiWebsite {

    WebDriver driver;

@Test
    public void loginToNdosiWebsiteTest() {
        driver = new ChromeDriver();

        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button/span[2]")).click();

    driver.findElement(By.id("login-email"))
            .sendKeys("nice@example.com");

    driver.findElement(By.id("login-password"))
            .sendKeys("YourPassword");

    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button/span[2]")
    ).click();
    Thread.sleep(5000);
    }
}

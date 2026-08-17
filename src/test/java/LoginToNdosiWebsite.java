import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginToNdosiWebsite {

    WebDriver driver;

    @Test
    public void loginToNdosiWebsite() {

        driver = new EdgeDriver();

        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='app-root']/nav/div[1]/div[3]/button")).click();

        driver.findElement(By.id("login-email")).sendKeys("siz.ngwenya@gmail.com");

        driver.findElement(By.id("login-password")).sendKeys("@12345678");

        driver.findElement(By.id("login-submit")).click();
    }
}
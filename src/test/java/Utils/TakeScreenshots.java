package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TakeScreenshots {

    private TakeScreenshots() {
        // Prevent object creation
    }

    public static String takeScreenshot(
            WebDriver driver,
            String testName) {

        try {

            String timestamp =
                    LocalDateTime.now()
                            .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            String screenshotDirectory =
                    System.getProperty("user.dir")
                            + "/Screenshots";

            File directory =
                    new File(screenshotDirectory);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            String screenshotPath =
                    screenshotDirectory
                            + "/"
                            + testName
                            + "_"
                            + timestamp
                            + ".png";

            File source =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File destination =
                    new File(screenshotPath);

            FileUtils.copyFile(source, destination);

            System.out.println(
                    "Screenshot saved successfully: "
                            + screenshotPath);

            return screenshotPath;

        } catch (Exception e) {

            throw new RuntimeException(
                    "Failed to capture screenshot for test: "
                            + testName,
                    e);

        }
    }
}
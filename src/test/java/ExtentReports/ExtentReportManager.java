package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extentReports;

    public static ExtentReports extentSetup() {

        if (extentReports == null) {

            String reportPath = System.getProperty("user.dir") + "/Reports/AutomationReport.html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

            sparkReporter.config().setDocumentTitle("Automation Test Report");
            sparkReporter.config().setReportName("Selenium Framework Report");

            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);

            extentReports.setSystemInfo(
                    "OS",
                    System.getProperty("os.name"));

            extentReports.setSystemInfo(
                    "User",
                    System.getProperty("user.name"));

            extentReports.setSystemInfo(
                    "Java Version",
                    System.getProperty("java.version"));
        }

        return extentReports;
    }
}

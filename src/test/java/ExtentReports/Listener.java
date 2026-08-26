package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.*;

public class Listener implements ITestListener {

    private static final ExtentReports extent =
            ExtentReportManager.extentSetup();

    private static ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(
                result.getMethod().getMethodName());

        test.info("Test Started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed Successfully");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail("Test Failed");

        test.fail(result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");

    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

    }
}
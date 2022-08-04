package ListnersDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testng.RealDemo.Init;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExentReport.getScreenshotForListener;
import static ExtentReportsDemo.util.ForExentReport.initExtentReport;

public class MyExtentListener extends Init implements ITestListener {


    static ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
         test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.info("this test is passed");
        test.fail(result.getThrowable());

        try {
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshotForListener(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.info("this test is skipped");
        test.skip(result.getThrowable());
    }

    public void onStart(ITestContext context) { // before test tag
        System.out.println("onStart");
        if(extent==null)
            extent = initExtentReport();
    }

    public void onFinish(ITestContext context) { // after test tag
        System.out.println("onFinish");

        extent.flush();
    }
}

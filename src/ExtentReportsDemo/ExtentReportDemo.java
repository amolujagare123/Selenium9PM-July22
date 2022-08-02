package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExentReport.getScreenshot;

public class ExtentReportDemo {

    ExtentReports extent;

    @BeforeClass
    public  void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression testing");
        reporter.config().setDocumentTitle("Management Project");

        extent.setSystemInfo("Client name","Honeywell");
        extent.setSystemInfo("Developers name name","Nitin");
        extent.setSystemInfo("Tested by","Nilesh");
        extent.setSystemInfo("Project dead line","1 month");
        extent.setSystemInfo("Sprint Number","#12345");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();

    }

    @Test
    public void loginTest() throws IOException {
        ExtentTest test = extent.createTest("valid login test");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("username and password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button clicked");

        String expected = "https://stock.amolujagare.com/dashboard.php";
        String actual  = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("We are on dashboard");
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }


    }

    @Test
    public void blankLoginTest() throws IOException {
        ExtentTest test = extent.createTest("Blank login test");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("username and password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button clicked");

        String expected = "https://stock.amolujagare.com/";
        String actual  = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("We got correct error");
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void invalidLoginTest() throws IOException {
        ExtentTest test = extent.createTest("Invalid login test");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("sdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("sddsd");

        test.info("username and password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button clicked");

        String expected = "https://stock.amolujagare.com/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual  = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("We got correct error");
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }

    }


}

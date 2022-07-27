package testng.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Socialsites {

    WebDriver driver;

    // no need to use static keyword
    @BeforeClass // method below this annotation will run before first test method of the class
    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    // no need to use static keyword
    @AfterClass // method below this annotation will run after last  test method of the class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test ( priority = 4)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }
    @Test (priority = 3)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }
    @Test (priority = 2)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }
    @Test ( priority = 5)
    public void linkedin()
    {
        driver.get("http://linkedin.com");
    }
    @Test (enabled = false , priority = 1)
    public void snapchat()
    {
        driver.get("https://www.snapchat.com/");
    }



}

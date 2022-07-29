package testng.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jobsites {

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

    @Test
    public void naukri()
    {
        driver.get("http://naukri.com");
    }

    @Test
    public void monster()
    {
        driver.get("http://monster.com");
        Assert.assertEquals(true,false,
                "this is not monster.com");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test
    public void timesjobs()
    {
        driver.get("http://timesjobs.com");
    }


}

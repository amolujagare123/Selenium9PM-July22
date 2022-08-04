package testng.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Socialsites extends  Init {



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

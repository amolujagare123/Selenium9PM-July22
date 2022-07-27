package testng.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudySites {

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
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }

    @Test
    public void javatpoint()
    {
        driver.get("https://javatpoint.com/");
    }

    @Test
    public void scriptinglogic()
    {
        driver.get("https://scriptinglogic.com/");
    }

    @Test
    public void w3schools()
    {
        driver.get("https://www.w3schools.com/");
    }



}

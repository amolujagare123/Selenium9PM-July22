package testng.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudySites extends  Init {



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

package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitDemo3 {
    static WebDriver driver;

    @BeforeClass // method below this annotation will run before first test method of the class
    public static  void openBrowser()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // method below this annotation will run after last test method of the class
    public  static void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }


    @Test
    public void myTest1()
    {
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }

    @Test
    public void myTest2()
    {

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("gfgfg");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("gfgfg");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }

    @Test
    public void myTest3()
    {

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }
}

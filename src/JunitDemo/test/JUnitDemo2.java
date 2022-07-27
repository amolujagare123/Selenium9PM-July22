package JunitDemo.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JUnitDemo2 {
    WebDriver driver;

    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void myTest1() {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void myTest2() {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin1");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void myTest3() {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }
}

package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://stock.amolujagare.com/");

        WebElement txtUsername2 = driver2.findElement(By.id("login-username"));
        txtUsername2.sendKeys("dsdsd");

        WebElement txtPassword2 = driver2.findElement(By.id("login-password"));
        txtPassword2.sendKeys("dsdsd");

        WebElement btnLogin2 = driver2.findElement(By.name("submit"));
        btnLogin2.click();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver3 = new FirefoxDriver();
        driver3.manage().window().maximize();
        driver3.get("https://stock.amolujagare.com/");

        WebElement txtUsername3 = driver3.findElement(By.id("login-username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver3.findElement(By.id("login-password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver3.findElement(By.name("submit"));
        btnLogin3.click();


    }
}

package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviderDemo {

    @Test (dataProvider = "getData")
    public void myTest1(String username,String password)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[5][2];

        data[0][0] = "admin";
        data[0][1] = "admin" ;

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1" ;

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2" ;

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3" ;

        data[4][0] = "invalid-4";
        data[4][1] = "invalid-4" ;

        return data;
    }
}

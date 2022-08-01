package STD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void loginDemo()
    {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        /*String expected="POSNIC - Dashboard";
        String actual= driver.getTitle();*/

        String expected="https://stock.amolujagare.com/dashboard.php";
        String actual= driver.getCurrentUrl();

        /*String expected="Dashboard";
        String actual=driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();*/

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);
        Assert.assertEquals(actual,expected,"this is not dashboard");
    }
    @Test
    public void invalidLoginDemo()
    {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("admin1");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        /*String expected="POSNIC - Dashboard";
        String actual= driver.getTitle();*/

        /*String expected="https://stock.amolujagare.com/dashboard.php";
        String actual= driver.getCurrentUrl();*/

        String expected="Wrong Username or Password";
        String actual="";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {
        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);
        Assert.assertEquals(actual,expected,"Plse enter valid data");
    }
    @Test
    public void blankLogin()
    {

        driver.get("https://stock.amolujagare.com/");
        WebElement txtusername = driver.findElement(By.id("login-username"));
        txtusername.sendKeys("");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

      /*  ArrayList<String> expected = new ArrayList<>();
            expected.add("PLEASE ENTER A USERNAME");
            expected.add("PLEASE PROVIDE A PASSWORD");
        }};*/
        ArrayList<String> expected=new ArrayList<>(){{
            add("PLEASE ENTER A USERNAME");
            add("PLEASE PROVIDE A PASSWORD");
        }};



        /*String expected="POSNIC - Dashboard";
        String actual= driver.getTitle();*/

        /*String expected="https://stock.amolujagare.com/dashboard.php";
        String actual= driver.getCurrentUrl();*/

        /*String expected="Wrong Username or Password";
        String actual="";*/
        ArrayList<String> actual=new ArrayList<>();
        try {
            List<WebElement> errorList = driver.findElements(By.xpath("//label[@class='error']"));
            actual.add(errorList.get(0).getText());
            actual.add(errorList.get(1).getText());
        }
        catch (Exception e)
        {
        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);
        Assert.assertEquals(actual,expected,"Plse enter valid data");
    }
}

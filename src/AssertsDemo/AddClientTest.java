package AssertsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddClientTest {

    @Test
    public void addClientTest()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();


        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys("Purushottam1");

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("7878787");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("7878787");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

        String expected = "Dublicat Entry. Please Verify";

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no error message");

    }

    @Test
    public void addClientTest2()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys("");



        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no error message");

    }

    @Test
    public void addClientTest3()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();

        String name = "Nilesh";

        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("7878787");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("7878787");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

        String expected = "[ "+name+" ] Customer Details Added !";

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no error message");

    }

    @Test
    public void addClientTest4()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();

        String name = "Nilesh1";

        WebElement txtName = driver.findElement(By.xpath("//input[@name='name']"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact1.sendKeys("7878787");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("7878787");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

        String expected = "Customer Details Added";

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
            //   '[ amol ] Customer Details Added !'
        }
        catch (Exception e)
        {
        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"wrong or no message");

    }
}

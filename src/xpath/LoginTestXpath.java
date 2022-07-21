package xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestXpath {

    public static void main(String[] args) {

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


        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));

       // WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
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


    }
}

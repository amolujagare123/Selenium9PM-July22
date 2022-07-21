package xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ViewCustomers {

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

        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();

        driver.findElement(By.xpath("//a[normalize-space()='View Customers']")).click();

        String user = "Vishal";

       // driver.findElement(By.xpath("//tr[td[text()='"+user+"']]//input")).click();

   //    driver.findElement(By.xpath("//tr[td[text()='"+user+"']]//a[contains(@href, 'update')]")).click();

        driver.findElement(By.xpath("//tr[td[text()='Purushottam']]//a[contains(@href,'delete')]")).click();



    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cus"));
        lnkAddCustomer.click();


        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Purushottam1");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("7878787");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("7878787");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

    }
}

package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static DataProvider.util.MyData.getMyData;

public class AddClientWithUtil {
    WebDriver driver;

    @BeforeClass
    public void doLogin()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test (dataProvider = "getData")
    public void addClientTest(String name,String address,String contact1,String contact2) throws InterruptedException {
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cus"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys(address);

                   int con1 = 0;
                   if(!contact1.equals("")) {
                        con1 = (int) Double.parseDouble(contact1);
                   }


        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys(con1+"");

        Thread.sleep(4000);

        int con2 = 0;
        if(!contact2.equals("")) {
            con2 = (int) Double.parseDouble(contact2);
        }

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys(con2+"");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        return getMyData("Data/Mydata.xlsx","Add Customer");
    }
}

package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataProviderExel {

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
    public Object[][] getData() throws IOException {

        // 1. read the file
        FileInputStream fileInputStream = new FileInputStream("Data/Mydata2.xls");

        // 2. convert file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        // 3. identify the sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        // 4. count active rows in the sheet
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for (int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] = row.getCell(0).toString() ;
            data[i][1] = row.getCell(1).toString() ;
        }

      /*  data[0][0] = "admin";
        data[0][1] = "admin" ;

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1" ;

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2" ;

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3" ;

        data[4][0] = "invalid-4";
        data[4][1] = "invalid-4" ;
*/
        return data;
    }
}

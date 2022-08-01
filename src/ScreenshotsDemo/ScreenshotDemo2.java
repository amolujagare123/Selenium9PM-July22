package ScreenshotsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo2 {

    @Test
    public void loginPageScreenshot() throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        // 1. get the element whose screenshot you want

      /*  WebElement element = driver.findElement(By.id("login-username"));
        element.sendKeys("checkScreenshot");*/
        WebElement element = driver.findElement(By.xpath("//img[@alt='Point of Sale']"));
        // 2. call the method getScreenshotAs using the above webelement
        // whose screenshot you want & this will give us
        // the screenshot of the element in file in object format

        File srcFile = element.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. Copy this file Object into a real Image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));

    }
}

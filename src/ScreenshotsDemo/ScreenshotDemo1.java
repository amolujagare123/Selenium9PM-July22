package ScreenshotsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo1 {

    @Test
    public void loginPageScreenshot() throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        // 1. create the object reference of takes screenshot
        // and assign the current driver to it.
        // typecast driver to  TakesScreenshot interface

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using 'ts' & this will give us
        // the screenshot file in object format

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. Copy this file Object into a real Image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));

    }
}

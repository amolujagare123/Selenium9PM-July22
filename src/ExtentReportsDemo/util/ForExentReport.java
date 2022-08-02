package ExtentReportsDemo.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExentReport {

    public static String getScreenshot(WebDriver driver) throws IOException {
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
        FileUtils.copyFile(srcFile,new File("Reports/screenshots/"+fileName));

        return fileName;
    }
}

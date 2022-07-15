import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDowSelection {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. Find the web element 
        WebElement drpText = driver.findElement(By.id("seltext"));

        // 2. Create the object of Select class and pass
        // this (above) webelement to its constructor

        Select selText = new Select(drpText) ;

        Thread.sleep(4000);
        // 3. Select the option with select object - selText
        //	Using -> 1.Visible text | 2. Index | 3.Value

      //  selText.selectByVisibleText("text 3"); // string argument
      //  selText.selectByIndex(4); // int argument
        selText.selectByValue("val1");  // string argument

    }
}

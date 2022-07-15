import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MartialPortalDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        // 1. find the web element

        WebElement ms = driver.findElement(By.id("sel5"));

        // 2. create the object of select class

        Select selMS = new Select(ms);


        Thread.sleep(4000);
        // 3. selection
      //  selMS.selectByVisibleText("Never married");

       // selMS.selectByIndex(2);

        selMS.selectByValue("1");

    }
}

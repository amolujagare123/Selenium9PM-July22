import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicMethods2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // driver.manage().window().maximize();

        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("http://gmail.com");

        Thread.sleep(4000);

        //driver.close(); // closes the current browser only

        driver.quit(); // closes all the windows opened by the driver


    }
}

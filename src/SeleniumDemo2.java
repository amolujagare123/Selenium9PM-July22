import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) {

      /*  System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

    /*   System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe") ;
        WebDriver driver = new FirefoxDriver();*/


       /* WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();*/

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

       // WebDriver driver = new

        driver.manage().window().maximize();
        driver.get("http://facebook.com");

    }
}

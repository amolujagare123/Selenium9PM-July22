import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///D:/amol.html");

        WebElement java = driver.findElement(By.id("check0")); // selected by default
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2")); // selected by default

        Thread.sleep(4000);
        if(java.isSelected())
            java.click();

        Thread.sleep(4000);
        if(selenium.isSelected())
            selenium.click();

        Thread.sleep(4000);
        if (cucumber.isSelected())
            cucumber.click();

    }
}

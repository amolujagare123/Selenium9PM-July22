package xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsAttribute {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/s?k=amol+ujagare");

        driver.findElement(By.xpath("//div/img[contains(@alt,'Approach of')]")).click();
    }
}

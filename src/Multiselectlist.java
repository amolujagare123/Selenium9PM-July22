import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlist {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample/");


        WebElement multiSel = driver.findElement(By.id("multiSel"));

        Select selMulti = new Select(multiSel);

        selMulti.selectByIndex(0);
        selMulti.selectByVisibleText("text 2");
        selMulti.selectByIndex(3);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumProjectsQA\\chromedriver.exe");

        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // НЕЯВНЫЕ ОЖИДАНИЯ - ожидания по умолчанию (быстрее, чем явные)
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // DEPRECATED
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4 style

        // ЯВНЫЕ ОЖИДАНИЯ - ожидания по конкретному элементу
        // to wait for an element to appear within 10 seconds:
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));


        driver.get("https://google.com");


    }
}

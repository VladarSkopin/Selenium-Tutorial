import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTypesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



    }
}

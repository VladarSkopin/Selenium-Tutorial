import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DownloadLinkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bona-capona.ru/menu-page.php");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"me-p_map\"]/div/div[1]/div/div/div/div/a[1]"));
        element.click();
    }
}

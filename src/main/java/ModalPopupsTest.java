import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ModalPopupsTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT

        try {

            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(2000);

            WebElement element1 = driver.findElement(By.id("a"));
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));

            element1.click();
            Alert alertOld = driver.switchTo().alert(); // CLASSIC WAY OF SWITCHING TO ALERT (DANGEROUS! MAY NOT BE PRESENT YET!)
            Alert alert = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert.accept(); // "OK" button

            element2.click();
            Alert prompt = wait.until(alertIsPresent());
            Thread.sleep(5000);
            prompt.sendKeys("I love you too doggy!");
            prompt.accept();
            Thread.sleep(5000);
            Alert alert2 = wait.until(alertIsPresent());
            alert2.accept();


            element3.click();
            Thread.sleep(2000);
            Alert comfirm = wait.until(alertIsPresent());
            comfirm.dismiss();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }


    }
}

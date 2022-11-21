import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class WaitTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {

            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);

            List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            List<WebElement> pagesList = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));

            String text = elementList.get(5).getText();
            System.out.println("text = " + text);

            // USING PAGINATION
            pagesList.get(2).click();
            // WAIT UNTIL NEW LIST IS LOADED AFTER PAGINATION
            wait.until(ExpectedConditions.stalenessOf(elementList.get(5)));
            //wait.until(ExpectedConditions.elementToBeClickable(elementList.get(5)));

            // UPDATE LIST AFTER PAGINATION
            elementList = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));

            text = elementList.get(5).getText();
            System.out.println("text = " + text);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(10000);
            driver.quit();
        }


    }
}

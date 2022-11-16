import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class BrowserTabsTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        try {

            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle(); // current window descriptor (~ window id) -> String

            jsExecutor.executeScript("window.open()");

            Thread.sleep(1000);

            Set<String> currentWindows = driver.getWindowHandles(); // now we have 2 windows open

            String window2 = null;

            for (String window : currentWindows) {
                if(!window.equals(window1)) {
                    window2 = window;
                    break;
                }
            }

            driver.switchTo().window(window2);
            driver.get("https://www.timeanddate.com/time/map/");
            Thread.sleep(3000);
            driver.close(); // CLOSE CURRENT WINDOW
            driver.switchTo().window(window1); // OPTIONAL ???

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }


    }
}

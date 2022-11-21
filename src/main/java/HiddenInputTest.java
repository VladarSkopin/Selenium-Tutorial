import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class HiddenInputTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        try {

            driver.get("https://studio.youtube.com/channel/UCwq8UBdMnS0FcRjObYA-ugw/videos/upload?d=ud&filter=%5B%5D&sort=%7B%22columnType%22%3A%22date%22%2C%22sortOrder%22%3A%22DESCENDING%22%7D");
            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath("//input[@type='file']"));

            jsExecutor.executeScript("document.querySelector('input[type='file']').setAttribute('style', 'opacity:1')");
            jsExecutor.executeScript("document.querySelector('input[type='file']').setAttribute('style', 'display:block')");
            jsExecutor.executeScript("document.querySelector('input[type='file']').setAttribute('style', 'height:300px')");
            jsExecutor.executeScript("document.querySelector('input[type='file']').setAttribute('style', 'width:300px')");

            element.sendKeys("D:\\Etc\\3 Photos\\2022\\summer\\video_2022-07-24_09-31-39.mp4");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}

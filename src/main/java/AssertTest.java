import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class AssertTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(2000);

            String title = driver.getTitle(); // <title>Document</title>
            System.out.println(title);

            Assert.assertEquals(title, "Document");
            //Assert.assertEquals(title, "Dogument"); // expected [Dogument] but found [Document]
            //Assert.assertEquals(12, "Document"); // expected [Document] but found [12]


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}

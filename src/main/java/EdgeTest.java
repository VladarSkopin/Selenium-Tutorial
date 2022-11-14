import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\SeleniumProjectsQA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
    }
}

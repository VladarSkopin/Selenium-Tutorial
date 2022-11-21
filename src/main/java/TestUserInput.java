import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUserInput {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com/");

        // //input[@name='q']
        // //*[@id="u105-search-form-autocomplete--3"]

        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        //WebElement element = driver.findElement(By.xpath("//*[@id=\"u105-search-form-autocomplete--3\"]"));
        element.sendKeys("Python", Keys.ENTER);

    }
}

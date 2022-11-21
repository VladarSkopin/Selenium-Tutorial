import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("KFC world map");
        driver.findElement(By.name("q")).submit();

        //WebElement searchIcon = driver.findElement(By.name("btnK"));
        //searchIcon.click();


    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumProjectsQA\\chromedriver.exe");

        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}

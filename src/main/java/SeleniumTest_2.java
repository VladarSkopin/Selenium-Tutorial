import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.avito.ru/");

        // Получить атрибуты веб элементов
        WebElement elementLink = driver.findElement(By.xpath("//a[text()='Работа']"));
        System.out.println("text = " + elementLink.getAttribute("text"));
        System.out.println("class = " + elementLink.getAttribute("class"));
        System.out.println("clientWidth = " + elementLink.getAttribute("clientWidth"));


        // getText -> to get the text exactly the way it's shown to the user
        String elementText = elementLink.getText();
        System.out.println("element text = " + elementText);


    }
}

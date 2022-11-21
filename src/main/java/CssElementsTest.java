import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElementsTest {
    public static void main(String[] args) {
        // TESTING CSS ELEMENTS

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://devby.io/");

        WebElement element = driver.findElement(By.xpath("//a[@href=\"https://id.devby.io/@/hello\"]"));

        String parCssValue1 = element.getCssValue("display");
        String parCssValue2 = element.getCssValue("transition"); // can be not adequate in other browsers !
        String parCssValue3 = element.getCssValue("height");
        String parCssValue4 = element.getCssValue("color");
        String parCssValue5 = element.getCssValue("font-weight");
        String parCssValue6 = element.getCssValue("font-size");

        System.out.println("display = " + parCssValue1);
        System.out.println("transition (careful!) = " + parCssValue2);
        System.out.println("height = " + parCssValue3);
        System.out.println("color = " + parCssValue4);
        System.out.println("font-weight = " + parCssValue5);
        System.out.println("font-size = " + parCssValue6);

    }
}

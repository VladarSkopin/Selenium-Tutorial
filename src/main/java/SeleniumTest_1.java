import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        System.out.println("Going to -> https://www.avito.ru/rossiya/avtomobili");
        driver.get("https://www.avito.ru/rossiya/avtomobili");


        // TO GET ATTRIBUTES OF ELEMENTS

        WebElement element = driver.findElement(By.xpath("//a[@title=\"Транспорт\"]"));

        String par1 = element.getAttribute("title");
        String par2 = element.getAttribute("scrollHeight");

        System.out.println("title = " + par1);
        System.out.println("scrollHeight = " + par2);

/*

        // NoSuchElementException -> Unable to locate element: {"method":"xpath","selector":"div[aria-label='Серебряный']"}
        WebElement element2 = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("div[aria-label='Серебряный']"))));

        element2.click();
*/

        System.out.println("Going to -> https://www.avito.ru/");
        driver.get("https://www.avito.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("https://www.avito.ru/ is opened!");

        WebElement elementLink = driver.findElement(By.xpath("//a[text()='Одежда, обувь и аксессуары']"));
        String parLink = elementLink.getAttribute("href");

        System.out.println("href = " + parLink);

        System.out.println("Click on 'Одежда, обувь и аксессуары'");
        elementLink.click();


        // DROPDOWN BUTTON -> OPTION
        // //select[@name='category_id']

        WebElement elementCategory = driver.findElement(By.xpath("//select[@name='category_id']"));
        System.out.println("Click on //select[@name='category_id']");
        elementCategory.click();

        WebElement elementOption = driver.findElement(By.xpath("//option[@value='24']"));
        String parOptionValue = elementOption.getAttribute("value");
        String parOptionSelected = elementOption.getAttribute("selected");
        String parOptionBaseUri = elementOption.getAttribute("baseURI");

        System.out.println("option value = " + parOptionValue);
        System.out.println("option selected = " + parOptionSelected);
        System.out.println("option baseURI = " + parOptionBaseUri);

        System.out.println("Click on //option[@value='24']");
        elementOption.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // DOESN'T WAIT.... WHY ???
        driver.quit();
    }
}

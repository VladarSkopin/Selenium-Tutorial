import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumProjectsQA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.avito.ru/rossiya/avtomobili");


        // TO GET ATTRIBUTES OF ELEMENTS

        WebElement element = driver.findElement(By.xpath("//a[@title=\"Транспорт\"]"));

        String par1 = element.getAttribute("title");
        String par2 = element.getAttribute("scrollHeight");

        System.out.println("title = " + par1);
        System.out.println("scrollHeight = " + par2);
    }
}

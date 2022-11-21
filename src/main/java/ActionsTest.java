import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            Thread.sleep(2000);

            // //div[@id='draggable']
            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            //actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform();
            //actions.dragAndDropBy(element1, 200, 200);
            //actions.dragAndDrop(element2, element1);
            actions.moveToElement(element1).pause(5000).clickAndHold().moveToElement(element2).pause(5000).release().build().perform();

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {

            Thread.sleep(10000);
            driver.quit();

        }




    }
}

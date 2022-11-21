import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KFCTest_Edge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("https://global.kfc.com/our-locations/");
        driver.get("https://global.kfc.com/");

        Thread.sleep(4000);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        // GOING TO "OUR LOCATIONS"
        //WebElement elementLink = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/a"));
        WebElement elementLink = driver.findElement(By.linkText("View Our Locations"));
        elementLink.click();
        Thread.sleep(4000);
        System.out.println("Current URL = " + driver.getCurrentUrl());

        WebElement elementTab = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div[2]/div[2]/div/div[1]/div/div[4]/div[1]"));
        System.out.println(elementTab.getAttribute("class"));
        System.out.println(elementTab.getText());
        elementTab.click();

        Thread.sleep(5000);
        driver.quit();

    }
}

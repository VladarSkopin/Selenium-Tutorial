import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

// PAGE-OBJECT MODEL
public class LoginPage {

    WebDriver driver;
    WebElement loginInput;
    WebElement passwordInput;
    WebElement enterBtn;

    public LoginPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        Thread.sleep(3000);
        loginInput = driver.findElement(By.id("login"));
        passwordInput = driver.findElement(By.id("pass"));
        enterBtn = driver.findElement(By.id("enter"));
    }

    public void login(String loginText, String passwordText) {
        loginInput.sendKeys(loginText);
        passwordInput.sendKeys(passwordText);
        enterBtn.click();
    }

    public void clickOnAlertWithPacing(long pacingMillisec) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT
        Thread.sleep(pacingMillisec);
        Alert alert = wait.until(alertIsPresent());
        alert.accept(); // "OK" button
    }

    public void quitDriver() {
        driver.quit();
    }

}

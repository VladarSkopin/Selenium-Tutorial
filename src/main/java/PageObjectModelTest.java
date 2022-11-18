
public class PageObjectModelTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjectsQA\\chromedriver.exe");

        LoginPage lp = new LoginPage(); // Page-Object class
        lp.login("admin", "1qaz@WSX");
        lp.clickOnAlertWithPacing(2500);
        lp.quitDriver();

    }
}

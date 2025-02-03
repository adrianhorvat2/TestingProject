import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String testURL = "https://www.hgspot.hr/";

    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();
        driver.navigate().to(testURL);
        acceptCookiesIfNeeded();
    }

    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }

    public void acceptCookiesIfNeeded() {
        try {
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Prihvaćam sve')]")));
            acceptCookiesButton.click();
        } catch (Exception e) {
            System.out.println("No cookie consent banner found or already accepted.");
        }
    }
}
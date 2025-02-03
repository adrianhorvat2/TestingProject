import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTest extends BaseTest {

    @Test
    public void searchForIPhone() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iPhone");

        WebElement search = driver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/form/button"));
        search.click();
        Thread.sleep(4000);

        WebElement IPhoneProduct = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div[1]/div/section[1]/div[2]/h2/a"));
        Thread.sleep(2000);

        String actualText = IPhoneProduct.getText();
        boolean actual = actualText.contains("iPhone");
        boolean expected = true;

        Assert.assertEquals(actual, expected);

    }
}

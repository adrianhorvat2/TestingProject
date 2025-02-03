import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartAmountTest extends BaseTest {

    @Test
    public void checkCartAmount() throws InterruptedException {

        WebElement ITEquipment = driver.findElement(By.xpath("/html/body/div[4]/nav/ul/li[2]/a"));
        ITEquipment.click();
        Thread.sleep(2000);

        WebElement motherboards = driver.findElement(By.xpath("/html/body/div[4]/nav/ul/li[2]/div/div[1]/nav/a[1]"));
        motherboards.click();
        Thread.sleep(2000);

        WebElement buy = driver.findElement(By.xpath("/html/body/div[5]/div/section/div[4]/div[1]/div[3]/div[2]/a/span"));
        buy.click();
        Thread.sleep(2000);

        WebElement increaseAmount = driver.findElement(By.xpath("/html/body/div[6]/div[1]/form/div/button[1]"));
        for (int i = 0; i < 4; i++) {
            increaseAmount.click();
        }

        WebElement goToCart = driver.findElement(By.xpath("/html/body/div[6]/div[1]/a[2]"));
        goToCart.click();
        Thread.sleep(2000);

        double expectedAmount = 5;

        WebElement amount = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/ul/li/div[5]/input"));
        String amountValue = amount.getAttribute("value");
        double actualAmount = Double.parseDouble(amountValue);

        Assert.assertEquals(actualAmount, expectedAmount);
    }
}
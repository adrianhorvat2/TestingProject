import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidDiscountTest extends BaseTest {

    @Test
    public void FirstProductValidDiscount() throws InterruptedException {

        WebElement discountNav = driver.findElement(By.xpath("/html/body/div[4]/nav/ul/li[9]/a"));
        discountNav.click();
        Thread.sleep(2000);

        WebElement discounts = driver.findElement(By.xpath("/html/body/div[4]/nav/ul/li[9]/div/div/nav/a[1]"));
        discounts.click();
        Thread.sleep(4000);

        WebElement oldPriceOfProduct = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]"));
        String oldPriceText = oldPriceOfProduct.getText();
        double oldPrice = parsePrice(oldPriceText);

        WebElement newPriceOfProduct = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/section[1]/div[3]/div[1]/div[3]"));
        String newPriceText = newPriceOfProduct.getText();
        double newPrice = parsePrice(newPriceText);

        Assert.assertTrue(newPrice<oldPrice);

    }

    public static double parsePrice(String price) {
        price = price.replaceAll("[^0-9,\\.]", "");
        price = price.replace(".", "").replace(",", ".");
        return Double.parseDouble(price);
    }
}

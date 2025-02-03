import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortByPriceTest extends BaseTest{

    @Test
    public void sortProcessorsByPrice() {

        driver.manage().window().maximize();

        WebElement ITEquipment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/nav/ul/li[2]/a")));
        ITEquipment.click();

        WebElement processors = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/nav/ul/li[2]/div/div[1]/nav/a[2]")));
        processors.click();

        WebElement sortMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[3]/div/select")));
        sortMenu.click();

        WebElement descending = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/section/div[3]/div/select/option[2]")));
        descending.click();

        WebElement mostExpensiveProcessor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[4]/div[1]/div[3]/div[1]/div/div/span[1]")));
        String mostExpensiveProcessorText = mostExpensiveProcessor.getText();
        double mostExpensiveProcessorPrice = parsePrice(mostExpensiveProcessorText);

        WebElement secondMostExpensiveProcessor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[4]/div[2]/div[3]/div[1]/div/div/span[1]")));
        String secondMostExpensiveProcessorText = secondMostExpensiveProcessor.getText();
        double secondMostExpensiveProcessorPrice = parsePrice(secondMostExpensiveProcessorText);

        Assert.assertTrue(mostExpensiveProcessorPrice > secondMostExpensiveProcessorPrice);
    }

    public static double parsePrice(String priceText) {
        return Double.parseDouble(priceText.replace(",", "."));
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MouseCategoryValidationTest extends BaseTest {

    public void navigateToMouseCategory() {

        WebElement ITEquipment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/nav/ul/li[2]/a")));
        ITEquipment.click();

        WebElement mouses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/nav/ul/li[2]/div/div[5]/nav/a[1]")));
        mouses.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/form/div[3]/ul/a[7]")));
    }

    @Test
    public void ASUSCategoryValidation() {

        navigateToMouseCategory();

        WebElement asusCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/section/form/div[3]/ul/a[7]")));
        asusCategory.click();

        WebElement asusMouse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[3]/div[1]/div[2]/h2/a")));

        String actualText = asusMouse.getText();
        boolean actual = actualText.toUpperCase().contains("ASUS");
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void LogitechCategoryValidation() {

        navigateToMouseCategory();

        WebElement logitechCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/section/form/div[3]/ul/a[3]")));
        logitechCategory.click();

        WebElement logitechMouse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[3]/div[1]/div[2]/h2/a")));

        String actualText = logitechMouse.getText();
        boolean actual = actualText.toUpperCase().contains("LOGITECH");
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RazerCategoryValidation() {

        navigateToMouseCategory();

        WebElement razerCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/section/form/div[3]/ul/a[21]")));
        razerCategory.click();

        WebElement razerMouse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/section/div[3]/div[1]/div[2]/h2/a")));

        String actualText = razerMouse.getText();
        boolean actual = actualText.toUpperCase().contains("RAZER");
        boolean expected = true;

        Assert.assertEquals(actual, expected);
    }
}
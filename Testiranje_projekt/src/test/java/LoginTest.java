import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    public void navigateToLogin() throws InterruptedException {

        WebElement loginPage = driver.findElement(By.xpath("/html/body/div[2]/div/nav[2]/a[5]"));
        loginPage.click();
        Thread.sleep(4000);
    }

    @Test
    public void testEmailInput() throws InterruptedException {

        navigateToLogin();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='input-email']"));
        emailInput.sendKeys("testProjekt@test.com");

        String expected = "testProjekt@test.com";

        Assert.assertEquals(emailInput.getAttribute("value"), expected);
    }

    @Test
    public void testPasswordInput() throws InterruptedException {

        navigateToLogin();

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='input-password']"));
        passwordInput.sendKeys("Test1234");

        String enteredPassword = passwordInput.getAttribute("value");
        String expectedPassWord = "Test1234";

        Assert.assertEquals(enteredPassword, expectedPassWord);
    }

    @Test
    public void invalidLogin() throws InterruptedException {

        navigateToLogin();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='input-email']"));
        emailInput.sendKeys("testProjekt@test.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='input-password']"));
        passwordInput.sendKeys("Test1234");

        WebElement login = driver.findElement(By.xpath("/html/body/div[5]/div/form/div[2]/input"));
        login.click();
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.xpath("/html/body/div[5]/div[2]/form/div[1]"));

        String actual = message.getText();
        String expected = "E-mail ili lozinka nisu ispravni.";

        Assert.assertEquals(actual, expected);
    }
}
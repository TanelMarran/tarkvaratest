import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.*;

public class BasicTest extends TestHelper {


    private String username = "Admin";
    private String password = "AdminPassword";

    @Test
    public void titleExistsTest(){
        String expectedTitle = "ST Online Store";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);
    }


    /*
    In class Exercise

    Fill in loginLogoutTest() and login mehtod in TestHelper, so that the test passes correctly.

     */
    @Test
    public void loginLogoutTest(){

        login(username, password);

        // assert that correct page appeared
        assertFalse(isElementPresent(By.id("Admin")));

        logout();

        assertTrue(isElementPresent(By.id("Admin")));
    }

    /*
    In class Exercise

     Write a test case, where you make sure, that one can’t log in with a false password

     */
    @Test
    public void loginFalsePassword() {
        login(username,"WrongPassword");

        WebElement adminHeader = driver.findElement(By.id("notice"));
        assertNotNull(adminHeader);
    }

    @Test
    public void CreateUser() {
        driver.get(baseUrlAdmin);

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("user_name")).sendKeys("user123");

        driver.findElement(By.id("user_password")).sendKeys("password");

        driver.findElement(By.id("user_password_confirmation")).sendKeys("password");

        By loginButtonXpath = By.xpath("//input[@value='Create User']");

        driver.findElement(loginButtonXpath).click();

        assertTrue(isElementPresent(By.id("notice")));

        driver.findElement(By.linkText("Admin")).click();

        new WebDriverWait(driver, waitForResposeTime).ignoring(
                StaleElementReferenceException.class).until(
                ExpectedConditions.elementToBeClickable(By.linkText("Delete"))
        );
        driver.findElement(By.linkText("Delete")).click();

        assertTrue(isElementPresent(By.id("notice")));

        driver.findElement(By.linkText("Admin")).click();
    }
}

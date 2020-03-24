import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

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
        WebElement adminHeader = null;
        try { adminHeader = driver.findElement(By.id("Admin")); } catch (Exception ignored) { }
        assertNull(adminHeader);

        logout();

        adminHeader = driver.findElement(By.id("Admin"));
        assertNotNull(adminHeader);
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

}

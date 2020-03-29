import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.*;

public class BasicTest extends TestHelper {

    private String username = "Admin";
    private String password = "AdminPassword";

    public boolean AddItem(String title, String description, String typestring, String value) {
        driver.get("https://morning-castle-68632.herokuapp.com/products");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.linkText("New product")).click();

        driver.findElement(By.id("product_title")).sendKeys(title);
        driver.findElement(By.id("product_description")).sendKeys(description);
        Select type = new Select(driver.findElement(By.id("product_prod_type")));
        type.selectByValue(typestring);
        driver.findElement(By.id("product_price")).sendKeys(value);

        By loginButtonXpath = By.xpath("//input[@value='Create Product']");

        driver.findElement(loginButtonXpath).click();

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(title)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

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
    @Test //1
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
    @Test //2, negative 1
    public void loginFalsePassword() {
        login(username,"WrongPassword");

        WebElement adminHeader = driver.findElement(By.id("notice"));
        assertNotNull(adminHeader);
    }

    @Test //3
    public void CreateUser() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("user_name")).sendKeys("user123");

        driver.findElement(By.id("user_password")).sendKeys("password");

        driver.findElement(By.id("user_password_confirmation")).sendKeys("password");

        By loginButtonXpath = By.xpath("//input[@value='Create User']");

        wait.until(ExpectedConditions.presenceOfElementLocated(loginButtonXpath)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'User user123 was successfully created.')]")));
        assertTrue(isElementPresent(By.xpath("//*[contains(text(), 'User user123 was successfully created.')]")));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body[@class='admin']/div[@id='column2']/div[@id='main']/p[@id='user123']/a[2]"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'User was successfully deleted.')]")));
        assertTrue(isElementPresent(By.xpath("//*[contains(text(), 'User was successfully deleted.')]")));
    }

    @Test //4
    public void AddItem() {
        driver.get(baseUrlAdmin);

        login(username, password);

        assertTrue(AddItem("good book","Wow such a fantastic book","Books","12.99"));

        By loginButtonXpath = By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='good book']/td[@class='list_actions'][2]/a");

        driver.findElement(loginButtonXpath).click();

        assertTrue(isElementPresent(By.xpath("//*[text()='Product was successfully destroyed.']")));
    }

    @Test //5, negative 2
    public void Create2UserSameName() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("user_name")).sendKeys("user123");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.id("user_password_confirmation")).sendKeys("password");

        By xpath = By.xpath("//input[@value='Create User']");

        driver.findElement(xpath).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click();

        //driver.findElement(By.linkText("Logout")).click();

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("user_name")).sendKeys("user123");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.id("user_password_confirmation")).sendKeys("password");

        xpath = By.xpath("//input[@value='Create User']");

        driver.findElement(xpath).click();

        assertTrue(isElementPresent(By.xpath("//*[contains(text(), 'Name has already been taken')]")));

        login("user123","password");

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body[@class='admin']/div[@id='column2']/div[@id='main']/p[@id='user123']/a[2]"))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'User was successfully deleted.')]")));
        assertTrue(isElementPresent(By.xpath("//*[contains(text(), 'User was successfully deleted.')]")));
    }

    @Test //6, negative 3
    public void Add2SameItems() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        login(username, password);

        AddItem("good book","Wow such a fantastic book","Books","12.99");

        assertFalse(AddItem("good book","Wow such a fantastic book","Books","12.99"));

        driver.get("https://morning-castle-68632.herokuapp.com/products");

        By loginButtonXpath = By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='good book']/td[@class='list_actions'][2]/a");

        wait.until(ExpectedConditions.presenceOfElementLocated(loginButtonXpath)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product was successfully destroyed.']"))).click();
        assertTrue(isElementPresent(By.xpath("//*[text()='Product was successfully destroyed.']")));
    }

    @Test //7
    public void EditItem() {
        driver.get(baseUrlAdmin);

        login(username, password);

        AddItem("good book","Wow such a fantastic book","Books","12.99");

        driver.findElement(By.linkText("Products")).click();

        driver.findElement(By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='good book']/td[@class='list_actions'][1]/a")).click();

        driver.findElement(By.id("product_title")).clear();
        driver.findElement(By.id("product_title")).sendKeys("the best book");

        By loginButtonXpath = By.xpath("//input[@value='Update Product']");
        driver.findElement(loginButtonXpath).click();

        new WebDriverWait(driver, waitForResposeTime).ignoring(
                StaleElementReferenceException.class).until(
                ExpectedConditions.elementToBeClickable(By.linkText("Products"))
        );

        driver.findElement(By.linkText("Products")).click();

        assertTrue(isElementPresent(By.xpath("//*[contains(text(), 'the best book')]")));
        assertFalse(isElementPresent(By.xpath("//*[contains(text(), 'good book')]")));

        String xpath = "/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='the best book']/td[@class='list_actions'][2]/a";

        driver.findElement(By.xpath(xpath)).click();
    }

    @Test //8
    public void AddToCart() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        login(username,password);

        AddItem("item","description","Books","1.25");

        logout();

        driver.get(baseUrl);

        String xpath = "//input[@value='Add to Cart']";

        driver.findElement(By.xpath(xpath)).click();

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[2]";

        assertTrue(isElementPresent(By.xpath(xpath)));

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/form[@class='button_to'][1]/input[2]";

        driver.findElement(By.xpath(xpath)).click();

        driver.get(baseUrlAdmin);

        login(username,password);

        By loginButtonXpath = By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='item']/td[@class='list_actions'][2]/a");

        wait.until(ExpectedConditions.presenceOfElementLocated(loginButtonXpath)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product was successfully destroyed.']"))).click();

        logout();
    }

    @Test //9
    public void IncreaseInCart() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        login(username,password);

        AddItem("item","description","Books","1.25");

        logout();

        driver.get(baseUrl);

        String xpath = "//input[@value='Add to Cart']";

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[2]";

        assertTrue(isElementPresent(By.xpath(xpath)));

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[@class='quantity'][2]/a";

        for (int i = 0; i < 9; i++) {
            WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            clickable.click();
            wait.until(ExpectedConditions.textToBe(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]"),(i+2)+"×"));
            assertEquals((i+2)+"×", driver.findElement(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]")).getAttribute("innerHTML"));
        }

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/form[@class='button_to'][1]/input[2]";

        driver.findElement(By.xpath(xpath)).click();

        driver.get(baseUrlAdmin);

        login(username,password);

        By loginButtonXpath = By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='item']/td[@class='list_actions'][2]/a");

        wait.until(ExpectedConditions.presenceOfElementLocated(loginButtonXpath)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product was successfully destroyed.']"))).click();

        logout();
    }

    @Test //10
    public void DecreaseInCart() {
        driver.get(baseUrlAdmin);
        WebDriverWait wait = new WebDriverWait(driver,10);

        login(username,password);

        AddItem("item","description","Books","1.25");

        logout();

        driver.get(baseUrl);

        String xpath = "//input[@value='Add to Cart']";

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[2]";

        assertTrue(isElementPresent(By.xpath(xpath)));

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[@class='quantity'][2]/a";

        for (int i = 0; i < 9; i++) {
            WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            clickable.click();
            wait.until(ExpectedConditions.textToBe(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]"),(i+2)+"×"));
            assertEquals((i+2)+"×", driver.findElement(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]")).getAttribute("innerHTML"));
        }

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[@class='quantity'][1]/a";

        for (int i = 8; i >= 0; i--) {
            WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            clickable.click();
            wait.until(ExpectedConditions.textToBe(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]"),(i+1)+"×"));
            assertEquals((i+1)+"×", driver.findElement(By.xpath("/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/table/tbody/tr[@id='current_item']/td[1]")).getAttribute("innerHTML"));
        }

        WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        clickable.click();

        xpath = "/html/body[@class='store']/div[@id='column2']/div[@id='side']/div[@id='cart']/form[@class='button_to'][1]/input[2]";

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
        assertFalse(isElementPresent(By.xpath(xpath)));

        driver.get(baseUrlAdmin);

        login(username,password);

        By loginButtonXpath = By.xpath("/html/body[@class='products']/div[@id='column2']/div[@id='main']/div[@class='products_column']/table/tbody/tr[@id='item']/td[@class='list_actions'][2]/a");

        wait.until(ExpectedConditions.presenceOfElementLocated(loginButtonXpath)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Product was successfully destroyed.']"))).click();

        logout();
    }
}

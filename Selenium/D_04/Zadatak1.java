package Zadaca.Zadaca4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Zadatak1 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void testValidCredentials() {
        navigateToLoginPage();
        login("admin", "admin");
        assertSuccessfulLogin();
    }

    @Test
    public void testInvalidUsername() {
        navigateToLoginPage();
        login("invalid", "admin");
    }

    @Test
    public void testInvalidUsernameShort() {
        navigateToLoginPage();
        login("adm", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithNumber() {
        navigateToLoginPage();
        login("1admin", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithSpecialCharacter() {
        navigateToLoginPage();
        login("admin*", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithSpecialCharacters() {
        navigateToLoginPage();
        login("ad&min&", "admin");
    }


    @Test
    public void testInvalidPassword() {
        navigateToLoginPage();
        login("admin", "invalid");
    }

    @Test
    public void testInvalidPasswordShort() {
        navigateToLoginPage();
        login("admin", "adm");
    }

    @Test
    public void testInvalidPasswordUpperCaseLetters() {
        navigateToLoginPage();
        login("admin", "AdmiN");
    }

    @Test
    public void testInvalidPasswordAllUpperCaseLetters() {
        navigateToLoginPage();
        login("admin", "ADMIN");
    }

    @Test
    public void testInvalidPasswordWithNumbers() {
        navigateToLoginPage();
        login("admin", "1admin");
    }

    @Test
    public void testInvalidPasswordSpecialCharacter() {
        navigateToLoginPage();
        login("admin", "admin*");
    }

    @Test
    public void testInvalidPasswordSpecialCharacters() {
        navigateToLoginPage();
        login("admin", "%admin+");
    }

    @Test
    public void testEmptyUsername() {
        navigateToLoginPage();
        login("", "admin");
    }

    @Test
    public void testEmptyPassword() {
        navigateToLoginPage();
        login("admin", "");
    }

    private void navigateToLoginPage() {
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    private void login(String username, String password) {
        String credentials = username + ":" + password;
        String url = "https://" + credentials + "@the-internet.herokuapp.com/basic_auth";
        driver.get(url);
    }

    private void assertSuccessfulLogin() {
        WebElement successMessage = driver.findElement(By.cssSelector(".example > p"));
        Assert.assertTrue(successMessage.isDisplayed(), "Successful login message is not displayed");
        Assert.assertEquals(successMessage.getText(), "Congratulations! You must have the proper credentials.", "Invalid successful login message");
    }

}





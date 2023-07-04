package Zadaca.Zadaca5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak1 {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginUser("IvanBjelogrlic", ":Xk;&$VpYH7L,QF5~f+D");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        executor = (JavascriptExecutor) driver;
    }

    private void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }


    @Test
    public void testAddOneBook() {
        driver.navigate().to("https://demoqa.com/books");
        addBookToCollection(driver, executor, wait, "#see-book-Git\\ Pocket\\ Guide");
    }

    @Test
    public void testAddTwoBooks() {
        driver.navigate().to("https://demoqa.com/books");
        addBookToCollection(driver, executor, wait, "#see-book-Git\\ Pocket\\ Guide");
        clickBackToBookStore();
        addBookToCollection(driver, executor, wait, "#see-book-Learning\\ JavaScript\\ Design\\ Patterns");
    }

    @Test
    public void testAddThreeBooks() {
        driver.navigate().to("https://demoqa.com/books");
        addBookToCollection(driver, executor, wait, "#see-book-Git\\ Pocket\\ Guide");
        clickBackToBookStore();
        addBookToCollection(driver, executor, wait, "#see-book-Learning\\ JavaScript\\ Design\\ Patterns");
        executor.executeScript("document.evaluate(\"//*[text()='Back To Book Store']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
        }
        addBookToCollection(driver, executor, wait, "#see-book-Designing\\ Evolvable\\ Web\\ APIs\\ with\\ ASP\\.NET");
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    private void addBookToCollection(WebDriver driver, JavascriptExecutor executor, WebDriverWait wait, String bookSelector) {
        By selector = By.cssSelector(bookSelector);
        WebElement book = this.wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        book.click();
    }

    private void clickBackToBookStore() {
        String script = "document.querySelector('#addNewRecordButton').click();";
        executor.executeScript(script);
    }

    private void loginUser(String username, String password) {
        driver.navigate().to("https://demoqa.com/login");
        WebElement userField = driver.findElement(By.cssSelector("#userName"));
        userField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.cssSelector("#login"));
        loginBtn.click();
    }
}
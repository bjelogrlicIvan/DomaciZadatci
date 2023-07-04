package Zadaca.Zadatak3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");

        driver.manage().addCookie(new Cookie("userID", "8ec84155-9318-4c05-b239-b4455a4063c4"));
        driver.manage().addCookie(new Cookie("userName", "IvanBjelogrlic"));
        driver.manage().addCookie(new Cookie("expires", "2023-06-13T23%3A59%3A06.073Z"));
        driver.manage().addCookie(new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ikl2YW5CamVsb2dybGljIiwicGFzc3dvcmQiOiI6WGs7JiRWcFlIN0wsUUY1fmYrRCIsImlhdCI6MTY4NjA5NTk0Nn0.QIvtIAOrRyYvn1SpTQIQCrKGOeiLX7afygZq1zhBiqI"));
        driver.navigate().refresh();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor executor = (JavascriptExecutor)driver;

        WebElement books = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(6) > div")));
        books.click();

        addBookToCollection(driver, executor, wait, "#see-book-Git\\ Pocket\\ Guide");

        WebElement backToBookStoreBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Back To Book Store']")));
        executor.executeScript("arguments[0].click();", backToBookStoreBtn);

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
        }

        addBookToCollection(driver, executor, wait, "#see-book-Learning\\ JavaScript\\ Design\\ Patterns > a");

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        driver.navigate().to("https://demoqa.com/login");
        WebElement username = driver.findElement(By.cssSelector("#userName"));

        username.sendKeys("IvanBjelogrlic");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys(":Xk;&$VpYH7L,QF5~f+D");
        WebElement loginBtn = driver.findElement(By.cssSelector("#login"));
        loginBtn.click();

        //driver.quit();
    }

    private static void addBookToCollection(WebDriver driver, JavascriptExecutor executor, WebDriverWait wait, String bookSelector) {
        WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(bookSelector)));
        book.click();

        WebElement addToCollectionBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Add To Your Collection']")));
        executor.executeScript("arguments[0].click();", addToCollectionBtn);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}

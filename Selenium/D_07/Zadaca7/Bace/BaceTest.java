package Zadaca.Zadaca7.Bace;

import Zadaca.Zadaca7.Pages.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaceTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public SignIn signIn;

    public String homeURL;

    @BeforeClass
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signIn = new SignIn(driver);
        ExcelReader excelReader = new ExcelReader("src/test/java/Zadaca/Zadaca7/TestData.xlsx");
        homeURL = excelReader.getStringData("URL", 2, 0);
    }

    public void waitForURL(String URL) {
        wait.until(ExpectedConditions.urlToBe(URL));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}

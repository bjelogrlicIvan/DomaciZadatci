package Zadaca.Zadaca6.Bace;

import Zadaca.Zadaca6.Pages.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaceTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public SignIn signIn;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        signIn = new SignIn(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}

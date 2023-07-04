package Zadaca.Zadatak2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NegativeCase2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.cssSelector("#menu-item-20 > a"));
        practice.click();

        WebElement login = driver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > div.wp-block-columns.is-layout-flex.wp-container-3 > div:nth-child(1) > p > a"));
        login.click();

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("STUDENT");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Password123");
        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.click();

        WebElement errorMessage = driver.findElement(By.cssSelector("#error"));
        Assert.assertTrue(errorMessage.isDisplayed());

        String errorMessageText = "Your username is invalid!";
        Assert.assertEquals(errorMessage.getText(), errorMessageText);

        driver.quit();
    }
}

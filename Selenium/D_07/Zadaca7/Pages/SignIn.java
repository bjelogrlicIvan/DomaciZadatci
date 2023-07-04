package Zadaca.Zadaca7.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignIn {
    public WebDriver driver;

    WebElement Username;
    WebElement Password;
    WebElement SignInButton;

    public WebElement getUsername() {
        return driver.findElement(By.cssSelector("#username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.cssSelector("#password"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void loginPage(String username, String password) {
        String credentials = username + ":" + password;
        String url = "https://" + credentials + "@the-internet.herokuapp.com/basic_auth";
        driver.get(url);

    }

    public void assertSuccessfulLogin() {
        WebElement successMessage = driver.findElement(By.cssSelector(".example > p"));
        Assert.assertTrue(successMessage.isDisplayed(), "Successful login message is not displayed");
        Assert.assertEquals(successMessage.getText(), "Congratulations! You must have the proper credentials.", "Invalid successful login message");
    }

}
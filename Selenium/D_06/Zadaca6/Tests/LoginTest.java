package Zadaca.Zadaca6.Tests;

import Zadaca.Zadaca6.Bace.BaceTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaceTest {
    @BeforeMethod
    public void login() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }


    @Test
    public void testValidCredentials() {
        signIn.loginPage("admin", "admin");
        signIn.assertSuccessfulLogin();

    }

    @Test
    public void testInvalidUsername() {
        signIn.loginPage("invalid", "admin");
    }

    @Test
    public void testInvalidUsernameShort() {
        signIn.loginPage("adm", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithNumber() {
        signIn.loginPage("1admin", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithSpecialCharacter() {
        signIn.loginPage("admin*", "admin");
    }

    @Test
    public void testInvalidUsernameStartsWithSpecialCharacters() {
        signIn.loginPage("ad&min&", "admin");
    }


    @Test
    public void testInvalidPassword() {
        signIn.loginPage("admin", "invalid");
    }

    @Test
    public void testInvalidPasswordShort() {
        signIn.loginPage("admin", "adm");
    }

    @Test
    public void testInvalidPasswordUpperCaseLetters() {
        signIn.loginPage("admin", "AdmiN");
    }

    @Test
    public void testInvalidPasswordAllUpperCaseLetters() {
        signIn.loginPage("admin", "ADMIN");
    }

    @Test
    public void testInvalidPasswordWithNumbers() {
        signIn.loginPage("admin", "1admin");
    }

    @Test
    public void testInvalidPasswordSpecialCharacter() {
        signIn.loginPage("admin", "admin*");
    }

    @Test
    public void testInvalidPasswordSpecialCharacters() {
        signIn.loginPage("admin", "%admin+");
    }

    @Test
    public void testEmptyUsername() {
        signIn.loginPage("", "admin");
    }

    @Test
    public void testEmptyPassword() {
        signIn.loginPage("admin", "");
    }
}
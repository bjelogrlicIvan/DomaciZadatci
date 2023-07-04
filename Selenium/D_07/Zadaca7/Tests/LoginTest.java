package Zadaca.Zadaca7.Tests;

import Zadaca.Zadaca7.Bace.BaceTest;
import Zadaca.Zadaca7.Bace.ExcelReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaceTest {

    String username;
    String password;
    String invalidUsername;
    String invalidPassword;
    ExcelReader excelReader;

    @BeforeMethod
    public void pageSetUp() throws IOException {
        driver.manage().window().maximize();
        driver.get(homeURL);
        excelReader = new ExcelReader("src/test/java/Zadaca/Zadaca7/TestData.xlsx");
        username = excelReader.getStringData("Login", 1, 0);
        password = excelReader.getStringData("Login", 1, 1);
        invalidUsername = excelReader.getStringData("Login", 1, 2);
        invalidPassword = excelReader.getStringData("Login", 1, 3);
    }

    @Test
    public void userCanLogin() {
        signIn.loginPage(username, password);
        signIn.assertSuccessfulLogin();
    }

    @Test
    public void userCannotLogInWithInvalidUsername() {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++) {
            invalidUsername = excelReader.getStringData("Login", i, 2);
            invalidPassword = excelReader.getStringData("Login", i, 3);
            signIn.loginPage(invalidUsername, invalidPassword);
        }
    }
}

package Zadaca.Zadaca10.Tests;

import Zadaca.Zadaca10.Base.BaseTest;
import Zadaca.Zadaca10.Pages.HomepagePage;
import Zadaca.Zadaca10.Pages.RadioButton;
import Zadaca.Zadaca10.Pages.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    public HomepagePage homepagePage;
    public RadioButton radioButton;
    public ButtonsPage buttonsPage;

    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        radioButton = new RadioButton();
        buttonsPage = new ButtonsPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test(priority = 10)
    public void radioButtonYesTest() {
        homepagePage.clickOnElements();
        radioButton.clickOnYesRadioButton();
        String actual_message = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p > span")).getText();
        assert actual_message.equals("Yes");
    }

    @Test(priority = 20)
    public void radioButtonImpressiveTest() {
        homepagePage.clickOnElements();
        radioButton.clickOnImpressiveRadioButton();
        String actual_message = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p > span")).getText();
        assert actual_message.equals("Impressive");
    }

    @Test(priority = 30)
    public void radioButtonNoTest() {
        homepagePage.clickOnElements();
        radioButton.clickOnNoRadioButton();
        WebElement element = driver.findElement(By.cssSelector("#noRadio"));
        boolean isDisabled = element.getAttribute("disabled") != null;
        assert isDisabled;
    }

    @Test(priority = 40)
    public void buttonDoubleClickButtonTest() {
        homepagePage.clickOnElements();
        buttonsPage.doubleClickButton();
        String actual_message = driver.findElement(By.cssSelector("#doubleClickMessage")).getText();
        assert actual_message.equals("You have done a double click");
    }

    @Test(priority = 50)
    public void buttonRightClickButtonTest() {
        homepagePage.clickOnElements();
        buttonsPage.rightClickButton();
        String actual_message = driver.findElement(By.cssSelector("#rightClickMessage")).getText();
        assert actual_message.equals("You have done a right click");
    }
    @Test(priority = 60)
    public void buttonLeftClickButtonTest() {
        homepagePage.clickOnElements();
        buttonsPage.leftClickButton();
        String actual_message = driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
        assert actual_message.equals("You have done a dynamic click");
    }

    @AfterMethod
    public void pageTearDown() {
        driver.manage().deleteAllCookies();
    }

}

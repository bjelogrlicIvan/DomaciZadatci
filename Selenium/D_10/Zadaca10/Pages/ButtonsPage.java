package Zadaca.Zadaca10.Pages;

import Zadaca.Zadaca10.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BaseTest {

    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#item-4 > span")
    public WebElement button;

    @FindBy(css = "#doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(css = "#rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) button:last-of-type")
    public WebElement leftClickBtn;

    //--------------

    public void doubleClickButton() {
        button.click();
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
    }

    public void rightClickButton() {
        button.click();
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).build().perform();
    }

    public void leftClickButton() {
        button.click();
        leftClickBtn.click();
    }



}

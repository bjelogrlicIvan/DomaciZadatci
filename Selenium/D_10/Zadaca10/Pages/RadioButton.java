package Zadaca.Zadaca10.Pages;

import Zadaca.Zadaca10.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton extends BaseTest {

    public RadioButton() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#item-2")
    public WebElement radioButton;

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label")
    public WebElement yesRadioButton;

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label")
    public WebElement impressiveRadioButton;

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div.custom-control.disabled.custom-radio.custom-control-inline > label")
    public WebElement noRadioButton;

    //---------------------

    public void clickOnYesRadioButton() {
        radioButton.click();
        yesRadioButton.click();
    }
    public void clickOnNoRadioButton() {
        radioButton.click();
        noRadioButton.click();
    }
    public void clickOnImpressiveRadioButton() {
        radioButton.click();
        impressiveRadioButton.click();
    }




}

package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.PaintEvent;

public class items extends Parents {
    public items() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='wordpress-gdpr-popup-agree']")
    public WebElement accept;



}

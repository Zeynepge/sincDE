package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parents {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void clickFunction(WebElement element)
    {
        waitUntiliClickable(element);
        scrollToElement(element);
        element.click();
    }
    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public void waitUntiliClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



}

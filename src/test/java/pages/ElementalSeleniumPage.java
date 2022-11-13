package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class ElementalSeleniumPage extends BaseTest

{
    @FindBy (partialLinkText = "Sauce")
    WebElement sponsored;

    public ElementalSeleniumPage ()
    {PageFactory.initElements(driver,this);}


    public boolean messageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(sponsored));
        return sponsored.isDisplayed();
    }


    public String messageText() {
        wdWait.until(ExpectedConditions.visibilityOf(sponsored));
        return sponsored.getText();

    }

    public void moveToNewTab() {

        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }



}

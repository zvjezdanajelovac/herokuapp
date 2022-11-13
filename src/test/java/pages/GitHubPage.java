package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class GitHubPage extends BaseTest {
    @FindBy (linkText = "saucelabs")
    WebElement saucelabs;

    public GitHubPage()
    {
        PageFactory.initElements(driver,this);
    }

    public boolean messageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(saucelabs));
        return saucelabs.isDisplayed();

    }


    public String messageText() {
        wdWait.until(ExpectedConditions.visibilityOf(saucelabs));
        return saucelabs.getText();

    }

    //public void moveToNewPage() {

        //wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
       // ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
       // driver.switchTo().window(tabs.get(1));

    }






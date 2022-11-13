package pages;

import base.BaseTest;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class HerokuappLoginPage extends BaseTest
{

    @FindBy (id = "username")
WebElement username;
    @FindBy (id= "password")
WebElement password;
    @FindBy (css = "[type=\"submit\"]")
WebElement loginButton;
    @FindBy (partialLinkText = "Elemental")
WebElement elementalSelenium;
    @FindBy (css = "[alt=\"Fork me on GitHub\"]")
WebElement gitHub;
    @FindBy (css = "[class=\"flash error\"]")
    WebElement messageError;


    public HerokuappLoginPage() {
        PageFactory.initElements(driver, this);
    }

public HerokuappLoginPage insertUserName(String name)
{
    wdWait.until(ExpectedConditions.elementToBeClickable(username));
    username.clear();
    username.sendKeys(name);
    return this;

}

public HerokuappLoginPage insertPassword (String pass)
{
    wdWait.until(ExpectedConditions.elementToBeClickable(password));
    password.clear();
    password.sendKeys(pass);
    return this;
}

public HerokuappLoginPage clickOnLoginButton()
{
    wdWait.until(ExpectedConditions.elementToBeClickable(loginButton));
    loginButton.click();
    return this;
}

public HerokuappLoginPage clickOnGitHub()
{
    //wdWait.until(ExpectedConditions.elementToBeClickable(gitHub));
    gitHub.click();
    return this;

}


public HerokuappLoginPage clickOnSeleniumLink ()
{
    elementalSelenium.click();
    return this;
}

    public boolean messageIsDisplayed()
    {


        wdWait.until(ExpectedConditions.elementToBeClickable(messageError));
        return messageError.isDisplayed();
    }

    public String errorMessage()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(messageError));
        return  messageError.getText();
    }

}

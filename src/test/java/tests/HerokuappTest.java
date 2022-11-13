package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.ElementalSeleniumPage;
import pages.GitHubPage;
import pages.HerokuappLoginPage;
import pages.SuccessLoginPage;

public class HerokuappTest extends BaseTest

{
private HerokuappLoginPage herokuappLoginPage;
private SuccessLoginPage successLoginPage;
private ElementalSeleniumPage elementalSeleniumPage;
private GitHubPage gitHubPage;

    @Before
    public void setUpTest()
    {
        herokuappLoginPage = new HerokuappLoginPage();
        successLoginPage = new SuccessLoginPage();
        elementalSeleniumPage = new ElementalSeleniumPage();
        gitHubPage = new GitHubPage();
    }


    @Test

    public void loginTest ()
    {
     herokuappLoginPage.insertUserName("tomsmith")
             .insertPassword("SuperSecretPassword!")
             .clickOnLoginButton();

       Assert.assertTrue(successLoginPage.messageIsVisible());
       Assert.assertEquals("You logged into a secure area!" + "\n" + "×",successLoginPage.loginIsSuccess());

    }

    @Test
    public void gitHubTest()
    {
        herokuappLoginPage.clickOnGitHub();
        Assert.assertTrue(gitHubPage.messageIsDisplayed());
        Assert.assertEquals("saucelabs", gitHubPage.messageText());


    }

@Test
    public void seleniumTest()
{
    herokuappLoginPage.clickOnSeleniumLink();



    elementalSeleniumPage.moveToNewTab();
    Assert.assertTrue(elementalSeleniumPage.messageIsDisplayed());
    Assert.assertEquals("Sauce Labs", elementalSeleniumPage.messageText());
}

@Test

public void loginTestNeg1 () {
    herokuappLoginPage.insertUserName("tomsmith12")
            .insertPassword("SuperSecretPassword!")
            .clickOnLoginButton();
    Assert.assertTrue(herokuappLoginPage.messageIsDisplayed());
    Assert.assertEquals("Your username is invalid!" +  "\n" + "×", herokuappLoginPage.errorMessage());

}

@Test

    public void loginTestNeg2 () {
        herokuappLoginPage.insertUserName("tomsmith")
                .insertPassword("SuperSecretPassword12!")
                .clickOnLoginButton();
        Assert.assertTrue(herokuappLoginPage.messageIsDisplayed());
        Assert.assertEquals("Your password is invalid!" + "\n" + "×", herokuappLoginPage.errorMessage());
    }
}



package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessLoginPage extends BaseTest
{
    @FindBy (id = "flash")
    WebElement message;

    public SuccessLoginPage() {PageFactory.initElements(driver,this);}

    //public SuccessLoginPage goToSuccessPage()
    //{
     //   driver.get("https://the-internet.herokuapp.com/secure");
      //  return this;
   // }

    public boolean messageIsVisible()
    {


            wdWait.until(ExpectedConditions.elementToBeClickable(message));
            return message.isDisplayed();
        }

        public String loginIsSuccess()
        {
            wdWait.until(ExpectedConditions.elementToBeClickable(message));
            return  message.getText();
        }


}


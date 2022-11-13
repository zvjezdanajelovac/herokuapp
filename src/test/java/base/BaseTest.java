package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class BaseTest
{

        public static WebDriver driver;
        public static WebDriverWait wdWait;
        public static Random random = new Random();
        public static JavascriptExecutor jsExecutor;

        @Before
        public void setup()
        {
            WebDriverManager.firefoxdriver().setup();
            //WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
            //driver = new ChromeDriver();
            wdWait = new WebDriverWait(driver, Duration.ofSeconds(30));

            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");

        }

        //@After
        public void tearDown()
        {
            driver.quit();
        }

}



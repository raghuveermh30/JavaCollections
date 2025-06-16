package seleniumfactorydesignpattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    //Java for initializing WebDriver instances for different browsers (Chrome, Firefox, Edge, Safari).

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome").createDriver();
        driver.get("https://academy.naveenautomationlabs.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000L);
    }

    @Test
    public void getTitleTest() {
        Assert.assertEquals(driver.getTitle(), "NaveenAutomationLabs");
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}



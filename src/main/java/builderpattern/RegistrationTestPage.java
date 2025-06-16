package builderpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTestPage {

    //Selenium (POM) With Builder Pattern in Java || Practical Example

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.manage().window().maximize();
        Thread.sleep(2000L);
    }

    @Test
    public void userRegTest() {
        Register register = new Register.RegisterBuilder()
                .setFirstName("Raghu")
                .setLastName("veer")
                .setEmail("test1234@gmail.com")
                .setPassword("test1234")
                .setConfirmPassword("test1234")
                .setPhoneNum("1234567890")
                .build();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.userRegister(register);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

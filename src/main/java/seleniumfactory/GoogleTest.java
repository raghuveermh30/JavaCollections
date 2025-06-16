package seleniumfactory;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.getBrowserName("chrome");
    }

    @Test
    public void googleTitleTest() {
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

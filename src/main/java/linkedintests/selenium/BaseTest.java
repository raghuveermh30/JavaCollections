package linkedintests.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import seleniumwithsingleton.WebDriverManager;
import webdriverarch.ChromeDriver;
import webdriverarch.WebDriver;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

//    @BeforeMethod
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        driver.set(webDriver);
//    }
//
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (getDriver() != null) {
//            getDriver().quit();
//            driver.remove();
//        }
//    }
}

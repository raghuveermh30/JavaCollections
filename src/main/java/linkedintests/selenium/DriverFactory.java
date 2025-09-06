package linkedintests.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import seleniumwithsingleton.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static WebDriver initDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                //WebDriverManager.chromedriver().setup();
                driverThread.set(new ChromeDriver());
                break;
            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driverThread.set(new FirefoxDriver());
                break;
            case "edge":
                // WebDriverManager.edgedriver().setup();
                driverThread.set(new EdgeDriver());
                break;
        }
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver() {
        return driverThread.get();
    }

    public static void quitDriver() {
        driverThread.get().quit();
        driverThread.remove(); // prevent memory leaks
    }
}

package seleniumwithsingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManager {

    private static volatile WebDriverManager instance;

    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    //Thread Local Driver will give every local copy of each and every thread and thread will be used for driver and it can use for any action
    //this will help me proper execution in Parallel Execution
    //This will not give any performance, Dead-lock or any clash between 2 threads

    private WebDriverManager() {

    }

    private void initDriver(String browser) {
        switch (browser) {
            case "chrome":
                tlDriver.set(new ChromeDriver());
                break;
            case "firefox":
                tlDriver.set(new FirefoxDriver());
                break;
            case "edge":
                tlDriver.set(new EdgeDriver());
                break;
            case "safari":
                tlDriver.set(new SafariDriver());
                break;
            default:
                throw new IllegalStateException("Unsupported Browser" + browser);
        }
    }

    /*
     * This method will return the singleton instance of WebDriverManager.
     * If the driver is not initialized, it will initialize it with the specified browser.
     *
     * @param browser - The browser type to initialize (e.g., "chrome", "firefox", "edge", "safari").
     * @return The singleton instance of WebDriverManager.
     */
    public static WebDriverManager getInstance(String browser) {

        if (instance == null) {
            synchronized (WebDriverManager.class) {
                if (instance == null) {
                    instance = new WebDriverManager();
                }
            }
        }

        if (tlDriver.get() == null) {
            instance.initDriver(browser);
        }

        return instance;
    }

    public WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void quitBrowser() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}

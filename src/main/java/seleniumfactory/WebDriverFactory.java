package seleniumfactory;





import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

    public Map<String, Supplier<WebDriver>> driverMap = null;

    public WebDriverFactory() {
        driverMap = new HashMap<>();
        driverMap.put("chrome", this::createChromeDriver);
        driverMap.put("firefox", this::createFirefoxDriver);
        driverMap.put("safari", this::createSafariDriver);
    }

    public WebDriver getBrowserName(String browserName) {
        return driverMap.getOrDefault(browserName.toLowerCase().trim(), () -> {
            System.out.println("Browser Not Found" + browserName);
            return null;
        }).get();

    }

    private WebDriver createChromeDriver() {
        return new ChromeDriver();
    }

    private WebDriver createFirefoxDriver() {
        return new FirefoxDriver();
    }


    private WebDriver createSafariDriver() {
        return new SafariDriver();
    }

}


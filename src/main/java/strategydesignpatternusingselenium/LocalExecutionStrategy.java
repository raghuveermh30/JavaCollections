package strategydesignpatternusingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalExecutionStrategy implements TestExecutionStrategy {


    @Override
    public WebDriver setupDriver(String browserName) {

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Please provide the correct browser " + browserName);
        }
    }


}

package seleniumfactorydesignpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowserManager implements BrowserDriver{

    @Override
    public WebDriver createDriver() {
        return new EdgeDriver();
    }
}

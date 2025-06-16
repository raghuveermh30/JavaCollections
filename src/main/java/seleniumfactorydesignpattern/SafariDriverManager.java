package seleniumfactorydesignpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager implements BrowserDriver {

    @Override
    public WebDriver createDriver() {
        return new SafariDriver();
    }
}

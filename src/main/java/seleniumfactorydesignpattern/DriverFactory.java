package seleniumfactorydesignpattern;

public class DriverFactory {

    public static BrowserDriver getDriver(String browserType) {

        switch (browserType.toLowerCase()) {
            case "chrome":
                return new ChromeDriverManager();

            case "firefox":
                return new FireFoxDriverManager();

            case "edge":
                return new EdgeBrowserManager();

            case "safari":
                return new SafariDriverManager();

            default:
                throw new IllegalArgumentException("Please Provide the correct Browser.." + browserType);
        }
    }
}

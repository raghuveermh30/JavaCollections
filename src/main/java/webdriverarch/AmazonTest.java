package webdriverarch;

public class AmazonTest {

    public static void main(String[] args) {

        //ChromeDriver driver = new ChromeDriver();

        // FirefoxDriver firefoxDriver = new FirefoxDriver();

        // SafariDriver safariDriver = new SafariDriver();

        String browserName = "chrome";
        WebDriver driver = null;

        //TopCasting -- CrossBrowser Logic
        switch (browserName.trim().toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Please pass the right browser name " + browserName);
                break;
        }

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.sendKeys("Search Field", "NaveenAutomation Labs");
        driver.click("Login Page");
        driver.close();

        driver.getLogs();
    }
}

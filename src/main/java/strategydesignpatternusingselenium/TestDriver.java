package strategydesignpatternusingselenium;

import org.openqa.selenium.WebDriver;

public class TestDriver {

    public static void main(String[] args) {

        //Initialize WebDriver using Strategy Design Pattern In Java.

        DriverContext driverContext = new DriverContext(new HeadlessExecutionStrategy());

        WebDriver driver = driverContext.getDriver("chrome");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driverContext.setStrategy(new LocalExecutionStrategy());
        driver = driverContext.getDriver("chrome");
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());


    }
}

package strategydesignpatternusingselenium;

import org.openqa.selenium.WebDriver;

public class DriverContext {

    private TestExecutionStrategy testExecutionStrategy;

    public DriverContext(TestExecutionStrategy testExecutionStrategy) {
        this.testExecutionStrategy = testExecutionStrategy;
    }

    //setter
    public void setStrategy(TestExecutionStrategy testExecutionStrategy) {
        this.testExecutionStrategy = testExecutionStrategy;
    }

    public WebDriver getDriver(String browserName){
        return testExecutionStrategy.setupDriver(browserName);
    }

}

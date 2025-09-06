/*
package linkedintests.selenium;

public class DynamicElementHandler {

        WebDriver driver;
        WebDriverWait wait;

        // 1. Dynamic ID - use contains() or starts-with()
        public WebElement findByDynamicId(String partialId) {
            return driver.findElement(By.xpath("//*[contains(@id,'" + partialId + "')]"));
        }

        // 2. Dynamic text in a list
        public WebElement findByText(String text) {
            return driver.findElement(By.xpath("//*[text()='" + text + "']"));
        }

        // 3. Wait for element to appear dynamically (AJAX loaded)
        public WebElement waitForElement(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        // 4. Stale Element Retry
        public void clickWithRetry(By locator) {
            int attempts = 0;
            while (attempts < 3) {
                try {
                    driver.findElement(locator).click();
                    break;
                } catch (StaleElementReferenceException e) {
                    attempts++;
                }
            }
        }

        // 5. Shadow DOM element
        public WebElement getShadowElement(WebElement shadowHost, String cssSelector) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            SearchContext shadowRoot = (SearchContext) js.executeScript(
                    "return arguments[0].shadowRoot", shadowHost);
            return shadowRoot.findElement(By.cssSelector(cssSelector));
        }

        // 6. Dropdown - Dynamic options
        public void selectDynamicDropdown(String parentLocator, String optionText) {
            driver.findElement(By.xpath(parentLocator)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[text()='" + optionText + "']"))).click();
        }
    }

*/

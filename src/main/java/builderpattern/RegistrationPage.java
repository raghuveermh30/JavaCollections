package builderpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {


    private WebDriver driver;
    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmpassword = By.id("input-confirm");

    private By subscribeYes = By.xpath("(//label[@class='radio-inline'])[position()=1]/input");
    private By subscribeNo = By.xpath("(//label[@class='radio-inline'])[position()=2]/input");

    private By agreeCheckBox = By.name("agree");
    private By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");
    private By sucessMessg = By.cssSelector("div#content h1");

    private By logoutLink = By.linkText("Logout");
    private By registerLink = By.linkText("Register");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userRegister(Register register) {
        driver.findElement(firstName).sendKeys(register.getFirstName());
        driver.findElement(lastName).sendKeys(register.getLastName());
        driver.findElement(email).sendKeys(register.getEmail());
        driver.findElement(telephone).sendKeys(register.getPhoneNum());
        driver.findElement(password).sendKeys(register.getPassword());
        driver.findElement(confirmpassword).sendKeys(register.getConfirmPassword());
    }


}

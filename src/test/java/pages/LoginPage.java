package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    @FindBy (css = "input[type='email']")
    WebElement emailField;
    @FindBy (css = "input[type='password']")
    WebElement passwordField;
    @FindBy (css = "button[type='submit']")
    WebElement submitBtn;

    public LoginPage provideEmail(String email) {emailField.sendKeys(email);return this;}
    public LoginPage providePassword(String password) {passwordField.sendKeys(password);return this;}
    public LoginPage clickSubmit() {submitBtn.click();return this;}
    public LoginPage login(){
        emailField.click();
        emailField.clear();
        provideEmail("andrei.bryliakov@testpro.io");
        passwordField.click();
        passwordField.clear();
        providePassword("te$t$tudent1");
        clickSubmit();return this;}
}



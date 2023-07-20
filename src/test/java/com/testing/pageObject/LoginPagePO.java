package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {

    //Element locator - Stage 1

    @FindBy(id = "email")
    public static WebElement UsernameField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement LoginButton;


    //initialise Element using selenium Webdriver - Stage 2


    public LoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //write method to describe Web element action - Stage 3

    public void enterUsername(String Email){
        UsernameField.sendKeys(Email);

    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void iClickOnSignIn() {
        LoginButton.click();

    }

}
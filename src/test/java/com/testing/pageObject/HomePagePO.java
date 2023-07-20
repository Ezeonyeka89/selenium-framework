package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element locator - Stage 1
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    //Initialise Element using selenium WebDriver - Stage 2
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //write method to describe Web element action - Stage 3
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void SignInLink(){
        SignInLink.click();
    }

















}

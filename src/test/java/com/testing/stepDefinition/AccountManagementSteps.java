package com.testing.stepDefinition;


import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.LoginPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.testing.cucumber.Hooks;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;

    @Given("i am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("i enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);

    }

    @And("i click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.iClickOnCreateAnAccount();
    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
    }


    @Given("i am on login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.SignInLink();


    }

    @When("i enter {string} {string}")
    public void iEnter(String Email, String Password) {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterUsername(Email);
        loginPagePO.enterPassword(Password);
    }

    @And("i click on Sign in")
    public void iClickOnSignIn() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.iClickOnSignIn();

    }
}

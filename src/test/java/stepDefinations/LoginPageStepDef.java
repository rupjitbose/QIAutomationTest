package stepDefinations;

import base.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDef {
    BaseUtils baseUtils;
    public LoginPageStepDef(BaseUtils baseUtils){
        this.baseUtils = baseUtils;
    }
    @Given("I am on the saucedemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        LoginPage loginPage = baseUtils.pageManager.getLoginPage();
        loginPage.goTo();
    }
    @Given("I input valid username and password")
    public void i_input_valid_username_and_password() {
        LoginPage loginPage = baseUtils.pageManager.getLoginPage();
        loginPage.enterUserName( "standard_user");
        loginPage.enterPassword( "secret_sauce");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        LoginPage loginPage = baseUtils.pageManager.getLoginPage();
        loginPage.clickLoginBtn();
    }
}

package pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PageManager {
  public WebDriver driver;
  public LoginPage loginPage;
  public HomePage homePage;
  public CartPage cartPage;
  public CheckOutPage checkOutPage;

    public PageManager(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public HomePage getHomePage() {
        homePage = new HomePage(driver);
        return homePage;
    }
    public CartPage getCartPage() {
        cartPage = new CartPage(driver);
        return cartPage;
    }
    public CheckOutPage getCheckOutPage() {
        checkOutPage = new CheckOutPage(driver);
        return checkOutPage;
    }

}

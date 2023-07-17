package pages;

import base.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonUtils {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="user-name")
    WebElement userName;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement loginBtn;

    public void goTo() {
        driver.get("https://www.saucedemo.com/");
    }
    public void enterUserName(String user){
        userName.sendKeys(user);
    }
    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }


}

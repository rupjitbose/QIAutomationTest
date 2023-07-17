package pages;

import base.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends CommonUtils {
    private WebDriver driver;
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='header_secondary_container']/span")
    WebElement checkOutPage;

    public String checkWeAreOnCheckOutPage(){
        return checkOutPage.getText();
    }
}

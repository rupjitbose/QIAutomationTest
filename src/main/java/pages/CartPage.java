package pages;

import base.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonUtils {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="checkout")
    WebElement checkout;
    public boolean checkItemIsInCart(String product){
        return driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='"+product+"']")).isDisplayed();
    }
    public void goToCheckOut() {
        checkout.click();
    }
}

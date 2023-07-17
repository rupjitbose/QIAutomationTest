package pages;

import base.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends CommonUtils {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement menubtn;
    @FindBy(xpath = "//div[@class='header_secondary_container']/span")
    WebElement productHomePage;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logout;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;
    @FindBy(xpath = "//span[@class='active_option']")
    WebElement activeOption;
    @FindBy(xpath ="//*[@id='shopping_cart_container']/a")
    WebElement cartButton;



    public String checkWeAreOnHomePage(){
        return productHomePage.getText();
    }
    public void goToFilter(){
        filter.click();
    }
    public void selectFilterOption(String option) {
        Select select=new Select(filter);
        select.selectByVisibleText(option);
    }
    public String checklistIsSorted() {
        return activeOption.getText();
    }

    public void addTocart(String product) {
        driver.findElement(By.xpath("//div[text()='"+product+"']/ancestor::div[1]/following-sibling::div//button")).click();
    }
    public void goToCart(){
        cartButton.click();
    }

}

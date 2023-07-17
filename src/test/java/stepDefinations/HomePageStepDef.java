package stepDefinations;

import base.BaseUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

public class HomePageStepDef {
    BaseUtils baseUtils;
    public HomePageStepDef(BaseUtils baseUtils){
        this.baseUtils = baseUtils;
    }


    @Then("I am able to login successfully and land on home page")
    public void i_am_able_to_login_successfully_and_land_on_home_page() {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        Assert.assertEquals(homepage.checkWeAreOnHomePage(),"Products");
    }
    @And("I able to navigate to the filter on the page")
    public void i_able_to_navigate_to_the_filter_on_the_page() {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        homepage.goToFilter();
    }
    @When("I select {string} on the filter")
    public void i_select_on_the_filter(String option) {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        homepage.selectFilterOption(option);
    }
    @Then("Page items are sorted in the {string} order successfully")
    public void page_items_are_sorted_in_the_order_successfully(String option) {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        Assert.assertEquals(homepage.checklistIsSorted(),option);
    }
    @Then("I click on add to cart for {string} on product home page")
    public void i_click_on_add_to_cart_for_on_product_home_page(String product) {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        homepage.addTocart(product);
    }
    @When("I click on Cart button")
    public void i_click_on_cart_button() {
        HomePage homepage=baseUtils.pageManager.getHomePage();
        homepage.goToCart();
    }

}

package stepDefinations;

import base.BaseUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartPageStepDef {
    BaseUtils baseUtils;
    public CartPageStepDef(BaseUtils baseUtils){
        this.baseUtils = baseUtils;
    }

    @Then("Product {string} is in cart page")
    public void product_is_in_cart_page(String product) {
        CartPage cartPage=baseUtils.pageManager.getCartPage();
        cartPage.checkItemIsInCart(product);
    }
    @When("I click on checkout")
    public void i_click_on_checkout() {
        CartPage cartPage=baseUtils.pageManager.getCartPage();
        cartPage.goToCheckOut();
    }
}

package stepDefinations;

import base.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckOutPage;
import pages.LoginPage;

public class CheckOutPageStepDef {
    BaseUtils baseUtils;
    public CheckOutPageStepDef(BaseUtils baseUtils){
        this.baseUtils = baseUtils;
    }
    @Then("We should be on the Checkout page")
    public void we_should_be_on_the_checkout_page() {
        CheckOutPage checkOutPage = baseUtils.pageManager.getCheckOutPage();
        Assert.assertEquals(checkOutPage.checkWeAreOnCheckOutPage(),"Checkout: Your Information");
    }
}

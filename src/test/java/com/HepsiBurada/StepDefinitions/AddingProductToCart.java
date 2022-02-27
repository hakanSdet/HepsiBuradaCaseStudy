package com.HepsiBurada.StepDefinitions;

import com.HepsiBurada.Pages.*;
import com.HepsiBurada.Utilities.BrowserUtils;
import com.HepsiBurada.Utilities.ConfigurationReader;
import com.HepsiBurada.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


import static com.HepsiBurada.Utilities.BrowserUtils.*;


public class AddingProductToCart {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    MyCartPage myCartpage = new MyCartPage();
    String expectedProduct1;
    String expectedProduct2;
    String actualProduct1;
    String actualProduct2;

    @Given("User navigate to WebPage")
    public void userNavigateToWebPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("User navigate to LoginPage")
    public void user_navigate_to_LogInPage() {
        hover(loginPage.signIn);
        waitForClickablility(loginPage.login, 5);
        BrowserUtils.clickWithJS(loginPage.login);


    }

    @When("User is logged in {string} and {string}")
    public void userIsLoggedInAnd(String username, String password) {

        loginPage.userNameInput.sendKeys("hkahraman96@gmail.com");
        loginPage.submit.click();
        waitForPageToLoad(5);
        loginPage.passwordInput.sendKeys("001096");
        loginPage.submit.click();
        waitForPageToLoad(5);
    }


    @And("Verify the user login is done on the homepage")
    public void verify_the_user_login_is_done_on_the_homepage() {
        Assert.assertEquals("Hesabım",BasePage.myAccount.getText());

    }
    @And("User searches for the product wants to buy here")
    public void user_searches_for_the_product_wants_to_buy_here() {
        BasePage.searchBox.sendKeys("apple");
        waitForPageToLoad(5);
        BasePage.search.click();
        waitForPageToLoad(5);
    }
    @And("User can choose from the list of products displayed as a result of the Search")
    public void user_can_choose_from_the_list_of_products_displayed_as_a_result_of_the_Search() {
       scrollToElement(productPage.firstProduct);
       waitForPageToLoad(5);
       productPage.firstProduct.click();
       waitForPageToLoad(5);
    }
    @And("For the selected product, the product is selected from two different vendors and added to the cart.")
    public void for_the_selected_product_the_product_is_selected_from_different_vendors_and_added_to_the_cart() {

        BrowserUtils.switchToWindow();
        productPage.allSeller.click();
        waitForPageToLoad(5);
        expectedProduct1=productPage.expectedProduct1.getText().toLowerCase();
        productPage.firstSeller.click();
        waitForPageToLoad(5);
        productPage.closeSign.click();
        expectedProduct2=productPage.expectedProduct2.getText().toLowerCase();
        productPage.secondSeller.click();
        waitForPageToLoad(5);
        productPage.closeSign.click();

    }
    @Then("verify on the {string} page that the selected product has been added correctly.")
    public void verify_on_the_page_that_the_selected_product_has_been_added_correctly(String string) {
        BasePage.MyCart.click();
        waitForPageToLoad(5);
        actualProduct1=myCartpage.actualProduct1.getText().toLowerCase();
        actualProduct2=myCartpage.actualProduct2.getText().toLowerCase();
        Assert.assertTrue(expectedProduct1.equals(actualProduct1));
        Assert.assertTrue(expectedProduct2.equals(actualProduct2));

    }



}

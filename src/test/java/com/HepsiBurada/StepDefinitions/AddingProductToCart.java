package com.HepsiBurada.StepDefinitions;

import com.HepsiBurada.Pages.*;
import com.HepsiBurada.Utilities.ConfigurationReader;
import com.HepsiBurada.Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.HepsiBurada.Utilities.BrowserUtils.*;


public class AddingProductToCart {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Given("User navigate to WebPage")
    public void userNavigateToWebPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("User navigate to LoginPage")
    public void user_navigate_to_LogInPage() {
        hover(loginPage.signIn);
        waitForClickablility(loginPage.login, 6);
        loginPage.login.click();

    }

    @When("User is logged in {string} and {string}")
    public void userIsLoggedInAnd(String username, String password) {

        loginPage.userNameInput.sendKeys("hkahraman96@gmail.com");
        loginPage.submit.click();
        waitForPageToLoad(3);
        loginPage.passwordInput.sendKeys("001096");
        loginPage.submit.click();
        waitForPageToLoad(3);
    }


    @And("Verify the user login is done on the homepage")
    public void verify_the_user_login_is_done_on_the_homepage() {
        Assert.assertEquals("Hesabım",BasePage.myAccount.getText());

    }
    @And("User searches for the product wants to buy here")
    public void user_searches_for_the_product_wants_to_buy_here() {
        BasePage.searchBox.sendKeys("apple");
        waitForPageToLoad(7);
        BasePage.search.click();
        waitForPageToLoad(7);
    }
    @And("User can choose from the list of products displayed as a result of the Search")
    public void user_can_choose_from_the_list_of_products_displayed_as_a_result_of_the_Search() {
       scrollToElement(productPage.firstProduct);
       waitForPageToLoad(7);
       productPage.firstProduct.click();
       waitForPageToLoad(7);
    }
    @And("For the selected product, the product is selected from two different vendors and added to the cart.")
    public void for_the_selected_product_the_product_is_selected_from_different_vendors_and_added_to_the_cart() {
        scrollToElement(productPage.allSeller);
        productPage.allSeller.click();
        waitForPageToLoad(5);
        productPage.firstSeller.click();
        waitForPageToLoad(7);
        productPage.closeSign.click();
        productPage.secondSeller.click();
        waitForPageToLoad(7);
        productPage.goMyCart.click();

    }
    @Then("verify on the {string} page that the selected product has been added correctly.")
    public void verify_on_the_page_that_the_selected_product_has_been_added_correctly(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

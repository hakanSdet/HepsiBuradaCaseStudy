package com.HepsiBurada.StepDefinitions;

import com.HepsiBurada.Pages.LoginPage;
import com.HepsiBurada.Utilities.BrowserUtils;
import com.HepsiBurada.Utilities.ConfigurationReader;
import com.HepsiBurada.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.HepsiBurada.Utilities.BrowserUtils.hover;
import static com.HepsiBurada.Utilities.BrowserUtils.waitForPageToLoad;
import static com.HepsiBurada.Utilities.ConfigurationReader.get;


public class AddingProductToCart {
    LoginPage loginPage = new LoginPage();

    @Given("User navigate to WebPage")
    public void userNavigateToWebPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("User navigate to LoginPage")
    public void user_navigate_to_LogInPage() {
        hover(loginPage.myAccount);
        waitForPageToLoad(2);
        loginPage.login.click();

    }

    @When("User is logged in {string} and {string}")
    public void userIsLoggedInAnd(String username, String password) {

        loginPage.userNameInput.sendKeys(get("hkahraman96@gmail.com"));
        loginPage.submit.click();
        waitForPageToLoad(3);
        loginPage.passwordInput.sendKeys(get("001096"));
        loginPage.submit.click();
        waitForPageToLoad(3);


    }



    @And("Verify the user login is done on the homepage")
    public void verify_the_user_login_is_done_on_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("User searches for the product wants to buy here")
    public void user_searches_for_the_product_wants_to_buy_here() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("User can choose from the list of products displayed as a result of the Search")
    public void user_can_choose_from_the_list_of_products_displayed_as_a_result_of_the_Search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("For the selected product, the product is selected from {int} different vendors and added to the cart.")
    public void for_the_selected_product_the_product_is_selected_from_different_vendors_and_added_to_the_cart(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify on the {string} page that the selected product has been added correctly.")
    public void verify_on_the_page_that_the_selected_product_has_been_added_correctly(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

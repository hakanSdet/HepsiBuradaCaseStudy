package com.HepsiBurada.StepDefinitions;


import com.HepsiBurada.Pages.LoginPage;
import com.HepsiBurada.Utilities.ConfigurationReader;
import com.HepsiBurada.Utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("User navigates to home page")
    public void user_navigates_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

        loginPage.login.click();
    }

    @When("User enters {string} into username input")
    public void user_enters_into_username_input(String username) {



    }
    @When("User clicks on submit button")
    public void user_clicks_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User navigate to password page")
    public void user_navigate_to_password_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters {string} into password input")
    public void user_enters_into_password_input(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User can see Product Page")
    public void user_can_see_Product_Page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @Then("User can see his-her full name on My Account page")
    public void userCanSeeHisHerFullNameOnMyAccountPage() {
    }
}

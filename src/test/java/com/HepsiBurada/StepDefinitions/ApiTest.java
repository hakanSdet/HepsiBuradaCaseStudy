package com.HepsiBurada.StepDefinitions;

import com.HepsiBurada.Utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.*;


public class ApiTest {

    String baseUrl = ConfigurationReader.get("base_url");
    Response response;
    JsonPath jsonPath;

    @Given("I use get http request with {string} endpoint")
    public void i_use_get_http_request_with_endpoint(String string) {
        response = given().get(baseUrl+string);
        response.prettyPrint();
    }

    @Then("I check the status code as {int}")
    public void i_check_the_status_code_as(int number) {
        Assert.assertEquals(number, response.statusCode());
    }

    @Then("I check the name as {string}")
    public void i_check_the_name_as(String string) {
        jsonPath = response.jsonPath();
        String name = jsonPath.getString("data[0].name");
        Assert.assertEquals(string, name);
    }

    @Given("I use post http request with {string} endpoint and add a request body")
    public void iUsePostHttpRequestWithEndpointAndAddARequestBody(String endPoint) {
        String requestBody = "{\n" +
                "    \"id\": 4,\n" +
                "    \"name\": \"banana\",\n" +
                "    \"price\": 12.3,\n" +
                "    \"stock\": 3\n" +
                "}";
        response = given().body(requestBody).post(baseUrl+endPoint);
        response.prettyPrint();

    }

    @Then("I check the message as {string}")
    public void i_check_the_message_as(String string) {
        jsonPath = response.jsonPath();
        String message = jsonPath.getString("error.message");
        Assert.assertEquals(string, message);
    }

}

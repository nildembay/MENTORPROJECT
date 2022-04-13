package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class MockApiGetStepDef {
    //id si 50 olan kişinin adının name 50 olduğunu doğrulayın

    Response response;
    String expectedName="name 50";
    @Given("user send a GET request to mock api")
    public void user_send_a_get_request_to_mock_api() {


        String url="https://6255dab38646add390ddc00e.mockapi.io/api/groups";
        response=given().accept("application/json").when().get(url);


    }
    @Then("assert response")
    public void assert_response() {
       response.prettyPrint();
        JsonPath json=response.jsonPath();
        System.out.println(json.getString("name"));
       // Assert.assertEquals(expectedName,json.getString("name"));
        Assert.assertTrue(json.getString("name").contains(expectedName));


    }






}

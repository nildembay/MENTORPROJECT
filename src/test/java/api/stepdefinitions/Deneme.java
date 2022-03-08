package api.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Deneme extends TestBaseApi {
    Response response;

    @Given("post list")
    public void post_list() {

        setUp();
        spec.pathParams("param1",1,"param2","lists");

        HashMap<String,String> request =new HashMap<>();
        request.put("name","new");
        request.put("idBoard", ConfigReader.getProperty("idBoard"));
        request.put("key",ConfigReader.getProperty("key"));
        request.put("token",ConfigReader.getProperty("token"));

        response=given().
                contentType("application/json").
                spec(spec).
                body(request).
                when().
                post("/{param1}/{param2}");

        response.prettyPrint();



    }
    @Given("verify response")
    public void verify_response() {


    }


}

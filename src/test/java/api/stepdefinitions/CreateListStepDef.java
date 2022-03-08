package api.stepdefinitions;

import api.trellopojos.RequestPojo;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateListStepDef extends TestBaseApi{

    Response response;

    @Given("POST request for create list")
    public void post_request_for_create_list() {

        setUp();
        spec.pathParams("param1",1,
                "param2","lists");

        HashMap<String,String> requestMap=new HashMap<>();
        requestMap.put("name","ders1");
        requestMap.put("idBoard", ConfigReader.getProperty("idBoard"));
        requestMap.put("key",ConfigReader.getProperty("key"));
        requestMap.put("token",ConfigReader.getProperty("token"));

        response=given().
                contentType("application/json").
                spec(spec).
                body(requestMap).
                when().
                post("/{param1}/{param2}");

        response.prettyPrint();


    }
    @Then("Verify response")
    public void verify_response() {

        Assert.assertEquals(200,response.getStatusCode());
        JsonPath json=response.jsonPath();
        Assert.assertEquals("ders1",json.getString("name"));
        Assert.assertEquals(ConfigReader.getProperty("idBoard"),json.getString("idBoard"));

    }

    @Given("PUT request for update list")
    public void putRequestForUpdateList() {

       setUp();
       spec.pathParams("param1",1,
               "param2","lists",
               "param3",ConfigReader.getProperty("idList"));

      // HashMap<String,String> requestMapforUpdate=new HashMap<>();
        RequestPojo pojo=
                new RequestPojo("updatename",
                        ConfigReader.getProperty("key"),
                        ConfigReader.getProperty("token"));

        response=given().
                contentType("application/json").
                spec(spec).
                body(pojo).
                when().
                put("/{param1}/{param2}/{param3}");
        response.prettyPrint();


    }

    @Then("Verify update response")
    public void verifyUpdateResponse() {
        JsonPath json=response.jsonPath();
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(ConfigReader.getProperty("idList"),json.getString("id"));
        Assert.assertEquals("updatename",json.getString("name"));
        Assert.assertEquals(ConfigReader.getProperty("idBoard"),json.getString("idBoard"));


    }
}

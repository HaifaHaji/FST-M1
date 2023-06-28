package Activties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class Github_RestAssured {

    String ssh_Key1 = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOMqqnkVzrm0SdG6UOoqKLsabgH5C9okWi0dh2l9GKJl";
    int sshKeyId;
    // Declare request specification
    RequestSpecification requestSpec;


    @BeforeClass
    public void setUp() {

        // Create request specification
        requestSpec = new RequestSpecBuilder()
                // Set base URL
                .setBaseUri("https://api.github.com/user/keys")
                .addHeader("Authorization", " token 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")
                .addHeader("Content-Type", "application/json")
                // Build request specification
                .build();

    }

    @Test(priority = 1)
    public void addNewUser() {
        // Creating JSON request
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key", ssh_Key1);

        // Sending POST request
        Response response = given().spec(requestSpec) // Set header
                .body(reqBody) // Add request body
                .when().post();


        // Assertu\ing success status code
        response.then().statusCode(201);

        // Extract the ID value
        sshKeyId = response.then().extract().path("id");
    }

    @Test(priority = 2)
    public void getUser() {
        Response response =
                given().spec(requestSpec) // Set header
                        .when().pathParam("keyId", sshKeyId) // Set path parameter
                        .get("/{keyId}"); // Send GET request

        Reporter.log(response.print());

        // Asserting success status code
        response.then().statusCode(200);
    }

    @Test(priority = 3)
    public void deleteUser() {
        Response response =
                given().spec(requestSpec) // Set header
                        .when().pathParam("keyId", sshKeyId) // Set path parameter
                        .delete("/{keyId}"); // Send DELETE request
        Reporter.log(response.print());

        // Asserting success status code
        response.then().statusCode(204);
    }
}



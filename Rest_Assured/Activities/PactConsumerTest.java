package Activties;



import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@ExtendWith(PactConsumerTestExt.class)
public class PactConsumerTest {

    // Creating Map for  all the header
    Map<String, String> header = new HashMap<String, String>();
    // Set resource URI
    String user_creator = "/api/users";

    // Creating Pact contract


    @Pact(provider = "UserProvider", consumer = "UserConsumer")
    public RequestResponsePact createPact(PactDslWithProvider builder) throws ParseException {
        // Add header
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        // Creating request and response JSON
        DslPart requestResponseBody = new PactDslJsonBody()
                .numberType("id", 1)
                .stringType("firstName", "Haifa")
                .stringType("lastName", "Haji")
                .stringType("email", "haifahaji11.com");


        // Creating rules for request and response
        return builder.given("A request to create a user")
                .uponReceiving("A request to create a user")
                .path(user_creator)
                .method("POST")
                .headers(header)
                .body(requestResponseBody)
                .willRespondWith()
                .status(201)
                .body(requestResponseBody)
                .toPact();


    }

    @Test
    @PactTestFor(providerName = "UserProvider", port = "8080")
    public void runTest() {
        // Mock url
        RestAssured.baseURI = "http://localhost:8080";

        // Creating request specification
        RequestSpecification rq = RestAssured.given().headers(header).when();


        // Creating request body
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("firstName", "Haifa");
        map.put("lastName", "Haji");
        map.put("email", "haifahaji11@test.com");


        // Send POST request
        Response response = rq.body(map).post(user_creator);
        // Asserting status code
        assert (response.getStatusCode() == 201);
    }








}

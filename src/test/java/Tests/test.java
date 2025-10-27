package Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class test {

    @org.testng.annotations.Test
    public void simpleGet() {
        given()
        .when()
            .get("https://httpbin.org/get")
        .then()
            .statusCode(200)
            .body("url", equalTo("https://httpbin.org/get"));
    }
}


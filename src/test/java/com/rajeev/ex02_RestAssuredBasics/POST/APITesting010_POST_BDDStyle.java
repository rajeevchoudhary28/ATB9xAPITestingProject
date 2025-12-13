package com.rajeev.ex02_RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting010_POST_BDDStyle {

    @Description("Verify the POST request Positive")
    @Test
    public void test_POST_BDDStyle() {
        // Url, Body, header

        // https://restful-booker.herokuapp.com/auth
        // Content-Type : application/ json
        //{"username": "admin",
        //"password": "password123"}

        String payload = "{\"username\": \"admin\",\n" +
                "\"password\": \"password123\"}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);


    }
}

package com.rajeev.ex01_sampleCheck;

import io.restassured.RestAssured;

public class APITesting0002 {
    public static void main(String[] Args){


        // Gherkin Syntax:
        // given: pre req URL, request, auth, body .....
        // when: HTTP? method - GET, POST, PUT, PATCH, DELETE....
        // then: validation -> 200 OK, first name == Parmod

        //full URL: https://api.zippopotam.us/IN/184121
        //Base URi: https://api.zippopotam.us
        // Path: /IN/184121

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/184121")
                .when()
                    .get()
                .then().log().all().statusCode(200);


    }
}

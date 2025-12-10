package com.rajeev.ex02_RestAssuredBasics.GET;

import io.restassured.RestAssured;

public class APITesting006_GET_BDDstyle {
    public static void main(String[] args) {

        String pincode = "184121";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

        String pincode1 = "-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode1)
                .when().log().all().get()
                .then().log().all().statusCode(404);
    }

}

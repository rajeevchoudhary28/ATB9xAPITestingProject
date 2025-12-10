package com.rajeev.ex02_RestAssuredBasics.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting007_GET_BDDStyle {

    @Test
    public void test_GET_Req_POSITIVE() {
        String pin_code = "184121";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log().
                all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void test_GET_Req_Negative() {
        String pincode = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .log().
                all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }
}

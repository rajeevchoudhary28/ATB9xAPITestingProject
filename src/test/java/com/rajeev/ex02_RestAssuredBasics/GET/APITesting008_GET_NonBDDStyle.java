package com.rajeev.ex02_RestAssuredBasics.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void test_GET_NonBDDStyle(){

        // Rest Assured Interfaces
        String pin_code = "184121";
        r = RestAssured
                .given();

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);
        response = r.when().log().all().get();

        vr = response.then()
                .log()
                .all()
                .statusCode(200);

    }

    @Test
    public  void test_NonBDDStyleGET_negative(){

        String pincode = "-1";
        r = RestAssured
                .given();

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);
        response = r.when().log().all().get();

        vr = response.then()
                .log()
                .all()
                .statusCode(200);

    }
}

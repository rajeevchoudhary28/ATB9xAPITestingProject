package com.rajeev.ex02_RestAssuredBasics;

import io.restassured.specification.RequestSpecification;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting0011_PUT_NonBDDStyle {
    // PUT

    // TOKEN, BOOKING ID

//    public void get_token(){}
//    public void get_booking_id(){}


    @Description("Verify the put request for all restful booker api")
    @Test
    public void put_non_bdd(){

        String token = "f9223eb207d9a68";
        String booking_id = "3157";

        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("\"https://restful-booker.herokuapp.com/\"");
        requestSpecification.basePath("/booking/" + booking_id);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payloadPUT).log().all();

        Response response = requestSpecification.when().put();

        ValidatableResponse validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);

    }
}

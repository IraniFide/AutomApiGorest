package api;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static api.ApiUtils.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class ApiRequest extends ApiUtils implements ApiVerbos {
    @Override
    public void GET() {
        Response response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .get(uri);

       super.log("GET");
    }
    @Override
    public void POST() {
        response = given()
               .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .post(uri);
//                .post(uri).then().log().all().spec(resSpec).extract().response();


       super.log("POST");

    }

    @Override
    public void PUT() {
        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .put(uri);
        super.log("PUT");

    }

    @Override
    public void PATCH() {
        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .patch(uri);
        super.log("PATCH");


    }

    @Override
    public void DELETE() {
        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .delete(uri);
        super.log("DELETE");

    }

}

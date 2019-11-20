package com.ivanwidyan.module.api;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import net.serenitybdd.rest.SerenityRest;

public class SampleAPI {

  public static String getUser () {
    EncoderConfig encoderconfig = new EncoderConfig();
    String response = SerenityRest.given()
            .config(RestAssured.config().encoderConfig(encoderconfig.appendDefaultContentCharsetToContentTypeIfUndefined(false)))
            .get("https://reqres.in/api/users/2").getBody().prettyPrint();
    return response;
  }
}
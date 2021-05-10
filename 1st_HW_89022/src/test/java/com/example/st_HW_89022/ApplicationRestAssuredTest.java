package com.example.st_HW_89022;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApplicationRestAssuredTest {

    final static String apiurl="https://api.weatherbit.io/v2.0/current/airquality?";
    final static String key="&key=a9d7034192334c4197091791606b7deb";
    final static String restapiurl="http://localhost:8082/city/"; //application needs to be running on port 8082

    @Test
    public void testRestApi(){

        given().when().get(restapiurl+"Aveiro").then().assertThat().statusCode(200).and();
    }

    @Test
    public void testRestApiCityName(){

        String lonexpected = "-8.64554";
        String latexpected = "40.64427";

        given().when().get(restapiurl+"Aveiro").then().assertThat().statusCode(200).and().body("lon",equalTo(lonexpected)).and().body("lat",equalTo(latexpected));
    }

    @Test
    public void testApi(){

        given().when().get(apiurl+"city=aveiro"+key).then().assertThat().statusCode(200);
    }

    @Test
    public void testApiCityName(){

        String lonexpected = "-8.64554";
        String latexpected = "40.64427";

        given().when().get(apiurl+"city=aveiro"+key).then().assertThat().statusCode(200).and().body("lon",equalTo(lonexpected)).and().body("lat",equalTo(latexpected));
    }

    @Test
    public void testApiCoord(){

        String lon = "-8.64554";
        String lat = "40.64427";
        String cityexpected = "Aveiro";

        given().when().get(apiurl+"lat="+lat+"&lon="+lon+key).then().assertThat().statusCode(200).and().body("city_name", equalTo(cityexpected));
    }
}

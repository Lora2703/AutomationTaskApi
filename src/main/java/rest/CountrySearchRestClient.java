package rest;

import dto.SearchCountryDTO;
import io.restassured.response.Response;
import requestSpecifications.RequestSpecifications;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CountrySearchRestClient {
    Response response;

    public List<SearchCountryDTO> getCountryByValidName (String countryName, int statusCode){
        response = given()
                .when().spec(RequestSpecifications.basicSpec)
                .get(countryName)
                .then().statusCode(statusCode)
                .and().extract().response();

        return Arrays.asList(response.as(SearchCountryDTO[].class));
    }

    public void getCountryByNonValidName (String countryName, int statusCode){
        response = given()
                .when().spec(RequestSpecifications.basicSpec)
                .get(countryName)
                .then().statusCode(404)
                .and().extract().response();
    }
}

package steps;
import dto.SearchCountryDTO;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import rest.CountrySearchRestClient;
import java.util.List;



public class SearchCountryStepdefs {

    CountrySearchRestClient countrySearchRestClient = new CountrySearchRestClient();

    @When("I send a request with valid country name {string} I see status code {int} and country name in the response body")

    public void iSendARequestWithValidCountryNameISeeStatusCodeAndCountryNameInTheResponseBody(String countryName, int statusCode) {

        List<SearchCountryDTO> countries = countrySearchRestClient.getCountryByValidName(countryName,statusCode);

        for (SearchCountryDTO country: countries) {
            String nameOfCountry = country.getName().getCommon().toLowerCase();
            Assertions.assertThat(nameOfCountry).contains(countryName.toLowerCase());
        }
    }

    @When("I send a request with non-valid country name {string} I see status code {int}")
    public void iSendARequestWithNonValidCountryNameISeeStatusCode(String countryName, int statusCode) {
        countrySearchRestClient.getCountryByNonValidName(countryName, statusCode);
    }


}

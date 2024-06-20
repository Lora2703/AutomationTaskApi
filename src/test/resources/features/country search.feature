Feature: Search country by country name

  Scenario Outline: Successful response on request with valid name of a country
    When I send a request with valid country name <countryName> I see status code 200 and country name in the response body
    Examples:
      | countryName |
      | "UKRAINE"   |
      | "Ukraine"   |
      | "ukraine"   |
      | "rai"       |


  Scenario Outline: Unsuccessful response on request with non-valid name of country
    When I send a request with non-valid country name <countryName> I see status code 404
    Examples:
      | countryName |
      | "123"       |
      | "   "       |
      | "+*&@"      |







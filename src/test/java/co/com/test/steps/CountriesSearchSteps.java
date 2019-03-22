package co.com.test.steps;

import static org.hamcrest.Matchers.is;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class CountriesSearchSteps {

  private String ISO_CODE_SEARCH = "http://services.groupkt.com/country/get/iso2code/";
  private Response response;

  @Step("I try to search the country by {0} code")
  public void searchCountryByCode(String code) {
    response = RestAssured.when().get(ISO_CODE_SEARCH + code);
  }

  @Step
  public void searchIsExecutedSuccesfully() {
    response.then().statusCode(200);
  }

  @Step("I should find {0} country")
  public void iShouldFindCountry(String country) {
    response.then().body("RestResponse.result.name", is(country));
  }
}

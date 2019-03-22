package co.com.test.first.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import co.com.test.steps.CountriesSearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class CountriesSearchTests {

  @Steps
  CountriesSearchSteps countriesSearchSteps;

  @Test
  public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
    countriesSearchSteps.searchCountryByCode("US");
    countriesSearchSteps.searchIsExecutedSuccesfully();
    countriesSearchSteps.iShouldFindCountry("United States of America");
  }

  @Test
  public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN() {
    countriesSearchSteps.searchCountryByCode("IN");
    countriesSearchSteps.searchIsExecutedSuccesfully();
    countriesSearchSteps.iShouldFindCountry("India");
  }

  @Test
  public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR() {
    countriesSearchSteps.searchCountryByCode("BR");
    countriesSearchSteps.searchIsExecutedSuccesfully();
    countriesSearchSteps.iShouldFindCountry("Brazil");
  }

}

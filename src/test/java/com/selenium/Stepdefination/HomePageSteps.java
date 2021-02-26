package com.selenium.Stepdefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.selenium.Pages.bookingPage;

public class HomePageSteps {

    @Given("^Open Home page and verify the landing page on landing page$")
    public void open_Home_page_and_verify_the_landing_page_on_landing_page() throws Throwable {
        bookingPage.verifyLandingPageAndStationFeild();

    }

    @When("^User enters the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and click on search button$")
    public void user_enters_the_and_click_on_search_button(String arg1, String arg2, String arg3) throws Throwable {
        bookingPage.selectStationDateAndSearch(arg1, arg2, arg3);
    }

    @When("^User selects the \"([^\"]*)\" and click on \"([^\"]*)\" button$")
    public void user_selects_the_and_click_on_button(String arg1, String arg2) throws Throwable {
        bookingPage.selectFilterClickBookNow();
    }

    @Then("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        bookingPage.clickContinueButton();
    }

    @Then("^User enters \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_enters(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) throws Throwable {
        bookingPage.personalDetailsFillUpForm(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    @Then("^User press the \"([^\"]*)\" button on personal details page$")
    public void user_press_the_button_on_personal_details_page(String arg1) throws Throwable {
        bookingPage.clickFinalContinueButton();
    }

    @When("^user clicks \"([^\"]*)\" from the list$")
    public void user_clicks_from_the_list(String arg1) throws Throwable {
        bookingPage.clickAdditionalPackage();
    }

}

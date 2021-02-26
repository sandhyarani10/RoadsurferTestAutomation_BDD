package com.selenium.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:Reports/cucumber.json"}, features = "src/main/resources/features", glue = {
    "com.selenium.Stepdefination"}, tags = "@Roadsurfer_VerifyCampervanBooking,@Roadsurfer_VerifyCampervanBookingWithAdditionalDetails")
public class cucumberRunner {


}

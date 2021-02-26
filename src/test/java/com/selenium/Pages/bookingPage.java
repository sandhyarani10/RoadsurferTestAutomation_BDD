package com.selenium.Pages;

import com.selenium.Utils.commonMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class bookingPage extends commonMethods {

    static String roadSurferLogo = "//div/a/img[@alt='RoadSurfer logo']";
    static String station = "//div[@class='station-picker']";
    static String frankfurtStation = "//li/span[text()='Frankfurt']";
    static String fromDate = "//div[@class='date-range-picker__display']//span[text()='From']";
    static String toDate = "//div[@class='date-range-picker__display']//span[text()='To']";
    static String pickDate = "//div[@class='calendars-wrapper']//div[@class='calendar__header']//div[contains(text(),'Mar 2021')]/../../div[2]//tbody//div[contains(text(),'31')]";
    static String buttonSearch = "//button[@id='search-step-landing']";
    static String filterSearch = "//input[@id='undefined-integrated-kitchen']";
    static String bookNowButton = ".container .flex-wrap .w-full:nth-child(1) .shadow-md .border-gray-lighter:nth-child(2) .border-gray-lighter:nth-child(2) button";
    static String continueButton = "//div[@class='package-inner']//button[@class='button button--md']";
    static String firstName = "//input[contains(@id,'first-name')]";
    static String lastName = "//input[contains(@id,'last-name')]";
    static String street = "//input[contains(@id,'street')]";
    static String postalCode = "//input[contains(@id,'postal-code')]";
    static String city = "//input[contains(@id,'city')]";
    static String mobile = "//input[contains(@id,'mobile')]";
    static String dateOfBirth = "//input[@placeholder='DD-MM-YYYY']";
    static String email = "//input[contains(@id,'email')]";
    static String title = "//div[@class='form-item']//label[contains(@for,'title')]/..//select[contains(@class,'input')]";
    static String country = "//div[@class='form-item']//label[contains(@for,'country')]/..//select[contains(@class,'input')]";
    static String pacakgeAdditional = "//li[@id='insurance-2']//div[contains(@class,'package-price')]";

    public static void verifyLandingPageAndStationFeild() throws Throwable {
        waitFordisplayOfWebElement(By.xpath(roadSurferLogo));
        checkElementVisible(driver.findElement(By.xpath(station)));
        checkElementVisible(driver.findElement(By.xpath(station)));

    }

    public static void selectStationDateAndSearch(String stationName, String from, String to) throws Throwable {
        clickWithJavaScript(driver.findElement(By.xpath(station)));
        waitFordisplayOfWebElement(By.xpath(frankfurtStation));
        clickWithJavaScript(driver.findElement(By.xpath("//li/span[text()='" + stationName + "']")));
        setSleepTimeInSeconds(2);
        clickWithJavaScript(driver.findElement(By.xpath(fromDate)));
        setSleepTimeInSeconds(2);
        String[] Mon_Date = from.split("[,]");
        clickWithJavaScript(driver.findElement(By.xpath(
            "//div[@class='calendars-wrapper']//div[@class='calendar__header']//div[contains(text(),'" + Mon_Date[0] + "')]/../../div[2]//tbody//div[contains(text(),'"
                + Mon_Date[1] + "')]")));
        setSleepTimeInSeconds(2);
        Mon_Date = to.split("[,]");
        clickWithJavaScript(driver.findElement(By.xpath(
            "//div[@class='calendars-wrapper']//div[@class='calendar__header']//div[contains(text(),'" + Mon_Date[0] + "')]/../../div[2]//tbody//div[contains(text(),'"
                + Mon_Date[1] + "')]")));
        setSleepTimeInSeconds(2);
        clickWithJavaScript(driver.findElement(By.xpath(buttonSearch)));
        setSleepTimeInSeconds(2);
        //waitFordisplayOfWebElement(By.xpath(frankfurtStation));

    }

    public static void selectFilterClickBookNow() throws Throwable {
        clickWithJavaScript(driver.findElement(By.xpath(filterSearch)));
        clickWithJavaScript(driver.findElement(By.cssSelector(bookNowButton)));
        setSleepTimeInSeconds(10);
    }

    public static void clickContinueButton() throws Throwable {
        clickWithJavaScript(driver.findElement(By.xpath(continueButton)));
        setSleepTimeInSeconds(10);
    }

    public static void personalDetailsFillUpForm(String firstNameCustomer, String lastNameCustomer, String titleCustomer, String streetCustomer, String postalCodeCustomer,
                                                 String cityCustomer, String countryCustomer, String mobileCustomer, String dateOfBirthCustomer, String emailCustomer)
        throws Throwable {
        clearAndEnterText(driver.findElement(By.xpath(firstName)), firstNameCustomer);
        clearAndEnterText(driver.findElement(By.xpath(lastName)), lastNameCustomer);

        Select dropdown1 = new Select(driver.findElement(By.xpath(title)));
        dropdown1.selectByVisibleText(titleCustomer);
        clearAndEnterText(driver.findElement(By.xpath(street)), streetCustomer);
        clearAndEnterText(driver.findElement(By.xpath(postalCode)), postalCodeCustomer);
        clearAndEnterText(driver.findElement(By.xpath(city)), cityCustomer);
        Select dropdown2 = new Select(driver.findElement(By.xpath(country)));
        dropdown2.selectByVisibleText(countryCustomer);
        clearAndEnterText(driver.findElement(By.xpath(mobile)), mobileCustomer);
        clearAndEnterText(driver.findElement(By.xpath(dateOfBirth)), dateOfBirthCustomer);
        clearAndEnterText(driver.findElement(By.xpath(email)), emailCustomer);


    }

    public static void clickFinalContinueButton() throws Throwable {
        clickWithJavaScript(driver.findElement(By.xpath(continueButton)));
        setSleepTimeInSeconds(2);
    }

    public static void clickAdditionalPackage() throws Throwable {
        clickWithJavaScript(driver.findElement(By.xpath(pacakgeAdditional)));
        setSleepTimeInSeconds(2);
    }

}

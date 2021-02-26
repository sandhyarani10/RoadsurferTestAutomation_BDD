#Author: sandhyarani10.mohanty@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Customer booking creation and verification

@Roadsurfer_VerifyCampervanBooking
Scenario Outline: Create and verify Customer booking

Given Open Home page and verify the landing page on landing page
When User enters the "<Station>", "<FromDate>", "<ToDate>" and click on search button
And User selects the "Filter" and click on "Book Now" button
Then User clicks on "Continue" button
And User enters "<FirstName>","<LastName>", "<Title>","<Street>", "<PostalCode>", "<City>", "<Country>","<Mobile>", "<DateOfBirth>", "<email>"
Then User press the "Continue" button on personal details page



    Examples:
      |     Station     | 	FromDate    |   ToDate     | FirstName | LastName    | Title     | Street                   | PostalCode        | City              | Country      | Mobile          |DateOfBirth        |   email                                     |
      |   Frankfurt     | 	Mar 2021,31	|  Apr 2021,10 |   Sandhya |  Mohanty   |  Mrs.     |   Hamburger str          |  80809            |   Munich          | Germany      | 17657614733     |10-01-1990          |  sandhyarani10.mohanty@gmail.com          |



@Roadsurfer_VerifyCampervanBookingWithAdditionalDetails
Scenario Outline: Create and verify Customer booking with additional package

Given Open Home page and verify the landing page on landing page
When User enters the "<Station>", "<FromDate>", "<ToDate>" and click on search button
And User selects the "Filter" and click on "Book Now" button
And user clicks "Additional Package" from the list
Then User clicks on "Continue" button
And User enters "<FirstName>","<LastName>", "<Title>","<Street>", "<PostalCode>", "<City>", "<Country>","<Mobile>", "<DateOfBirth>", "<email>"
Then User press the "Continue" button on personal details page



    Examples:
      |     Station     | 	FromDate    |   ToDate     | FirstName | LastName    | Title     | Street                   | PostalCode        | City              | Country      | Mobile          |DateOfBirth        |   email                                     |
      |   Frankfurt     | 	Mar 2021,31	|  Apr 2021,10 |   Sandhya |  Mohanty   |  Mrs.     |   Hamburger str          |  80809            |   Munich          | Germany      | 17657614733     |10-01-1990          |  sandhyarani10.mohanty@gmail.com          |


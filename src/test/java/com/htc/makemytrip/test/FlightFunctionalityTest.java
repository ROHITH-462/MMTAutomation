package com.htc.makemytrip.test;

import java.text.ParseException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;
import com.htc.makemytrip.exception.InvalidDateException;

public class FlightFunctionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void flightTicketBookingTest(Map<String, String> mapData) throws InterruptedException, ParseException, InvalidDateException {
		try {
			childTest = test.createNode("Book a Flight From Chennai To Rome");
			indexPage.clickFlightsBtn();
			
			flightHomePage.setTravelDetails(mapData.get("FromCity"), mapData.get("ToCity"), 
											mapData.get("TravelDate"), mapData.get("Adult"), 
											mapData.get("Child"), mapData.get("Infant"), 
											mapData.get("ClassType"));
			childTest.pass("Travel Details Entered");
			
			flightSelectionPage.clickBookNowBtn(mapData.get("Airline"));
			childTest.pass("SpiceJet Airline Selected");
			
			flightReviewPage.reviewFlightDetails();
			flightTravellerDetailsPage.setTravellerDetails(mapData.get("Psg1_FirstName"), 
					mapData.get("Psg1_LastName"), mapData.get("Psg1_DOB"), mapData.get("Psg2_FirstName"), mapData.get("Psg2_LastName"), 
					mapData.get("Psg2_DOB"), mapData.get("PhoneNo"), mapData.get("EmailId"));
			childTest.pass("Traveller Details Entered");
			
			flightSeatSelectionPage.selectingSeat();
			childTest.pass("Seat Selected");
			
			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			Assert.fail();
		}
	}

}

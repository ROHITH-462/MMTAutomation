package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class HolidayFunctionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookAHolidayTripTest(Map<String, String> mapData) {
		try {

			childTest = test.createNode("Booking Holiday Trip to Kerala");
			indexPage.clickHolidaysBtn();

			holidaysHomePage.setTravelDetails(mapData.get("FromCity"), mapData.get("ToCity"));
			childTest.pass("Travel Details Entered");

			holidaysPackagePage.packageSelection(mapData.get("JourneyDate"));
			holidaysBookingPage.clickBookOnline();
			childTest.pass("Selecting Trip");

			holidaysReviewPage.setTravellerDetails(mapData.get("Adult1FirstName"), mapData.get("Adult1LastName"),
					mapData.get("Adult1DOB_Date"), mapData.get("Adult2FirstName"), 
					mapData.get("Adult2LastName"), mapData.get("Adult2DOB_Date"), 
					mapData.get("Email"), mapData.get("MobileNo"));
			childTest.pass("Traveller Details Entered");

			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}





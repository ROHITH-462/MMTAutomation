package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class HotelFunctionalityTest extends BaseTest {

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class) 
	public void bookAHotelTest(Map<String, String> mapData) throws InterruptedException {
		try {
			childTest = test.createNode("Book a Hotel @ Goa");
			indexPage.clickHotelsBtn();
			
			hotelsHomePage.setBookingDetails(mapData.get("City"), mapData.get("Checkin-Date"),
											 mapData.get("Checkout-Date"), mapData.get("Adults"),
											 mapData.get("Children"));
			childTest.pass("Travel Details Entered");
			
			hotelsSelectionPage.selectHotel(mapData.get("HotelName"));
			childTest.pass("Selecting a Hotel");
			
			hotelsReviewPage.reviewDetails(mapData.get("FirstName"), mapData.get("LastName"), 
										   mapData.get("Email"), mapData.get("MobileNo"));
			childTest.pass("Traveller Details Entered");
			
			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}


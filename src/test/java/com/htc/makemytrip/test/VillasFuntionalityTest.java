package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class VillasFuntionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookingVillasTest(Map<String, String> mapData) throws InterruptedException {
		try {
			
			childTest = test.createNode("Book a Resort @ Maldives");
			indexPage.clickMMTLogo();
			indexPage.clickVillasBtn();
			
			villasHomePage.bookingVillasDetails(mapData.get("City"), mapData.get("Checkin-Date"),
												mapData.get("Checkout-Date"), mapData.get("Adults"),
												mapData.get("Children"));
			childTest.pass("Travel Details Entered");
			
			villasSelectionPage.selectVilla(mapData.get("VillaName"));
			childTest.pass("Selecting a Resort");
			
			villasBookingPage.bookAVilla();
			villasReviewPage.reviewVilla(mapData.get("FirstName"), mapData.get("LastName"),
					mapData.get("Email"), mapData.get("MobileNo"));
			childTest.pass("Review Traveler Details and Navigating To Payment Page");
			
			Assert.assertEquals(paymentPage.assertPaymentVilla(), "Other Payment options");	
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}

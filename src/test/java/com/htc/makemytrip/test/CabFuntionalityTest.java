package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class CabFuntionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookACabTest(Map<String, String>mapData) {
		try {
			childTest = test.createNode("Book a SWIFT Cab Test");
			indexPage.clickCabsBtn();
			
			cabHomePage.setTravelDetails(mapData.get("FromCity"), mapData.get("ToCity"), 
					mapData.get("DepartureDate"), mapData.get("ReturnDate"),
					mapData.get("PickUpTime"), mapData.get("DropDownTime"));
			childTest.pass("Travel Details Entered");
			
			cabBookingPage.selectingCab(mapData.get("CarModel"));
			childTest.pass("Swift Car Selected");
			
			cabTripDetailsPage.setTravelDetails(mapData.get("PickUpAddress"), mapData.get("TravellerName"),
					mapData.get("TravellerEmail"), mapData.get("TravellerMobile"));
			childTest.pass("Traveller Details Entered And Navigated to Payment Page");
			
			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}

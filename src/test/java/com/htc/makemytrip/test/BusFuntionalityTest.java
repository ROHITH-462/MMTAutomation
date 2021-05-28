package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class BusFuntionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookABusTicketTest(Map<String, String> mapData) throws InterruptedException {
		try {
			childTest = test.createNode("Book A Bus Test");
			
			indexPage.clickBusesBtn();
			busHomePage.setTravelDetails(mapData.get("From-City"), mapData.get("To-City"),
					mapData.get("Journey-Date"));
			childTest.pass("Travel Details Entered");
			
			busSelectionPage.selectBus();
			childTest.pass("Bus Selected");
			
			busReviewPage.setPassengerDetails(mapData.get("FullName"), mapData.get("Age"), 
					mapData.get("Email"), mapData.get("MobileNo"));
			childTest.pass("Traveller Details Entered");
			
			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

}

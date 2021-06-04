package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class TrainFunctionalityTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookATrainTickectTest(Map<String, String> mapData) {
		try {

			childTest = test.createNode("Booking A Train Ticket");
			indexPage.clickMMTLogo();
			indexPage.clickTrainsBtn();
			trainsHomePage.setTravelDetails(mapData.get("From_City"), mapData.get("To_City"),
											mapData.get("Travel_Date"), mapData.get("Class_Type"));
			childTest.pass("Travel Details Entered");
			
			trainsSelectionPage.selectTrain(mapData.get("TrainNo"));
			childTest.pass("Train Selected");
			
			trainsReviewPage.setTravellerDetailsAndReview(mapData.get("Full_Name"), mapData.get("Age"),
														  mapData.get("IRCTC_User_Name"), mapData.get("Email"),
														  mapData.get("MobileNo"), mapData.get("Address"),
														  mapData.get("Pincode"));
			childTest.pass("Traveller Details Added");
			
			Assert.assertEquals(paymentPage.getPaymentAssertText(), "Payment options");
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getLocalizedMessage());
		}
	}


	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void checkPnrTest(Map<String, String> mapData) {
		try {

			childTest = test.createNode("Verifying PNR");
			indexPage.clickMMTLogo();
			indexPage.clickTrainsBtn();
			trainsHomePage.clickPnrRadioBtn();
			
			trainsPNRPage.setPnr(mapData.get("PNR"));
			childTest.pass("PNR Entered");
			
			trainsPNRPage.clickCheckStatus();
			Thread.sleep(5000);
//			Assert.assertEquals(trainsPNRPage.assertPnr(), "TRY DIFFERENT PNR");
			Assert.fail("Invalid PNR");
		} catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
}

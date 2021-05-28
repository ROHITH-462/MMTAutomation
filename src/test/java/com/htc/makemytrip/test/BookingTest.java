package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class BookingTest extends BaseTest{
	
	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void bookingTest(Map<String, String> mapData) {
		indexPage.makeATripBtn();
		directPaymentPage.setDetailsAndMakePayment(mapData.get("BookingId"), mapData.get("MobileNo"));
		Assert.assertEquals(directPaymentPage.getAssertTxt(), "Please enter a valid Booking ID or Mobile No");
	}

}

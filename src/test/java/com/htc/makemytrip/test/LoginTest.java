package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class LoginTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void loginTest(Map<String, String> mapData) {

		try {
			
			childTest = test.createNode("Login Method test");
			
			indexPage.clickCreateAccBtn();
			childTest.pass("Clicked Login Button");
			
			loginPage.performLogin(mapData.get("MobileOrEmail"), mapData.get("OTP"));
			childTest.pass("Login credantials added");
			
			Assert.assertEquals(homePage.userName(), "Hey Rohith");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}

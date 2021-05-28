package com.htc.makemytrip.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.htc.makemytrip.base.BaseTest;

public class NewAccountCreationTest extends BaseTest{

	@Test(dataProvider = "Data", dataProviderClass = com.htc.makemytrip.utility.DataProviderManager.class)
	public void registrationTest(Map<String, String> mapData, ITestResult result) throws InterruptedException {
		try {

			childTest = test.createNode("Registration Test");
			
			indexPage.clickCreateAccBtn();
			childTest.pass("Account Button Clicked");
			
			registerationPage.createAccount(mapData.get("MobileNo"),
											mapData.get("FullName"),
											mapData.get("Password"));
			childTest.pass("Personal Details Added");
			
			Assert.assertEquals(homePage.userName(), "Hey Dinesh");
			childTest.pass("Assertion is done");
			
		} catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}

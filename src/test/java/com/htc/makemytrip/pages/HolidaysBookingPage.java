package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.pageObjects.IHolidaysBookingPageObject;

public class HolidaysBookingPage extends BasePage implements IHolidaysBookingPageObject{

	Logger log = Logger.getLogger(HolidaysBookingPage.class);

	public HolidaysBookingPage(WebDriver driver) {
		super(driver);
	}

	public void clickBookOnline() throws InterruptedException {
		clickElement(bookOnlineBtn);
		log.info("Clicking Book Online");
		Thread.sleep(7000);
	}
}

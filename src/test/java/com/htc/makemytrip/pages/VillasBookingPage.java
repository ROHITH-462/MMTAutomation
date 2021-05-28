package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IVillasBookingPageObject;


public class VillasBookingPage extends BasePage implements IVillasBookingPageObject {

	Logger log = Logger.getLogger(VillasBookingPage.class);
	public VillasBookingPage(WebDriver driver) {
		super(driver);
	}

	public void clickViewThisCombo() {
		clickElement(viewThisComboBy);
		log.info("Clicking viewThisCombo");
	}

	public void clickBookThisCombo() {
		clickElement(bookThisComboBy);
		log.info("Clicking bookThisCombo");
	}

	public void clickBookThisNow() {
		clickElement(bookThisNowBy);
		log.info("Clicking Book This Now");
	}

	public void bookAVilla() throws InterruptedException, MyException {
		try {
					clickViewThisCombo();
					Thread.sleep(5000);
					clickBookThisCombo();
//					clickBookThisNow();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}



}

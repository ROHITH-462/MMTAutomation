package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IIndexPageObject;

public class IndexPage extends BasePage implements IIndexPageObject{

	Logger log = Logger.getLogger(IndexPage.class);
	
	public IndexPage(WebDriver driver) {
		super(driver);
	}

	public void clickCreateAccBtn() {
		clickElement(loginOrCreateAccBtnBy);
		log.info("Clicking Create Account");
	}

	public void clickFlightsBtn() {
		clickElement(flightsBtnBy);
		log.info("Clicking Flight");
	}

	public void clickHotelsBtn() {
		clickElement(hotelsBtnBy);
		log.info("Clicking Hotel");
	}

	public void clickVillasBtn() {
		clickElement(villasBtnBy);
		log.info("Clicking Villa");
	}

	public void clickHolidaysBtn() {
		clickElement(holidaysBtnBy);
		log.info("Clicking Holiday");
	}

	public void clickTrainsBtn() {
		clickElement(trainsBtnBy);
		log.info("Clicking Train");
	}

	public void clickBusesBtn() {
		waitForVisibilityOfElementLocatable(driver, busesBtnBy);
		clickElement(busesBtnBy);
		log.info("Clicking Bus");
	}

	public void clickVisaBtn() {
		clickElement(visaBtnBy);
		log.info("Clicking Visa");
	}

	public void clickCabsBtn() {
		clickElement(cabsBtnBy);
		log.info("Clicking Cab");
	}
	
	public void makeATripBtn() {
		scrollToVisibleElement(aboutThisSiteBy, driver);
		clickElement(makeAPaymentBy);
		log.info("Clicking Make A Trip Button");
	}
	
	public void clickLogout() {
		clickElement(logoutBy);
		log.info("Clicking Logout");
	}
	
	public void performLogout() throws MyException {
		try {
			clickElement(loginOrCreateAccBtnBy);
			clickElement(logoutBy);
			log.info("Performing Logout");
		} catch (Exception e) {
			throw new MyException(e.getMessage());
		}
		
	}

}

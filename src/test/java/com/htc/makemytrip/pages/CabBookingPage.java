package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.CarModelNotFoundException;
import com.htc.makemytrip.pageObjects.ICabBookingPageObject;

public class CabBookingPage extends BasePage implements ICabBookingPageObject {

	Logger log = Logger.getLogger(CabBookingPage.class);

	public CabBookingPage(WebDriver driver) {
		super(driver);
	}

	public void selectCarModel(String carModel) {
		//		clickElement(carModelBy);
		selectCabModel(carModel);
		log.info("Car Model Selected");
	}

	public void clickBookNow() {

		String cabAvailable = cabAvailability();
		System.out.println("Cab Price Label: " + cabAvailable);
		if(cabAvailable.equalsIgnoreCase("view prices")) {
			clickElement(viewPricesBy);
			clickElement(bookBy);
		} else {
			clickElement(bookNowBy);
		}
		log.info("Book Now Button clicked");
	}

	public void selectCab() {
		clickElement(selectCabBy);
		log.info("Selecting Cab");
	}

	public void clickBook() {
		clickElement(bookBy);
		log.info("Clicking BookNow");
	}

	public void covidSafetyCheckBox() {
		clickElement(covidSafetyCheckBoxBy);
		log.info("Covid Safety CheckBox Clicked");
	}

	public void covidSafetyContinue() throws InterruptedException {
		clickElement(covidSafetyContinueBy);
		log.info("Covid Safety Continue Button Clicked");		
	}

	public void selectingCab(String carModel) throws Exception {
		try {
			selectCarModel(carModel);
			clickBookNow();
			covidSafetyCheckBox();
			covidSafetyContinue();
		}catch (Exception e) {
			throw new CarModelNotFoundException("Cab Not Found "+e.getMessage());
		}
	}





}

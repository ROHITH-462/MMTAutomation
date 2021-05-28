package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.FlightNotAvailableException;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IFlightSelectionPageObject;

public class FlightSelectionPage extends BasePage implements IFlightSelectionPageObject{

	Logger log = Logger.getLogger(FlightSelectionPage.class);

	public FlightSelectionPage(WebDriver driver) {
		super(driver);
	}

	public void scrollUntilAllianceAndAirlines() throws Exception {
		scrollToVisibleElement(alliancesAndAirlinesBy, driver);
		log.info("Scrolled until Alliances and Airlines Text");
//		Thread.sleep(2000);
	}
	
	public void selectFlight(String airlineName) throws Exception {
		try {
			selectAirline(airlineName);
			log.info("Selecting airLine");			
		} catch (Exception e) {
			throw new FlightNotAvailableException(e.getMessage());
		}
	}
	
	public void clickBookNow() throws Exception {
		try {
			clickElement(bookNowBtnBy);
			log.info("Clicking Book Now");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new MyException("Cannot able to click book now "+e.getMessage());
		}
	}
	
	public void switchingTheDriver() {
		switchtoNewTab(driver);
		log.info("Driver Switching to new Tab");
	}
	
	public void clickBookNowBtn(String airline) throws Exception {
		try {
			scrollUntilAllianceAndAirlines();
			selectFlight(airline);
			clickBookNow();
			switchingTheDriver();			
		} catch (Exception e) {
			throw new FlightNotAvailableException("Flight Not Available " + e.getMessage());
		}

	}



}

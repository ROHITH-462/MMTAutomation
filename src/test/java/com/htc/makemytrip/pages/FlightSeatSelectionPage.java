package com.htc.makemytrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.SeatNotAvailableException;
import com.htc.makemytrip.pageObjects.IFlightSeatSelectionPageObject;

public class FlightSeatSelectionPage extends BasePage implements IFlightSeatSelectionPageObject{

	public FlightSeatSelectionPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOKay() throws InterruptedException {
		Thread.sleep(3000);
		clickElement(okayBy);
//		handleAlert();
	}
	
	public void selectSeatPsg1Flight1() throws Exception {
		Thread.sleep(3000);
		clickElement(flight1Psg1SeatBy);
		Thread.sleep(1000);
	}
	
	public void selectSeatPsg2Flight1() throws Exception {
		clickElement(flight1Psg2SeatBy);
		Thread.sleep(1000);
	}
	
	public void clickNextFlight1() {
		clickElement(nextBy);
	}
	
	public void selectSeatPsg1Flight2() throws Exception {
		clickElement(flight2Psg1SeatBy);
		Thread.sleep(1000);
	}
	
	public void selectSeatPsg2Flight2() throws Exception {
		clickElement(flight2Psg2SeatBy);
		Thread.sleep(1000);
	}
	
	public void clickNextFlight2() throws Exception {
		clickElement(nextBy);
		Thread.sleep(6000);
	}
	
	public void clickContToPay() {
		clickElement(continueToPayBy);
	}
	
	public void selectingSeat() throws Exception {
		try {
//		clickOKay();
		selectSeatPsg1Flight1();
		selectSeatPsg2Flight1();
		clickNextFlight1();
		selectSeatPsg1Flight2();
		selectSeatPsg2Flight2();
		clickNextFlight2();
		clickContToPay();
		}catch (Exception e) {
			throw new SeatNotAvailableException("Seat Not Available "+e.getMessage());
		}
		
	}

}

package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.BusNotAvailableException;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IBusSelectionPageObject;

public class BusSelectionPage extends BasePage implements IBusSelectionPageObject{

	Logger log = Logger.getLogger(BusSelectionPage.class);
	public BusSelectionPage(WebDriver driver) {
		super(driver);
	}

	public void scrollUntilYBM() {
		waitForVisibilityOfElementLocatable(driver, jabbarTravelsTxtBy);
		scrollToVisibleElement(jabbarTravelsTxtBy, driver);
		log.info("Scroll Until YBM");
		
	}
	
	public void clickSelectSeats(String travelsName, String travelTime) throws BusNotAvailableException {
		try {
//		clickElement(selectSeatsBtnBy);
		chooseBus(travelsName, travelTime);
		log.info("Clicking Selecting Seat");
		}catch (Exception e) {
			throw new BusNotAvailableException("Bus Not Available " + e.getMessage());
		}
	}
	
	public void selectPickUpPoint() {
//		waitForVisibilityOfElementLocatable(driver, pickUpPointBy);
		clickElement(pickUpPointBy);
		log.info("Clicking Pickup Point");
	}
	
	public void selectDropDownPoint() {
//		waitForVisibilityOfElementLocatable(driver, dropPointBy);
		clickElement(dropPointBy);
		log.info("Selecting DropDown Point");
	}
	
	public void selectSeat() {
		clickElement(selectSeatBy);
		log.info("Selecting Seat");
	}
	
	public void clickBookSeat() {
//		waitForVisibilityOfElementLocatable(driver, bookSeatBtnBy);
		clickElement(bookSeatBtnBy);
		log.info("Clicking Book Seats");
	}
	
	public void selectBus(String travelsName, String travelTime) throws MyException {
		try {
//		scrollUntilYBM();
		clickSelectSeats(travelsName, travelTime);
		selectPickUpPoint();
		selectDropDownPoint();
		selectSeat();
		clickBookSeat();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
}

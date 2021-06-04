package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ICabTripDetailsPageObject;

public class CabTripDetailsPage extends BasePage implements ICabTripDetailsPageObject{
	
	Logger log = Logger.getLogger(CabTripDetailsPage.class);

	public CabTripDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public void scrollUntilInclusions() {
		waitForVisibilityOfElementLocatable(driver, scrollUntilInclusionsBy);
		scrollToVisibleElement(scrollUntilInclusionsBy, driver);
	}
	
	public void clickPickUpAddress() {
		clickElement(pickUpAddressBy);
		log.info("Clicking Pickup Address");
	}
	
	public void setPickUpAddress(String address) throws Exception {
		setData(pickUpAddressTextBy, address);
		log.info("Setting Pick Up Address");
		Thread.sleep(2000);
	}
	
	public void selectPickUpAddress() {
		clickElement(pickAddressSuggestionBy);
		log.info("Selecting Pick Up Address From DropDown");
	}
	
	public void setTravellerDetails(String travellerName, String travellerEmail, String travellerMobileNo) throws InterruptedException {
		setData(travellerNameBy, travellerName);
		log.info("Setting Traveller Name");
		
		clickElement(travellerGenderBy);
		log.info("Selecting Gender");
		
		setData(travellerEmailBy, travellerEmail);
		log.info("Setting Traveller Email");
		
		setData(travellerMobileNoBy, travellerMobileNo);
		log.info("Setting Traveller Mobile No");
		Thread.sleep(4000);		
	}
	
	public void clickPayNow() throws InterruptedException {
		clickElement(payBy);
		log.info("Clicking Pay Now");
		Thread.sleep(5000);
	}
	
	public void setTravelDetails(String address, String travellerName, String travellerEmail, 
								 String travellerMobile) throws Exception {
		try {
		scrollUntilInclusions();
		clickPickUpAddress();
		setPickUpAddress(address);
		selectPickUpAddress();
		setTravellerDetails(travellerName, travellerEmail, travellerMobile);
		clickPayNow();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	
}

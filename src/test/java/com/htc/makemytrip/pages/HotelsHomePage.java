	package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHotelsHomePageObject;

public class HotelsHomePage extends BasePage implements IHotelsHomePageObject{
	
	Logger log = Logger.getLogger(HotelsHomePage.class);
	
	public HotelsHomePage(WebDriver driver) {
		super(driver);
	}

	public void clickCity() {
		clickElement(cityBy);
		log.info("city is clicked");
	}
	
	public void setCity(String city) {
		waitForVisibilityOfElementLocatable(driver, cityTxtBoxBy);
		setData(cityTxtBoxBy, city);
		clickElement(citySuggesstionBy);
		log.info("City is entered");
	}
	
	public void clickCheckInDate() {
		clickElement(checkInDateBy);
		log.info("Clicking checkin date");
	}
	
	public void setCheckInDate(String checkin_date) {
		String[] splittedDate = splitDateFromExcel(checkin_date);
		dateSelection(splittedDate[0], splittedDate[1]);
		log.info("Setting checkin date");
	}
	
	public void clickCheckOutDate() {
		clickElement(checkOutDateBy);
		log.info("Clicking checkout date");
	}
	
	public void setCheckOutDate(String checkout_date) {
		String[] splittedDate = splitDateFromExcel(checkout_date);
		dateSelection(splittedDate[0], splittedDate[1]);
		log.info("Setting checkout date");
	}
	
	public void clickRoomsAndGuests() {
		clickElement(roomsAndGuestsBy);
		log.info("Clicking rooms and guests");
	}
	
	public void setGuests(String adult, String children) {
		selectGuests(adult, children);
		log.info("Setting rooms and guests");
	}
	
	public void clickApplyBtn() {
		clickElement(applyBtnBy);
		log.info("Clicking apply button");
	}
	
	public void clickSearchBtn() {
		clickElement(searchBtnBy);
		log.info("Clicking search button");
	}
	
	public void setBookingDetails(String city, String checkin_date, String checkout_date, 
								  String adult, String children) throws MyException {
		try {
		clickCity();
		setCity(city);
		setCheckInDate(checkin_date);
		setCheckOutDate(checkout_date);
		clickRoomsAndGuests();
		setGuests(adult, children);
		clickApplyBtn();
		clickSearchBtn();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	
	

}

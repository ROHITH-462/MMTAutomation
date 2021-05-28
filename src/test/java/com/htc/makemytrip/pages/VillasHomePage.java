package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IVillasHomePageObject;

public class VillasHomePage extends BasePage implements IVillasHomePageObject{

	Logger log = Logger.getLogger(VillasHomePage.class);
	
	public VillasHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickCity() {
		clickElement(cityBy);
		waitForElementToBeClickable(driver, cityBy);
		log.info("Clicking city");
	}
	
	public void setCity(String city) {
		waitForVisibilityOfElementLocatable(driver, cityTxtBoxBy);
		setData(cityTxtBoxBy, city);
		clickElement(citySuggestionBy);
		log.info("Setting City Name");
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
	
	public void clickGuests() {
		clickElement(guestsBy);
		log.info("Clicking guests");
	}
	
	public void setGuests(String adults, String children) {
		selectGuests(adults, children);
		log.info("Setting guests");
	}
	
	public void clickApply() {
		clickElement(applyBtnBy);
		log.info("Clicking Apply");
	}
	
	public void clickSearch() {
		clickElement(searchBtnBy);
		log.info("Clicking Search");
	}
	
	public void bookingVillasDetails(String city, String checkin_date, String checkout_date, 
									 String adults, String children) throws MyException {
		try {
		clickCity();
		setCity(city);
		setCheckInDate(checkin_date);
		setCheckOutDate(checkout_date);
		clickGuests();
		setGuests(adults, children);
		clickApply();
		clickSearch();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}

}

package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ICabHomePageObject;

public class CabHomePage extends BasePage implements ICabHomePageObject {

	Logger log = Logger.getLogger(CabHomePage.class);
	
	public CabHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickRoundTrip() {
		clickElement(roundTripBy);
		log.info("Clicking Round Trip");
	}
	
	public void clickFromCity() {
		clickElement(fromCityBy);
		log.info("Clicking From City");
	}
	
	public void setFromCity(String fromCity) throws InterruptedException {
		setData(fromCityTxtBoxBy, fromCity);
		log.info("Setting From City");
		Thread.sleep(2000);
	}
	
	public void clickFromCitySuggestion() {
		clickElement(fromCitySuggestionBy);
		log.info("Clicking From Suggestion");
	}
	
	public void clickToCity() {
		clickElement(toCityBy);
		log.info("Clicking To City");
	}
	
	public void setToCity(String toCity) throws Exception {
		setData(toCityTxtBoxBy, toCity);
		Thread.sleep(2000);
		log.info("Setting To City");
	}
	
	public void clickToCitySuggestion() {
		clickElement(toCitySuggestionBy);
		log.info("Clicking To Suggestion");
	}
	
	public void clickDepartureDate() {
		clickElement(departureDateBy);
		log.info("Clicking Departure Date");
	}
	
	public void setDepartureDate(String date) {
		String[] splittedDate = splitDateFromExcel(date);
		dateSelection(splittedDate[0], splittedDate[1]);
		log.info("Setting Departure Date");
	}
	
	public void clickReturnDate() {
		clickElement(returnDateBy);
		log.info("Clicking Return Date");
	}
	
	public void setReturnDate(String date) {
		String[] splittedDate = splitDateFromExcel(date);
		dateSelection(splittedDate[0], splittedDate[1]);
		log.info("Setting Return Date");
	}
	
	public void setPickUpTime(String pickUpTime) {
//		clickElement(setPickUpTimeBy);
		setPickUpTimeCab(pickUpTime);
		log.info("Setting PickUp Time");
	}
	
	public void setDropDownTime(String dropDownTime) {
		clickElement(dropTimeBy);
		setDropDownTimeCab(dropDownTime);
		log.info("Clicking DropDown Time");
		
		clickElement(setDropTimeBy);
		log.info("Setting DropDown Time");
	}
	
	public void clickSearch() throws Exception {
		clickElement(searchBy);
		log.info("Clicking Search");
		Thread.sleep(5000);
	}
	
	public void setTravelDetails(String fromCity, String toCity, String deptDate, 
								 String retDate, String pickUpTime, String dropDownTime) 
								 throws Exception {
		try {
		clickRoundTrip();
		clickFromCity();
		setFromCity(fromCity);
		clickFromCitySuggestion();
		setToCity(toCity);
		clickToCitySuggestion();
		setDepartureDate(deptDate);
		setReturnDate(retDate);
		setPickUpTime(pickUpTime);
		setDropDownTime(dropDownTime);
		clickSearch();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	
	
	
}

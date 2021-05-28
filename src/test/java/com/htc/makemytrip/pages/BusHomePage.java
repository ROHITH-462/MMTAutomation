package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IBusHomePageObject;

public class BusHomePage extends BasePage implements IBusHomePageObject {
	
	Logger log = Logger.getLogger(BusHomePage.class);

	public BusHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickFromCity() {
			clickElement(fromCityBy);
			log.info("Clicking From City");		
	}
	
	public void setFromCity(String fromCity) {
			setData(fromCityTxtBoxBy, fromCity);
			log.info("Setting From City");
	}
	
	public void selectFromCitySuggestion() {
			clickElement(fromCitySuggestionBy);
			log.info("Selecting From Suggestion");
	}
	
	public void clickToCity() {
			clickElement(toCityBy);
			log.info("Clicking To City");
	}
	
	public void setToCity(String toCity) {
			setData(toCityTxtBoxBy, toCity);
			log.info("Setting To City");
	}
	
	public void selectToCitySuggestion() {
		
		clickElement(toCitySuggestionBy);
		log.info("Selection To Suggestiion");
		
	}
	
	public void clickDate() {
		clickElement(travelDateBy);
		log.info("Clicking Date");
	}
	
	public void setDate(String date) {
		String[] splittedDate = splitDateFromExcel(date);
		dateSelection(splittedDate[0], splittedDate[1], splittedDate[2]);
		log.info("Setting Date");
	}
	
	public void clickSearch() {
		clickElement(searchBtnBy);
		log.info("Clicking Search");		
	}
	
	public void setTravelDetails(String fromCity, String toCity, String date) throws MyException {
		try {
		clickFromCity();
		setFromCity(fromCity);
		Thread.sleep(1000);
		selectFromCitySuggestion();
		setToCity(toCity);
		Thread.sleep(1000);
		selectToCitySuggestion();
		setDate(date);
		clickSearch();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}

}

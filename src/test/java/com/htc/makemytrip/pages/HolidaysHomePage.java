package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHolidaysHomePageObject;

public class HolidaysHomePage extends BasePage implements IHolidaysHomePageObject{

	Logger log = Logger.getLogger(HolidaysHomePage.class);
	
	public HolidaysHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void selectFromCity() {
		clickElement(fromCityBy);
		log.info("Clicking from city");
	}
	
	public void setFromCity(String fromCity) {
		setData(fromCityTxtBoxBy, fromCity);
		log.info("Setting from city");
	}
	
	public void selectSuggestionFrom() {
		clickElement(fromCitySuggestionBy);
		log.info("Selecting from suggestion");
	}
	
	public void selectToCity() {
		clickElement(toCityBy);
		log.info("Clicking to city");
	}
	
	public void setToCity(String toCity) {
		setData(toCityTxtBoxBy, toCity);
		log.info("Setting to city");
	}
	
	public void selectSuggestionTo() {
		clickElement(toCitySuggestionBy);
		log.info("Selecting to city from suggestion");
	}
	
	public void clickSearchBtn() throws InterruptedException {
		clickElement(searchBtnBy);
		log.info("Clicking on search");
		Thread.sleep(5000);
	}
	
	public void setTravelDetails(String fromCity, String toCity) throws Exception {
		try {
		selectFromCity();
		setFromCity(fromCity);
		Thread.sleep(1000);
		selectSuggestionFrom();
		setToCity(toCity);
		Thread.sleep(2000);
		selectSuggestionTo();
		clickSearchBtn();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}

}

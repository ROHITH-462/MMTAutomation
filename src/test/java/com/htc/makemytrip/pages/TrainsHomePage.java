package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ITrainsHomePageObject;

public class TrainsHomePage extends BasePage implements ITrainsHomePageObject{

	Logger log = Logger.getLogger(TrainsHomePage.class);

	public TrainsHomePage(WebDriver driver) {
		super(driver);
	}

	public void clickPnrRadioBtn() {
		clickElement(pnrRadioButton);
		log.info("Clicking PNR");
	}

	public void clickFromCity() {
		clickElement(fromCityBy);
		log.info("Clicking From City");
	}

	public void setFromCity(String fromCity) {
		setData(fromCityTextBoxBy, fromCity);
		log.info("Setting From City");
	}

	public void selectFromSuggestion() {
		clickElement(selectFromSuggestionBy);
		log.info("Slecting from Suggestion");
	}

	public void clickToCity() {
		clickElement(toCityBy);
		log.info("Clicking to city");
	}

	public void setToCity(String toCity) {
		setData(toCityTextBoxBy, toCity);
		log.info("Clicking to city");
	}

	public void selectToSuggestion() {
		clickElement(selectToSuggestionBy);
		log.info("Selection to suggestion");
	}

	public void clickTravelDate() {
		clickElement(travelDateBy);
		log.info("Clicking travel Date");
	}

	public void setDate(String date) {
		String[] splittedDate = splitDateFromExcel(date);
		dateSelection(splittedDate[0], splittedDate[1], splittedDate[2]);
		log.info("Setting date");
	}

	public void clickClass() {
		clickElement(classBy);
		log.info("Clicking class");
	}

	public void selectClassType(String classType) {
		selectClass(classType);
//		clickElement(classTypeBy);
		log.info("Selecting class");
	}

	public void clickSearchBtn() throws Exception {
		clickElement(searchBtnBy);
		log.info("Clicking Search");
		Thread.sleep(5000);
	}


	public void setTravelDetails(String fromCity, String toCity, String date, String classType) throws MyException {
		try {
			clickFromCity();
			setFromCity(fromCity);
			Thread.sleep(2000);
			selectFromSuggestion();
			setToCity(toCity);
			Thread.sleep(2000);
			selectToSuggestion();
			setDate(date);
			selectClassType(classType);
			clickSearchBtn();
		} catch(Exception e){
			throw new MyException(e.getMessage());
		}
	}

}

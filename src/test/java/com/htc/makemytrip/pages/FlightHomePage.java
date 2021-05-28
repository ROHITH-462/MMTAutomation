package com.htc.makemytrip.pages;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.InvalidDateException;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IFlightHomePageObject;

public class FlightHomePage extends BasePage implements IFlightHomePageObject{

	Logger log = Logger.getLogger(FlightHomePage.class);

	public FlightHomePage(WebDriver driver) {
		super(driver);
	}

	//From-City
	public void clickFromCity() {
		clickElement(fromCityBy);
		log.info("Clikcing From City");

	}

	public void setFromCity(String FromCity) {
		setData(fromCityTextBoxBy, FromCity);
		log.info("Setting From City");
	}

	public void selectFromSuggestion() {
		waitForVisibilityOfElementLocatable(driver, selectFromSuggestionBy);
		clickElement(selectFromSuggestionBy);
		log.info("Selecting From Suggestion");
	}

	//To-City
	public void clickToCity() {
		clickElement(toCityBy);
		log.info("Clikcing To City");
	}

	public void setToCity(String ToCity) {
		setData(toCityTextBoxBy, ToCity);
		log.info("Setting To City");
	}

	public void selectToSuggestion() {
		waitForVisibilityOfElementLocatable(driver, selectToSuggestionBy);
		clickElement(selectToSuggestionBy);
		log.info("Selecting To Suggestion");
	}

	//Departure-Date
	public void clickDepartureDate() {
		clickElement(departureDateBy);
		log.info("Clicking Departure Date");
	}

	public void setDate(String travelDate) throws Exception{
		try{
			String[] splittedDate = splitDateFromExcel(travelDate);
			if(dateValidation(splittedDate[0], splittedDate[1], splittedDate[2])) {
				selectDate(splittedDate[0], splittedDate[1], splittedDate[2]);
				log.info("Setting Date");
			}
		}
		catch (Exception e) {
			throw new InvalidDateException("Invalid Date "+e.getMessage());
		}			
	}

	//No:of:Passengers and class-type
	public void selectTravellersAndClass() {
		clickElement(selectTravellersBy);
		log.info("Selecting Travelling Class");		
	}

	public void setTravellersAndClass(String Adult, String Child, String Infant, String ClassType) {
		selectTravellers_Class(Adult, Child, Infant, ClassType);
		log.info("Setting Travelling Class and Passengers");
	}

	public void clickApplyBtn() {
		clickElement(travellersApplyBtnBy);
		log.info("Clicking Apply");
	}

	//Search Button
	public void clickSearchBtn() {
		clickElement(searchBtnBy);
		log.info("Clciking Search");
	}

	public void setTravelDetails(String FromCity, String ToCity, String travelDate, 
			String Adult, String Child, String Infant, String ClassType)		 
					throws ParseException, MyException {
		try {
			clickFromCity();
			setFromCity(FromCity);
			selectFromSuggestion();
			setToCity(ToCity);
			selectToSuggestion();
			setDate(travelDate);
			selectTravellersAndClass();
			setTravellersAndClass(Adult, Child, Infant, ClassType);
			clickApplyBtn();
			clickSearchBtn();
		}catch (Exception e) {
			throw new MyException("Travel Details Method Failed " + e.getMessage());
		}
	}






}

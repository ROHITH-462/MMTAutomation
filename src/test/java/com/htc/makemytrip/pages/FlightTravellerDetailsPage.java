package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IFlightTravellerDetailsPageObject;

public class FlightTravellerDetailsPage extends BasePage implements IFlightTravellerDetailsPageObject{

	Logger log = Logger.getLogger(FlightTravellerDetailsPage.class);

	public FlightTravellerDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void setPsg1FirstName(String psg1_FirstName) {
		waitForVisibilityOfElementLocatable(driver, passenger1firstNameBy);
		setData(passenger1firstNameBy, psg1_FirstName);
		log.info("Setting Passenger1 First Name");
	}

	public void setPsg1LastName(String psg1_LastName) {
		setData(passenger1lastNameBy, psg1_LastName);
		log.info("Setting Passenger1 Last Name");
	}

	public void setPsg1Gender() {
		clickElement(passenger1GenderBy);
		log.info("Setting Passenger1 Gender");
	}
	
	public void setPsg1_DOB(String dob) {
		String[] splittedDOB = splitDateFromExcel(dob);
		passenger1DOBEntry(splittedDOB[0], splittedDOB[1]);
		log.info("Setting Passenger1 DOB");
	}

	public void clickAddAdultBtn() {
		clickElement(addAdultBy);
		log.info("Clicking Add Adult");
	}

	public void setPsg2FirstName(String psg2_FirstName) {		
		setData(passenger2firstNameBy, psg2_FirstName);
		log.info("Setting Passenger2 First Name");
	}

	public void setPsg2LastName(String psg2_LastName) {
		setData(passenger2lastNameBy, psg2_LastName);
		log.info("Setting Passenger2 Last Name");
	}

	public void setPsg2Gender() {
		clickElement(passenger2GenderBy);
		log.info("Setting Passenger2 Gender");
	}
	
	public void setPsg2_DOB(String dob) {
		String[] splittedDate = splitDateFromExcel(dob);
		passenger2DOBEntry(splittedDate[0], splittedDate[1]);
		log.info("Setting Passenger2 DOB");
	}

	public void setMobileNo(String Mobile_No) {
		setData(mobileNumberBy, Mobile_No);
		log.info("Setting Mobile No");
	}

	public void setEmailId(String emailId) {
		setData(emailIDBy, emailId);
		log.info("Setting Email ID");
	}

	public void clickContinueBtn() {
		clickElement(continueBtnBy);
		log.info("Clicking Continue");
	}

	public void clickConfirm() {
		//this appears separate review tab
		waitForVisibilityOfElementLocatable(driver, confirmBy);
		clickElement(confirmBy);
		log.info("Clicking Confirm");
	}

	public void setTravellerDetails(String psg1_FirstName, String psg1_LastName, String dob1, 
									String psg2_FirstName, String psg2_LastName, String dob2, 
									String Mobile_No, String Email_Id)
									throws Exception {
		try {
			setPsg1FirstName(psg1_FirstName);
			setPsg1LastName(psg1_LastName);
			setPsg1Gender();
			setPsg1_DOB(dob1);
			
			clickAddAdultBtn();
			
			setPsg2FirstName(psg2_FirstName);
			setPsg2LastName(psg2_LastName);
			setPsg2Gender();
			setPsg2_DOB(dob2);
			
			setMobileNo(Mobile_No);
			setEmailId(Email_Id);
			
			clickContinueBtn();
			clickConfirm();
		}catch (Exception e) {
			throw new MyException("Traveller Details Method Failed " +e.getMessage());
		}
	}

}

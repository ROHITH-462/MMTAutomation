package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IBusReviewPageObject;

public class BusReviewPage extends BasePage implements IBusReviewPageObject{
	
	Logger log = Logger.getLogger(BusReviewPage.class);

	public BusReviewPage(WebDriver driver) {
		super(driver);
	}
	
	public void setName(String fullName) {
		setData(nameBy, fullName);
		log.info("Setting Name");
	}

	public void setAge(String age) {
		setData(ageBy, age);
		log.info("Setting Age");
	}
	
	public void clickGender() {
		clickElement(genderBy);
		log.info("Clicking Gender");
	}
	
	public void selectMale() {
		clickElement(selectMaleBy);
		log.info("Selecting Male");
	}
	
	public void setMail(String email) {
		setData(emailIdBy, email);
		log.info("Setting Email");
	}
	
	public void setMobileNo(String mobileNo) {
		setData(mobileNoBy, mobileNo);
		log.info("Setting Mobile No");
	}
	
	public void selectTripInsurance() {
		clickElement(tripInsuranceNoBy);
		log.info("Selecting Trip Insurance");
	}
	
	public void clickBookNow() throws Exception {
		clickElement(bookNowBy);
		Thread.sleep(3000);
		log.info("Clicking Book Now");
	}
	
	public void setPassengerDetails(String fullName, String age, String email, String mobileNo) 
		   throws MyException {
		try {
		setName(fullName);
		setAge(age);
		clickGender();
		selectMale();
		setMail(email);
		setMobileNo(mobileNo);
		selectTripInsurance();
		clickBookNow();
		
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
}

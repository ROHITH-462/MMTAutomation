package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IVillasReviewPageObject;

public class VillasReviewPage extends BasePage implements IVillasReviewPageObject{

	Logger log = Logger.getLogger(VillasReviewPage.class);
	
	public VillasReviewPage(WebDriver driver) {
		super(driver);
	}
	
	public void scrollUntilGuestDetails() {
		waitForVisibilityOfElementLocatable(driver, guestDetailsBy);
		scrollToVisibleElement(guestDetailsBy, driver);
		log.info("Scroll until guest details");
	}
	
	public void setFirstName(String firstName) {
		setData(firstNameBy, firstName);
		log.info("Setting first name");
	}
	
	public void setLastName(String lastName) {
		setData(lastNameBy, lastName);
		log.info("Setting last name");
	}
	
	public void setEmailID(String email) {
		setData(emailIdBy, email);
		log.info("Setting email");
	}
	
	public void setPhoneNo(String mobileNo) {
		setData(phoneNoBy, mobileNo);
		log.info("Setting phone no");
	}
	
	public void clickReserveNow() {
		clickElement(reserveNowBy);
		log.info("Clicking reserve now");
	}
	
	public void reviewVilla(String firstName, String lastName, String email, String mobileNo) throws MyException {
		try {
		scrollUntilGuestDetails();
		setFirstName(firstName);
		setLastName(lastName);
		setEmailID(email);
		setPhoneNo(mobileNo);
		clickReserveNow();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}

}

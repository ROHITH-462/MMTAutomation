package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHotelsReviewPageObject;

public class HotelsReviewPage extends BasePage implements IHotelsReviewPageObject {
	
	Logger log = Logger.getLogger(HotelsReviewPage.class);

	public HotelsReviewPage(WebDriver driver) {
		super(driver);
	}

	public void scrollUntilGuestDetails() {
		waitForVisibilityOfElementLocatable(driver, guestDetailsTxtBy);
		scrollToVisibleElement(guestDetailsTxtBy, driver);
		log.info("Scrolling till guest details");
	}

	public void setFirstName(String firstName) {
		setData(firstNameBy, firstName);
		log.info("Setting firstname");
	}

	public void setLastName(String lastName) {
		setData(lastNameBy, lastName);
		log.info("Setting lastname");
	}

	public void setEmail(String email) {
		setData(emailIdBy, email);
		log.info("Setting email");
	}

	public void setMobileNo(String mobileNo) {
		setData(mobileNoBy, mobileNo);
		log.info("Setting mobileNo");
	}

	public void clickPayNow() {
		clickElement(payNowBy);
		log.info("Clicking Paynow");
	}
	
	public void reviewDetails(String firstName, String lastName, String email, String mobileNo) throws MyException {
		try {
		scrollUntilGuestDetails();
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setMobileNo(mobileNo);
		clickPayNow();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}


}

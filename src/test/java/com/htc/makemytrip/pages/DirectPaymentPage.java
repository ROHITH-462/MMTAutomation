package com.htc.makemytrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.pageObjects.IDirectPaymentPage;

public class DirectPaymentPage extends BasePage implements IDirectPaymentPage{

	public DirectPaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public void setBookingIn(String bookingId) {
		setData(bookingIdBy, bookingId);
	}
	
	public void setMobileNo(String mobileNo) {
		setData(mobileNoBy, mobileNo);
	}
	
	public void clickSubmit() {
		clickElement(submitBy);
	}
	
	public String getAssertTxt() {
		return getText(assertTxtBy);
	}
	
	public void setDetailsAndMakePayment(String bookingId, String mobileNo) {
		setBookingIn(bookingId);
		setMobileNo(mobileNo);
		clickSubmit();
	}

}

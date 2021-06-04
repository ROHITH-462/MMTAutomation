package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IPaymentPageObject;

public class PaymentPage extends BasePage implements IPaymentPageObject{

	Logger log = Logger.getLogger(PaymentPage.class);
	
	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPaymentAssertText() throws MyException {
		try {
		waitForVisibilityOfElementLocatable(driver, paymentOptionsBy);
		log.info("Asserting payment text");
		return getText(paymentOptionsBy);
		} catch (Exception e) {
			throw new MyException(e.getMessage());
		}		
	}
	
	public String assertPaymentVilla() throws MyException {
		try {
			waitForVisibilityOfElementLocatable(driver, otherPaymentBy);
			log.info("Other Payment Text Asserted");
			return getText(otherPaymentBy);
		} catch (Exception e) {
			throw new MyException("Assertion Error " + e.getMessage());
		}
		
	}
	
	

}

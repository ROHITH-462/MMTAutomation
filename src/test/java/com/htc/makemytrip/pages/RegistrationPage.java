package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IRegistrationPageObject;

public class RegistrationPage extends BasePage implements IRegistrationPageObject{
	
	Logger log = Logger.getLogger(RegistrationPage.class);
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	public void setEmailOrMobileNo(String mobileNo) {
		setData(emailOrMobileNoTextBoxBy, mobileNo);
		log.info("Setting Mobile No");
	}
	
	public void clickContinueBtn() {
		clickElement(continueBtnBy);
		log.info("Clicking Continue");
	}
	
	public void setOTP() {
		waitForVisibilityOfElementLocatable(driver, otpTextBoxBy);
		setData(otpTextBoxBy, "000000");
		log.info("Setting OTP");
	}
	
	public void clickVerifyBtn() {
		clickElement(verifyBtnBy);
		log.info("Clicking Verify");
	}
	
	public void setName(String fullName) {
		waitForVisibilityOfElementLocatable(driver, nameTextBoxBy);
		setData(nameTextBoxBy, fullName);
		log.info("Setting Name");
	}
	
	public void setPassword(String password) {
		setData(passwordTextBoxBy, password);
		log.info("Setting Password");
	}
	
	public void clickSaveAndContBtn() {
		clickElement(saveAndContBtnBy);
		log.info("Clicking Save and Continue");
	}
	
	
	
	//create new account
	public void createAccount(String mobileNo, String fullName, String password) throws MyException {
		try {
		setEmailOrMobileNo(mobileNo);
		clickContinueBtn();
//		setOTP();
		Thread.sleep(15000);
		clickVerifyBtn();
		setName(fullName);
		setPassword(password);
		clickSaveAndContBtn();
	} catch(Exception e) {
		throw new MyException(e.getMessage());
	}
	
	}
}

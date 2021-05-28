package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ILoginPageObject;


public class LoginPage extends BasePage implements ILoginPageObject{
	
	Logger log = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void setEmailOrMobileNo(String EmailOrMobNo) {
		setData(emailOrMobileNoTextBoxBy, EmailOrMobNo);
		log.info("Setting email id or mobile no");
	}

	public void clickContinueBtn() {
		clickElement(continueBtnBy);
		log.info("Clicking continue method");
	}

	public void setOTP(String otp) {
		waitForVisibilityOfElementLocatable(driver, otpTxtBoxBy);
		setData(otpTxtBoxBy, otp);
		log.info("Setting OTP");
	}

	public void clickLoginBtn() {
		clickElement(loginBtnBy);
		log.info("Clicking logging");
	}

	public void performLogin(String EmailOrMobNo, String otp) throws MyException {
		try {
			Thread.sleep(5000);
			setEmailOrMobileNo(EmailOrMobNo);
			clickContinueBtn();
			//setOTP(otp);
			Thread.sleep(20000);		
			clickContinueBtn();
		} catch (Exception e) {
			throw new MyException(e.getMessage());		
		}
	}
}

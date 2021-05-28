package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ITrainsReviewPageObject;

public class TrainsReviewPage extends BasePage implements ITrainsReviewPageObject{

	Logger log = Logger.getLogger(TrainsReviewPage.class);

	public TrainsReviewPage(WebDriver driver) {
		super(driver);
	}

	public void clickCancellationRadioBtn() {
//		waitForVisibilityOfElementLocatable(driver, cancellationRadioBtnBy);
		clickElement(cancellationRadioBtnBy);
		log.info("Clicking on radio button");
	}

	public void clickAddTraveller() {
		clickElement(addTravellerBy);
		log.info("Clicking Add Traveller");
	}

	public void setTravellerName(String fullName) {
		setData(travellerNameBy, fullName);
		log.info("Setting traveller name");
	}

	public void setTravellerAge(String age) {
		setData(travellerAgeBy, age);
		log.info("Setting traveller age");
	}

	public void clickGender() {
		clickElement(genderDropDownBy);
		log.info("Clicking gender drop down");
	}

	public void selectGender() {
		clickElement(genderMaleSelectionBy);
		log.info("Selecting male from gender drop down");
	}

	public void clickAdd() {
		clickElement(addBtnBy);
		log.info("Clicking add button");
	}

	public void toggleCheckBox() {
		clickElement(addTravellerCheckBoxBy);
		log.info("Toggle check box");
	}

	public void clickIrctcUserName() {
		clickElement(irctcUserNameBy);
		log.info("Clicking irctc user name");
	}

	public void setIrctcUserName(String irctcUserName) {
		setData(IRCTCUserNameBy, irctcUserName);
		log.info("setting irctc user name");
	}

	public void clickSubmitBtn() {
		clickElement(submitBtnBy);
		log.info("Clicking submit");
	}

	public void setMailId(String email) {
		setData(mailIdBy, email);
		log.info("Setting mail id");
	}

	public void setMobileNo(String mobileNo) {
		setData(mobileNoBy, mobileNo);
		log.info("Setting mobile no");
	}

	public void setAddress(String address) {
		setData(addressBy, address);
		log.info("Setting address");
	}

	public void setPincode(String pincode) {
		setData(pincodeBy, pincode);
		log.info("Setting pincode");
	}

	public void clickPayment() {
		clickElement(paymentBtnBy);
		log.info("Clickig payment");
	}

	public void setTravellerDetailsAndReview(String fullName, String age, String irctcUserName, 
											 String email, String mobileNo, String address,
											 String pincode) throws MyException {
		try {
			Thread.sleep(2000);
			clickCancellationRadioBtn();
			clickAddTraveller();
			setTravellerName(fullName);
			setTravellerAge(age);
			clickGender();
			selectGender();
			clickAdd();
			toggleCheckBox();
			Thread.sleep(2000);
			clickIrctcUserName();
			setIrctcUserName(irctcUserName);
			clickSubmitBtn();
			Thread.sleep(2000);
			setMailId(email);
			setMobileNo(mobileNo);
			setAddress(address);
			setPincode(pincode);
			Thread.sleep(2000);
			clickPayment();
		} catch(Exception e) {
			throw new MyException(e.getMessage());
		}
	}

}

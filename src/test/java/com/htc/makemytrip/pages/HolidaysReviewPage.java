package com.htc.makemytrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHolidaysReviewPage;

public class HolidaysReviewPage extends BasePage implements IHolidaysReviewPage{

	public HolidaysReviewPage(WebDriver driver) {
		super(driver);
	}	
	
	public void clickAdult1() {
		clickElement(adult1By);
	}
	
	public void clickAddNew1() {
		clickElement(adult1AddNewBy);
	}
	
	public void setAdult1FirstName(String adult1FirstName) {
		setData(adultFirstNameBy, adult1FirstName);
	}
	
	public void setAdult1LastName(String adult1LastName) {
		setData(adultlastNameBy, adult1LastName);
	}
	
	public void setAdult1DOB(String adult1Date) {
		String[] splittedDate = splitDateFromExcel(adult1Date);
		adult1DOBEntry(splittedDate[0], splittedDate[1]);
	}
	
	public void selectAdult1Gender() {
		clickElement(adultGenderBy);
		clickElement(adult1MaleBy);
	}
	
	public void clickSave() throws InterruptedException {
		clickElement(adultSaveBy);
		Thread.sleep(2000);
	}
	
	public void clickAdult2() {
		clickElement(adult2By);
	}
	
	public void clickAddNew2() {
		clickElement(adult2AddNewBy);
	}
	
	public void setAdult2FirstName(String adult2FirstName) {
		setData(adultFirstNameBy, adult2FirstName);
	}
	
	public void setAdult2LastName(String adult2LastName) {
		setData(adultlastNameBy, adult2LastName);
	}
	
	public void setAdult2DOB(String adult2Date) {
		String[] splittedDate = splitDateFromExcel(adult2Date);
		adult2DOBEntry(splittedDate[0], splittedDate[1]);
	}
	
	public void selectAdult2Gender() {
		clickElement(adultGenderBy);
		clickElement(adult2MaleBy);
	}
	
	public void setEmail(String email) {
		setData(emailBy, email);
	}
	
	public void setMobileNo(String mobileNo) {
		clickElement(mobileCodeBy);
		clickElement(indiaCodeBy);
		setData(mobileNoBy, mobileNo);
	}
	
	public void clickProceedToPayment() {
		clickElement(paymentBy);
	}
	
	
	public void setTravellerDetails(String adult1FirstName, String adult1LastName, String adult1Date,
									String adult2FirstName, String adult2LastName, String adult2Date,
									String email, String mobileNo)
									throws Exception {
		try {
		clickAdult1();
		clickAddNew1();
		setAdult1FirstName(adult1FirstName);
		setAdult1LastName(adult1LastName);
		setAdult1DOB(adult1Date);
		selectAdult1Gender();
		clickSave();
		clickAdult2();
		clickAddNew2();
		setAdult2FirstName(adult2FirstName);
		setAdult2LastName(adult2LastName);
		setAdult2DOB(adult2Date);
		selectAdult2Gender();
		clickSave();
		setEmail(email);
		setMobileNo(mobileNo);
		clickProceedToPayment();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	

}

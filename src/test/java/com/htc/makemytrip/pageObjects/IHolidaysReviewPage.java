package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IHolidaysReviewPage {
	
	By bookOnlineBy = By.id("bookMyPackage");
	By adult1By = By.xpath("(//div[@class='css-1hwfws3 react-select-review__value-container'])[1]");
	By adult2By = By.xpath("(//div[@class='css-1hwfws3 react-select-review__value-container'])[1]");
	By adult1AddNewBy = By.xpath("//div[@id='react-select-2-option-1']/p");
	By adult2AddNewBy = By.xpath("//div[@id='react-select-3-option-1']/p");
	By adultFirstNameBy = By.id("FIRST_NAME");
	By adultlastNameBy = By.id("LAST_NAME");
	By adultGenderBy = By.id("GENDER");
	By adult1MaleBy = By.id("react-select-8-option-0"); //adult1 male
	By adult1FemaleBy = By.id("react-select-8-option-0"); //adult1 female
	By adult2MaleBy = By.id("react-select-12-option-0"); //adult2 male
	By adultFemaleBy = By.id("react-select-12-option-1"); //adult2 female
	By adultSaveBy = By.id("submit");
	By emailBy = By.id("EMAIL");
	By mobileCodeBy = By.id("MOBILE_CODE");
	By indiaCodeBy = By.id("react-select-4-option-0");
	By mobileNoBy = By.id("MOBILE_NUMBER");
	By paymentBy = By.xpath("//a[text()='Proceed to Payments']");

}

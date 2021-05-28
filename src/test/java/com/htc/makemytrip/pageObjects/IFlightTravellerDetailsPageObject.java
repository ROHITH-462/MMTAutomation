package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IFlightTravellerDetailsPageObject {
	
	 By passenger1firstNameBy = By.xpath("(//input[@placeholder=\"First & Middle Name\"])[1]");
	 By passenger1lastNameBy = By.xpath("(//input[@placeholder=\"Last Name\"])[1]");
	 By passenger1GenderBy = By.xpath("(//label[@tabindex=\"0\"])[1]");
	 By passenger1DateBy = By.xpath("//div[text()='Date']");
	 By passenger1DOB_DateBy = By.id("react-select-5-option-22");
	 By passenger1MonthBy = By.xpath("//div[text()='Month']");
	 By passenger1DOB_MonthBy = By.id("react-select-6-option-3");
	 By passenger1YearBy = By.xpath("//div[text()='Year']");
	 By passenger1DOB_YearBy = By.id("react-select-7-option-12");
	 
//	 By passenger1DateBy = By.xpath("(//div[@class='dropdown__placeholder css-1wa3eu0-placeholder'])[3]");
//	 By passenger1MonthBy = By.xpath("(//div[contains(@class,'value css-1hwfws3')])[2]");
//	 By passenger1YearBy = By.xpath("(//div[contains(@class,'value css-1hwfws3')])[3]");
	
	 By addAdultBy = By.xpath("(//a[contains(@class, 'font14 Lato')])");
	
	 By passenger2firstNameBy = By.xpath("(//input[@placeholder=\"First & Middle Name\"])[2]");
	 By passenger2lastNameBy = By.xpath("(//input[@placeholder=\"Last Name\"])[2]");
	 By passenger2GenderBy = By.xpath("(//label[@tabindex=\"0\"])[2]");
	 
//	 By passenger2DateBy = By.xpath("(//div[contains(@class, 'dropdown__value-container css-1hwfws3')])[11]");
//	 By passenger2MonthBy = By.xpath("(//div[contains(@class, 'dropdown__value-container css-1hwfws3')])[12]");
//	 By passenger2YearBy = By.xpath("(//div[contains(@class, 'dropdown__value-container css-1hwfws3')])[13]");
	
	 By mobileNumberBy = By.xpath("//input[@placeholder=\"Mobile No\"]");
	 By emailIDBy = By.xpath("//input[@placeholder=\"Email\"]");
	 By continueBtnBy = By.xpath("//button[contains(@class, 'ack')]");
	 
	 By confirmBy = By.xpath("(//a[contains(@class,'fli_primary')])[3]");
	
}

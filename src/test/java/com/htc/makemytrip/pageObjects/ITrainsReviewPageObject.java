package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ITrainsReviewPageObject {
	
	By cancellationRadioBtnBy = By.xpath("(//label[@class='font14 blackText'])[2]");
	By addTravellerBy = By.xpath("//a[contains(@class,'makeFlex space')]");
	By travellerNameBy = By.id("name");
	By travellerAgeBy = By.id("age");
	By genderDropDownBy = By.xpath("(//span[contains(@class,'latoRegular font14 darkGreyText')])[3]");
	By genderMaleSelectionBy = By.xpath("//span[text()=\"Male\"]");
	By addBtnBy = By.xpath("//a[contains(@class,'blue')]");
	By addTravellerCheckBoxBy = By.xpath("//span[contains(@class,'checkBox')]");
	By irctcUserNameBy = By.id("irctcUserName");
	By IRCTCUserNameBy = By.id("IRCTCUserName");
	By submitBtnBy = By.xpath("//span[@class=\"font12 latoBlack capText\"]");
	By mailIdBy = By.id("contactEmail");
	By mobileNoBy = By.id("mobileNumber");
	By addressBy = By.id("address1");
	By pincodeBy = By.id("pincodeNo");
	By paymentBtnBy = By.xpath("//a[contains(@class,'paymentBtn')]");
			

}

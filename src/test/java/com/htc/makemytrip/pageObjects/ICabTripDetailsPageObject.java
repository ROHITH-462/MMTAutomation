package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ICabTripDetailsPageObject {
	
	By scrollUntilInclusionsBy = By.xpath("//span[text()='(Included in the Price) ']");
	By payBy = By.cssSelector(".cabPaymentCont");
	By pickUpAddressBy = By.cssSelector("input[placeholder='Enter exact pick-up address/nearby location / building name']");
	By pickUpAddressTextBy = By.cssSelector(".react-autosuggest__input");
	By pickAddressSuggestionBy = By.cssSelector("li[data-suggestion-index='0']");
	By travellerNameBy = By.cssSelector("input[placeholder='Enter your full name']");
	By travellerGenderBy = By.xpath("//span[text()='Male']");
	By travellerEmailBy = By.cssSelector("input[placeholder='Enter Email ID']");
	By travellerMobileNoBy = By.cssSelector("input[placeholder='Enter 10 digit mobile number']");
	
}

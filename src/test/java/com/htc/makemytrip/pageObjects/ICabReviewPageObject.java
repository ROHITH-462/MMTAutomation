package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ICabReviewPageObject {
	
	By pickUpAddressBy = By.xpath("//input[@placeholder=\"Enter exact pick-up address/nearby location / building name\"]");
	By pickUpAddressTxtBy = By.xpath("//input[@placeholder=\"Address\"]");
	By fullNameBy = By.xpath("//input[contains(@placeholder,\"full name\")]");
	By genderMaleBy = By.xpath("(//div[@class=\"radioUnchecked\"])[1]");
	By genderFemaleBy = By.xpath("(//div[@class=\"radioUnchecked\"])[2]");
	By emailIdBy = By.xpath("//input[contains(@placeholder,'mail')]");
	By mobileNoBy = By.xpath("//input[contains(@placeholder,'10 digit mobile')]");
	By payBy = By.xpath("//a[contains(@class,'blue')]");

}

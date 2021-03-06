package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ICabBookingPageObject {

	By carModelBy = By.xpath("//label[text()='Swift Dzire']");
	By viewPricesBy = By.xpath("//span[text()='VIEW PRICES']");
	By bookNowBy = By.xpath("//span[text()='BOOK NOW']");
	
	By selectCabBy = By.xpath("(//div[contains(@class,'cabListing')])[1]");
	By bookBy = By.xpath("(//span[@class=\"bookButton\"])[1]");
	
	By covidSafetyCheckBoxBy = By.xpath("//span[contains(@class,'font16 black')]");
	By covidSafetyContinueBy = By.xpath("//button[contains(@class,'tncBtn')]");
	
			
}

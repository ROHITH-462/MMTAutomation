package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IFlightHomePageObject {
	
	By fromCityBy = By.id("fromCity");
	By fromCityTextBoxBy = By.xpath("//input[@placeholder=\"From\"]");
	By selectFromSuggestionBy = By.xpath("//p[text()='Chennai, India']");
	By toCityBy = By.id("toCity");
	By toCityTextBoxBy = By.xpath("//input[@placeholder=\"To\"]");
	By selectToSuggestionBy = By.xpath("(//p[text()='Rome, Italy'])[1]");
	By departureDateBy = By.xpath("//div[@class=\"fsw_inputBox dates inactiveWidget \"]");
	By selectTravellersBy = By.xpath("//div[@class=\"fsw_inputBox flightTravllers inactiveWidget \"]");
	By travellersApplyBtnBy = By.xpath("//button[@data-cy='travellerApplyBtn']");
	By searchBtnBy = By.xpath("//a[contains(@class,\"primaryBtn\")]");

}

package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ITrainsHomePageObject {
	
	By pnrRadioButton = By.xpath("//span[@data-cy=\"checkPnrStatus\"]");
	By fromCityBy = By.id("fromCity");
	By fromCityTextBoxBy = By.xpath("//input[@placeholder=\"From\"]");
	By selectFromSuggestionBy = By.xpath("//span[text()='MAS']");
	By toCityBy = By.id("toCity");
	By toCityTextBoxBy = By.xpath("//input[@placeholder=\"To\"]");
	By selectToSuggestionBy = By.xpath("//span[text()='TPTY']");
	By travelDateBy = By.id("travelDate");
	By classBy = By.id("travelFor");
	By classTypeBy = By.xpath("//li[@data-cy=\"2S\"]");
	By searchBtnBy = By.xpath("//a[@data-cy=\"submit\"]");

}

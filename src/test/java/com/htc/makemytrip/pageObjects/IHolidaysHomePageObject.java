package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IHolidaysHomePageObject {

	By fromCityBy = By.id("fromCity");
	By fromCityTxtBoxBy = By.xpath("//input[@placeholder=\"From\"]");
	By fromCitySuggestionBy = By.xpath("//li[@data-suggestion-index=\"0\"]");
	By toCityBy = By.id("toCity");
	By toCityTxtBoxBy = By.xpath("//input[@placeholder=\"To\"]");
	By toCitySuggestionBy = By.xpath("//li[@data-suggestion-index=\"0\"]");
	By searchBtnBy = By.xpath("//button[@data-cy=\"submit\"]");
}

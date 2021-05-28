package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ICabHomePageObject {
	
	By roundTripBy = By.xpath("//li[@data-cy='outstationRoundTrip']");
	By fromCityBy = By.id("fromCity");
	By fromCityTxtBoxBy = By.xpath("//input[@placeholder=\"From\"]");
	By fromCitySuggestionBy = By.xpath("//li[@data-suggestion-index=\"0\"]");
	By toCityBy = By.id("toCity");
	By toCityTxtBoxBy = By.xpath("//input[@placeholder=\"To\"]");
	By toCitySuggestionBy = By.xpath("//li[@data-suggestion-index=\"0\"]");
	By departureDateBy = By.id("departure");
	By returnDateBy = By.id("return");
	By pickUpTimeBy = By.xpath("//ul[@class='timeDropDown blackText']");
	By setPickUpTimeBy = By.xpath("(//li[text()=\"07:00\"])[1]");
	By dropTimeBy = By.cssSelector("label[for='dropTime']");
	By setDropTimeBy = By.xpath("(//li[text()=\"09:00\"])[2]");
	By searchBy = By.xpath("//a[text()='Search']");
}

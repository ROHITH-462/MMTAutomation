package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IIndexPageObject {

	By makemyTripBy = By.xpath("//a[@data-cy='mmtLogo']");
	By loginOrCreateAccBtnBy = By.xpath("//li[@data-cy=\"account\"]");
	By loginOrCreatePopUpBy = By.xpath("//p[contains(@class,'login')]");
	By flightsBtnBy = By.xpath("//li[@data-cy='menu_Flights']");
	By hotelsBtnBy = By.xpath("//li[@class =\"menu_Hotels\"]");
	By villasBtnBy = By.xpath("//li[@class =\"menu_Villasmore\"]");
	By holidaysBtnBy = By.xpath("//li[@class =\"menu_Holidays\"]");
	By trainsBtnBy = By.cssSelector("li[data-cy='menu_Trains']");
	By busesBtnBy = By.xpath("//li[@class =\"menu_Buses\"]");
	By visaBtnBy = By.xpath("//li[@class =\"menu_Visa\"]");
	By cabsBtnBy = By.xpath("//li[@class =\"menu_Cabs\"]");
	By makeAPaymentBy = By.xpath("//a[text()='Make A Payment']");
	By aboutThisSiteBy = By.xpath("//a[text()='CSR Policy']");
	By logoutBy = By.xpath("//a[@data-cy='userMenuLogout']");
}

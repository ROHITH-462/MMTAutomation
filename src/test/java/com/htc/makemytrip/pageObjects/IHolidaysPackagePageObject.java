package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IHolidaysPackagePageObject {
	
	By nextBy = By.xpath("//a[text()='Next']");
	By gotItBy = By.xpath("//a[text()='GOT IT']");
	By duringDateBy = By.cssSelector("#departure_date");
	By searchBtnBy = By.xpath("//button[contains(@class,'primary')]");
	By bestSellingTxt = By.xpath("(//h2[contains(@class,'font32')])[1]");
	By holidayPackageBy = By.xpath("//h3[text()=\"Kerala Couple Special with Houseboat\"]");
	By newPackageSelectionBy = By.cssSelector("div[id='28421']");
	

}

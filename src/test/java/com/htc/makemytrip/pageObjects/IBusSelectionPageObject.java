package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IBusSelectionPageObject {
	
	By jabbarTravelsTxtBy = By.xpath("(//span[text()='Jabbar  Travels'])[3]");
	By selectSeatsBtnBy = By.xpath("(//a[@data-test-id='select-seats'])[5]");
	By pickUpPointBy = By.xpath("//span[text()='SIPCOT Siruseri']");
	By dropPointBy = By.xpath("(//span[text()='Electronic City'])[2]");
	By selectSeatBy = By.xpath("(//img[@class=\"seat-icon\"])[8]");
	By bookSeatBtnBy = By.xpath("//div[contains(@class,'cta')]");
}

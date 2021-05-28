package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IFlightSelectionPageObject {
	
	By alliancesAndAirlinesBy = By.xpath("//p[text()='Alliances & Airlines']");
	By spiceJetTxtBy = By.xpath("//span[text()='21:05']");
	By lateDepartureBy = By.xpath("//span[text()='Late Departures']");
//	By bookNowBtnBy = By.xpath("//button[@id='bookbutton-RKEY:f2c3a384-424a-43f6-a6e7-308cbf1ad197:6_0");
	By bookNowBtnBy = By.xpath("(//button[text()='Book Now'])[1]");
	By spicejetCheckBoxBy = By.xpath("//span[text()='Spicejet']");
}

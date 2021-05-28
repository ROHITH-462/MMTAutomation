package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ITrainsPNRPageObject {
	
	By pnrTxtBox = By.id("pnr");
	By checkStatusBtn = By.xpath("//a[@data-cy=\"checkStatusButton\"]");
	By assertTxt = By.xpath("//a[text()='TRY DIFFERENT PNR']");

}

package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.pageObjects.ITrainsPNRPageObject;

public class TrainsPNRPage  extends BasePage implements ITrainsPNRPageObject{

	Logger log = Logger.getLogger(TrainsPNRPage.class);
	
	public TrainsPNRPage(WebDriver driver) {
		super(driver);
	}
	
	public void setPnr(String pnr) {
		setData(pnrTxtBox, pnr);
		log.info("PNR No entered");
	}
	
	public void clickCheckStatus() {
		clickElement(checkStatusBtn);
		log.info("Check button is clicked");
	}
	
	public String assertPnr() {
		return driver.findElement(assertTxt).getText();
	}

}

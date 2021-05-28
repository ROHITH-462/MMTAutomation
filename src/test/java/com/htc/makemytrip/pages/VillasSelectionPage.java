package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IVillasSelectionPageObject;

public class VillasSelectionPage extends BasePage implements IVillasSelectionPageObject {

	Logger log = Logger.getLogger(VillasSelectionPage.class);
	
	public VillasSelectionPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectResort() {
		clickElement(resortSelectionBy);
		log.info("Selecting Resort");
	}
	
	public void switchingTheDriver() {
		switchtoNewTab(driver);
		log.info("Switching driver to new tab");
		
	}
	
	public void selectVilla() throws MyException {
		try {
			selectResort();
			switchingTheDriver();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	
	

}

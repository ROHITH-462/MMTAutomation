package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.exception.VillaNotAvailableException;
import com.htc.makemytrip.pageObjects.IVillasSelectionPageObject;

public class VillasSelectionPage extends BasePage implements IVillasSelectionPageObject {

	Logger log = Logger.getLogger(VillasSelectionPage.class);

	public VillasSelectionPage(WebDriver driver) {
		super(driver);
	}

	public void selectResort(String villaName) throws VillaNotAvailableException {
		try {
			Thread.sleep(4000);
			chooseResort(villaName);
			log.info("Selecting Resort");
		}catch (Exception e) {
			throw new VillaNotAvailableException("Villa Not Available " + e.getMessage());
		}

	}

	public void switchingTheDriver() {
		switchtoNewTab(driver);
		log.info("Switching driver to new tab");

	}

	public void selectVilla(String villaName) throws MyException {
		try {
			selectResort(villaName);
			switchingTheDriver();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}



}

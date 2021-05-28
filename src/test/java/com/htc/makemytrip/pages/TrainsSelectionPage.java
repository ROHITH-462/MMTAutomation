package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.ITrainsSelectionPageObject;

public class TrainsSelectionPage extends BasePage implements ITrainsSelectionPageObject{

	Logger log = Logger.getLogger(TrainsSelectionPage.class);

	public TrainsSelectionPage(WebDriver driver) {
		super(driver);
	}

	public void clickToUpdate() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(selectTrainBy);
		log.info("Clicking update");		
	}

	public void selectClass() {
		clickElement(selectTrainBy);
		log.info("Clicking again update");
	}

	public void selectTrain() throws MyException {
		try {
			clickToUpdate();
			Thread.sleep(3000);
//			selectClass();
		} catch(Exception e) {
			throw new MyException(e.getMessage());
		}

	}
}

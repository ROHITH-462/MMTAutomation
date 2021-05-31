package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.exception.TrainNotAvailableException;
import com.htc.makemytrip.pageObjects.ITrainsSelectionPageObject;

public class TrainsSelectionPage extends BasePage implements ITrainsSelectionPageObject{

	Logger log = Logger.getLogger(TrainsSelectionPage.class);

	public TrainsSelectionPage(WebDriver driver) {
		super(driver);
	}

	public void trainSelection(String trainNo) throws Exception {
		try {
		selectingTrain(trainNo);
		Thread.sleep(3000);
		log.info("Clicking update");
		} catch (Exception e) {
			throw new TrainNotAvailableException("Train Not Available " + e.getMessage());
		}
	}

	public void selectClass() {
		clickElement(selectTrainBy);
		log.info("Clicking again update");
	}

	public void selectTrain(String trainNo) throws MyException {
		try {
			trainSelection(trainNo);
//			selectClass();
		} catch(Exception e) {
			throw new MyException(e.getMessage());
		}

	}
}

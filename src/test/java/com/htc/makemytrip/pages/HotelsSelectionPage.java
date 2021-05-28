package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHotelsSelectionPageObject;

public class HotelsSelectionPage extends BasePage implements IHotelsSelectionPageObject{
	
	Logger log = Logger.getLogger(HotelsSelectionPage.class);
	
	public HotelsSelectionPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickHotel() {
		clickElement(hotelsSelectionBy);
		log.info("Clicking hotel");
	}
	
	public void switchingToNewTab() throws InterruptedException {
		switchtoNewTab(driver);
		Thread.sleep(5000);
		log.info("Switching driver to another tab");
	}
	
	public void clickBookThisNow() {
		clickElement(bookThisNowBy);
		log.info("Clicking book this now");
	}
	
	public void selectHotel() throws MyException {
		try {
		clickHotel();
		switchingToNewTab();
		clickBookThisNow();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
}
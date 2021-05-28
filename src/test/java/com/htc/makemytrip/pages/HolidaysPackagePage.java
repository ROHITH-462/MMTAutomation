package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IHolidaysPackagePageObject;

public class HolidaysPackagePage extends BasePage implements IHolidaysPackagePageObject{

	Logger log = Logger.getLogger(HolidaysPackagePage.class);
	
	public HolidaysPackagePage(WebDriver driver) {
		super(driver);
	}
	
	public void handlePopUps() {
		clickElement(nextBy);
		clickElement(nextBy);
		clickElement(gotItBy);
	}
	
	public void clickDate() {
		clickElement(duringDateBy);
		log.info("Clicking date");
	}
	
	public void setDate(String date) {
		String[] splittedDate = splitDateFromExcel(date);
		dateSelection(splittedDate[0], splittedDate[1], splittedDate[2]);
		log.info("Setting date");
	}
	
	public void clickSearch() throws InterruptedException {
		clickElement(searchBtnBy);
		log.info("Clicking search");
		Thread.sleep(5000);
	}
	
	public void scrollUntilBestSellingTxt() {
		scrollToVisibleElement(bestSellingTxt, driver);
		log.info("Scrolling Till Best Selling Pack");
	}
	
	public void clickPackage() {
		clickElement(holidayPackageBy);
		log.info("Clicking package");
	}
	
	public void newPackage() {
		clickElement(newPackageSelectionBy);
		log.info("Package selected");
	}
	
	public void switchingDriver() throws InterruptedException {
		switchtoNewTab(driver);
		log.info("Switching driver to new tab");
		Thread.sleep(7000);
	}
	
	public void packageSelection(String date) throws Exception {
		try {
		clickDate();
		setDate(date);
		clickSearch();
		scrollUntilBestSellingTxt();
		clickPackage();
		switchingDriver();
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}
	
	
	

}

package com.htc.makemytrip.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pageObjects.IFlightReviewPageObject;

public class FlightReviewPage extends BasePage implements IFlightReviewPageObject{

	Logger log = Logger.getLogger(FlightReviewPage.class);

	public FlightReviewPage(WebDriver driver) {
		super(driver);
	}

	public void scrollUntilPaymentOption() {
		waitForVisibilityOfElementLocatable(driver, paymentOptionTxtBy);
		scrollToVisibleElement(paymentOptionTxtBy, driver);
		log.info("Scrolling Until Payment Option");		
	}

	public void scrollUntilAddOn() {
		scrollToVisibleElement(addOnTxtBy, driver);
		log.info("Scrolling Until Add On Text");
	}

	public void scrollUntilTravelInsurance() {
		scrollToVisibleElement(travelInsuranceTxtBy, driver);
		log.info("Scrolling Until Travel Insurance");
	}

	public void selectRadioBtn() {
		clickElement(noRadioBtnBy);
		log.info("Selectiong Radio Button");
	}

	public void scrollUntilContinueBtn() {
		scrollToVisibleElement(thankYouTxtBy, driver);
		log.info("Scrolling Until Continue");
	}

	public void clickContinueBtn() throws Exception {

		try {
			Thread.sleep(10000);
			clickElement(continueBtnBy);
			log.info("Clicking Continue");
		}catch (Exception e) {
			throw new MyException(e.getMessage());
		}
	}

	public void reviewFlightDetails() throws Exception {
		try {
			scrollUntilPaymentOption();
			scrollUntilAddOn();
			scrollUntilTravelInsurance();
			selectRadioBtn();
			scrollUntilContinueBtn();
			clickContinueBtn();
		}catch (Exception e) {
			throw new MyException("Review Flight Details Has Been Failed " + e.getMessage());
		}
	}





}

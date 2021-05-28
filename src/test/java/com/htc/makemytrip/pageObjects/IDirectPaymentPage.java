package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IDirectPaymentPage {
	
	By bookingIdBy = By.cssSelector("input[name='bookingId']");
	By mobileNoBy = By.cssSelector("input[name='phone']");
	By submitBy = By.cssSelector("button[type='submit']");
	By assertTxtBy = By.xpath("//p[text()='Please enter a valid Booking ID or Mobile No']");

}

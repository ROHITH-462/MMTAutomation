package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IFlightSeatSelectionPageObject {
	
	By okayBy = By.xpath("//a[text()='OKAY']");
	By flight1Psg1SeatBy = By.xpath("(//div[@class='seat_block cursor_pointer'])[36]");
	By flight1Psg2SeatBy = By.xpath("(//div[@class='seat_block cursor_pointer'])[37]");
	By nextBy = By.xpath("//a[text()='Next']");
	By flight2Psg1SeatBy = By.xpath("(//div[@class='seat_block cursor_pointer'])[36]");
	By flight2Psg2SeatBy = By.xpath("(//div[@class='seat_block cursor_pointer'])[37]");
//	By flight2NextBy = By.xpath("//a[text()='Next']");
	By continueToPayBy = By.xpath("//a[text()='CONTINUE TO PAY']");
}

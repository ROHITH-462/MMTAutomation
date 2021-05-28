package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IVillasReviewPageObject {
	
	By guestDetailsBy = By.xpath("(//span[@class=\"capText\"])[2]");
	By firstNameBy = By.id("fName");
	By lastNameBy = By.id("lName");
	By emailIdBy = By.id("email");
	By phoneNoBy = By.id("mNo");
	By reserveNowBy = By.xpath("//a[contains(@class, 'btnC')]");

}

package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IHotelsReviewPageObject {

	By guestDetailsTxtBy = By.xpath("(//span[@class=\"capText\"])[2]");
	By firstNameBy = By.id("fName");
	By lastNameBy = By.id("lName");
	By emailIdBy = By.id("email");
	By mobileNoBy = By.id("mNo");
	By payNowBy = By.xpath("//a[contains(@class,'btnC')]");
}

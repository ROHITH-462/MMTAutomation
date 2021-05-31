package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IHotelsHomePageObject {
	
	 By cityBy = By.id("city");
	 By cityTxtBoxBy = By.xpath("//input[@placeholder=\"Enter city/ Hotel/ Area/ Building\"]");
	 By citySuggesstionBy = By.cssSelector("li[data-suggestion-index='0']");
	 By checkInDateBy = By.id("checkin");
	 By checkOutDateBy = By.id("checkout");
	 By roomsAndGuestsBy = By.id("guest");
	 By applyBtnBy = By.xpath("//button[@data-cy=\"submitGuest\"]");
	 By searchBtnBy = By.id("hsw_search_button");

}

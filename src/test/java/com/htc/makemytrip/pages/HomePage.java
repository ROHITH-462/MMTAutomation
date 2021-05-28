package com.htc.makemytrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.pageObjects.IHomePageObject;

public class HomePage extends BasePage implements IHomePageObject {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String userName() {
		waitForVisibilityOfElementLocatable(driver, userNameBy);
//		return driver.findElement(userNameBy).getText();
		return getText(userNameBy);
	}

}

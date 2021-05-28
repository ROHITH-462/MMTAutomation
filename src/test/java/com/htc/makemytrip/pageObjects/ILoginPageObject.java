package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface ILoginPageObject {

	By emailOrMobileNoTextBoxBy = By.id("username");
	By continueBtnBy = By.xpath("//div[@class=\"btnContainer appendBottom25 \"]");
	By otpTxtBoxBy = By.id("otp");
	By loginBtnBy = By.xpath("//button[@data-cy=\"login\"]");
}

package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IRegistrationPageObject {


	By emailOrMobileNoTextBoxBy = By.id("username");
	By continueBtnBy = By.xpath("//div[@class=\"btnContainer appendBottom25 \"]");
	By otpTextBoxBy = By.id("otp");
	By verifyBtnBy = By.xpath("//div[@class=\"btnContainer appendBottom25 \"]");
	By nameTextBoxBy = By.id("firstName");
	By passwordTextBoxBy = By.id("password");
	By saveAndContBtnBy = By.xpath("//button[@type=\"submit\"]");
	By userNameBy = By.xpath("//p[@data-cy=\"loggedInUser\"]");



}

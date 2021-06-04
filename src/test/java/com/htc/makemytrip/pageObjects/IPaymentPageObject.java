package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IPaymentPageObject {
	
	By paymentOptionsBy = By.xpath("//span[text()='Payment options']");
	By otherPaymentBy = By.xpath("//span[text()='Other Payment options']");
}

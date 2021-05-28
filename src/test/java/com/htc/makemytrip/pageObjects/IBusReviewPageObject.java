package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IBusReviewPageObject {
	
	By nameBy = By.id("fname");
	By ageBy = By.id("age");
	By genderBy = By.xpath("//span[contains(@class,'blackArrow')]");
	By selectMaleBy = By.xpath("//li[text()=\"Male\"]");
	By selectFemaleBy = By.xpath("//li[text()=\"Female\"]");
	By emailIdBy = By.id("contactEmail");
	By mobileNoBy = By.id("mobileNumber");
	By tripInsuranceNoBy = By.xpath("(//span[@class='appendRight10'])[2]");			
	By bookNowBy = By.xpath("//a[contains(@class,'payment')]");
	

}

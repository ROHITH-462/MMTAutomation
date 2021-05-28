package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IFlightReviewPageObject {
	By hotelsBy = By.xpath("//li[@data-cy='menu_Hotels']");			
	By paymentOptionTxtBy = By.xpath("//p[text()='Payment Options']");
	By addOnTxtBy = By.xpath("(//p[contains(@class,'rvw')])[2]");
	By travelInsuranceTxtBy = By.cssSelector("div[class='impInfo-banner']");//scrolling purpose
	By noRadioBtnBy = By.cssSelector("span[class='labeltext block paddL30']");
	By thankYouTxtBy = By.xpath("(//span[contains(@class,'blackTxt')])[2]");//scrolling purpose
	By continueBtnBy = By.xpath("//button[@id=\"review-continue\"]");
}

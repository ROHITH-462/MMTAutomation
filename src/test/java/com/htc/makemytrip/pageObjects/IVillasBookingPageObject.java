package com.htc.makemytrip.pageObjects;

import org.openqa.selenium.By;

public interface IVillasBookingPageObject {
	
	By viewThisComboBy = By.id("detpg_multi_view_combo");
	By bookThisComboBy = By.cssSelector("#detpg_book_combo_btn");
	By bookThisNowBy = By.xpath("//a[text()='BOOK THIS NOW']");
}

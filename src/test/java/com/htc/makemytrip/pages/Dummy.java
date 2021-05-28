package com.htc.makemytrip.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.htc.makemytrip.propertyfileloader.PropertyFileLoader;

public class Dummy {
	
	public static void main(String args[]) throws IOException {
		
//		WebDriver driver;
//		
//		PropertyFileLoader pfl = PropertyFileLoader.getInstance();
//		System.setProperty("webdriver.chrome.driver", pfl.chromeDriver);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.makemytrip.com/flight/traveller/?itineraryId=c36097a22052ed54dbd8eecf8862c175f032fa31&crId=27f6918f-2cb6-44f5-bd98-d0690c1b68da&cur=INR");
//		
//		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']"));
//		firstName.sendKeys("Rohith");
//		
//		
//		WebElement date = driver.findElement(By.xpath("//div[text()='Date']"));
//		date.sendKeys("23");
		

			String dateFromExcel = "14/June/2021";
			String[] split = dateFromExcel.split("/");
			System.out.println("Date = " +split[0]);
			System.out.println("Month = "+split[1]);
			System.out.println("Year = "+split[2]);
		
	}

}

package com.htc.makemytrip.pages;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.htc.makemytrip.base.BasePage;
import com.htc.makemytrip.propertyfileloader.PropertyFileLoader;

public class Date extends BasePage{
	
	

	public Date(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws InterruptedException, IOException {
		
		WebDriver driver;
		
		PropertyFileLoader pfl = PropertyFileLoader.getInstance();
		
		System.setProperty("webdriver.chrome.driver", pfl.chromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/cabs/");
		
//		String actualDate = "2021-12-14";
//		
//		LocalDate currentDate = LocalDate.parse(actualDate);
//		 int day = currentDate.getDayOfMonth();
//		 Month month = currentDate.getMonth();
//		 int year = currentDate.getYear();
//		 
//		 
//		 String MMMM = month.getDisplayName(TextStyle.FULL, Locale.UK);
//		 
//		 System.out.println(MMMM);
//		 
//		 System.out.println("date " + day + "month +" + month + "year " + year);
		
		//--------------------------------------------------------------------------------------------------
		
		
//		driver.findElement(By.cssSelector(".menu_Cabs")).click();
		
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
		
		driver.findElement(By.cssSelector("#fromCity")).click();
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu, India']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Puttur Andhra");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Puttur, Andhra Pradesh, India']")).click();
		
		String monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
		System.out.println(monthYearVal);
		
		//Departure_Date
		while(!(monthYearVal.equals("June2021"))) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
			System.out.println(monthYearVal);
		}
		driver.findElement(By.xpath("(//div[text()=14])[1]")).click();
		
		//Return_Date
		while(!(monthYearVal.equals("June2021"))) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
			System.out.println(monthYearVal);
		}
		driver.findElement(By.xpath("(//div[text()=17])[1]")).click();
		
		
//		List<WebElement> options = driver.findElements(By.tagName("li"));
//		for(WebElement option : options ) {
//			if(option.getText().equals("07:00"))
//				option.click();
//				break;
//		}
		
		driver.findElement(By.xpath("//li[text()='10:00'][1]")).click();
//		driver.findElement(By.xpath("//li[text()='07:00'][1]")).click();
		
		driver.findElement(By.id("dropTime")).click();
		driver.findElement(By.xpath("//li[text()='09:00'][2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();	
		
		
		//----------------------------------------------------------------------------------------------------
		
//		String date = "24";
//		String month = "11";
//		
//		
//		driver.findElement(By.cssSelector("input[placeholder='First & Middle Name']")).sendKeys("Rohith");
//		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("B");
//		driver.findElement(By.cssSelector("label[tabindex='0']")).click();
//		
////		driver.findElement(By.cssSelector("div.dropdown__control.dropdown__control--is-focused.dropdown__control--menu-is-open.css-1pahdxg-control > div.dropdown__indicators.css-1wy0on6 > div.dropdown__indicator.dropdown__dropdown-indicator.css-1eew81i > svg.css-19bqh2r")).click(); //Clicking Date
//		driver.findElement(By.xpath("//div[text()='Date']")).click();
////		driver.findElement(By.id("react-select-5-option-26"));
//		driver.findElement(By.id("react-select-5-option-"+date+"")).click(); //Date-23
//		
////		driver.findElement(By.cssSelector("div.dropdown__control.dropdown__control--is-focused.dropdown__control--menu-is-open.css-1pahdxg-control > div.dropdown__indicators.css-1wy0on6 > div.dropdown__indicator.dropdown__dropdown-indicator.css-1eew81i > svg.css-19bqh2r")).click(); //Clicking Month
//		driver.findElement(By.xpath("//div[text()='Month']")).click();
//		driver.findElement(By.id("react-select-6-option-"+month+"")).click(); //Month
//		
////		driver.findElement(By.cssSelector("div.dropdown__control.dropdown__control--is-focused.dropdown__control--menu-is-open.css-1pahdxg-control > div.dropdown__indicators.css-1wy0on6 > div.dropdown__indicator.dropdown__dropdown-indicator.css-1eew81i > svg.css-19bqh2r")).click(); //Clicking Year
//		driver.findElement(By.xpath("//div[text()='Year']")).click();
//		driver.findElement(By.id("react-select-7-option-12")).click();
//		
//		driver.findElement(By.xpath("//a[text()='+ ADD ADULT']")).click();
//		
//		driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[2]")).sendKeys("Rohith");
//		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[2]")).sendKeys("B");
//		driver.findElement(By.xpath("(//label[@tabindex='0'])[2]")).click();
//		
//		driver.findElement(By.xpath("(//div[text()='Date'])[1]")).click();
//		driver.findElement(By.id("react-select-11-option-13")).click(); //date-14
//		
//		driver.findElement(By.xpath("(//div[text()='Month'])[1]")).click();
//		driver.findElement(By.id("react-select-12-option-5")).click();//month
//		
//		driver.findElement(By.xpath("(//div[text()='Year'])[1]")).click();
//		driver.findElement(By.id("react-select-13-option-11")).click();//year
//		
//		
//		
		
		
		
		
	}

}

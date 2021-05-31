package com.htc.makemytrip.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.htc.makemytrip.exception.FlightNotAvailableException;
import com.htc.makemytrip.propertyfileloader.GlobalVars;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;


	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, GlobalVars.explicitWaitTime);
	}
	
	//---------------------------------HANDLE ALERT--------------------------------------------------


	public void handleAlert() {
		driver.switchTo().alert().accept();
	}	
	
	//----------------------CLICK OPERATION---------------------------
	public void clickElement(By webElement) {
		driver.findElement(webElement).click();
	}


	//----------------------SENDDATA OPERATION--------------------------
	public void setData(By webElement, String value) {
		driver.findElement(webElement).sendKeys(value);
	}

	//-------------------------SELECT OPERATION--------------------------
	public void selectFromList(By webElement, String value) {
		Select select = new Select(driver.findElement(webElement));
		//		select.selectByIndex(value);
		select.selectByVisibleText(value);
	}


	//----------------------GET TEXT------------------------------------
	public String getText(By webElement) {
		return driver.findElement(webElement).getText();
	}


	//----------------------SCROLL OPERATION--------------------------
	public void scrollToVisibleElement(By scrollLink, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(scrollLink));
	}


	//----------------SPLITTING MONTH AND YEAR--------------------------
	public String[] splitMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	
	//----------------SPLITTING DATE FROM EXCEL----------------------------
	public String[] splitDateFromExcel(String dateFromExcel) {
		return dateFromExcel.split("/");
	}

	
	//-----------------------SELECTING DATE (FLIGHT)----------------------------------
	public void selectDate(String date, String month, String year) {
		String monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
//		System.out.println(monthYearVal);	

		while(!(splitMonthYear(monthYearVal)[0].equals(month) && splitMonthYear(monthYearVal)[1].equals(year))) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
//			System.out.println(monthYearVal);
		}
		driver.findElement(By.xpath("(//p[text()="+date+"])[1]")).click();		
	}


	//------------------SELECTING DATE FOR BUSES, HOLIDAYS AND TRAINS ()------------------------------------

	public void dateSelection(String date, String month, String year) {
		String monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
		System.out.println(monthYearVal);

		while(!(splitMonthYear(monthYearVal)[0].equals(month) && splitMonthYear(monthYearVal)[1].equals(year))) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
			System.out.println(monthYearVal);
		}
		driver.findElement(By.xpath("(//div[text()="+date+"])[1]")).click();		
	}


	//----------------------SELECTING DATE(WITHOUT SPACE)(CABS)-----------------------------
	public void dateSelection(String date, String monthYear) {
		String monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
//		System.out.println(monthYearVal);

		while(!(monthYearVal.equals(monthYear))) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			monthYearVal = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
//			System.out.println(monthYearVal);
		}
		driver.findElement(By.xpath("(//div[text()="+date+"])[1]")).click();
	}
	
	
	//-----------------------PICKUP TIME AND DROPDOWN TIME(CABS)----------------------------------
	
	public void setPickUpTimeCab(String timeValue) {
		driver.findElement(By.xpath("(//li[text()=\""+timeValue+"\"])[1]"));
	}
	
	public void setDropDownTimeCab(String timeValue) {
		driver.findElement(By.xpath("(//li[text()=\""+timeValue+"\"])[2]"));
	}
	
	
	//---------------------------SELECTING TRAIN---------------------------------------------
	
	public void selectingTrain(String trainNo) {
		driver.findElement(By.xpath("(//div[text()="+trainNo+"]/ancestor::div[@class='single-train-detail']/descendant::div[@class='card'])[2]")).click();
	}
	
	//-----------------------------SELECTING HOTEL--------------------------------------------
	
	public void selectingHotel(String hotelName) {
		driver.findElement(By.xpath("//span[contains(text(),\""+hotelName+"\")]")).click();
	}
	
	//---------------------------SELECTING VILLA---------------------------------------------
	
	public void chooseResort(String villaName) {
		driver.findElement(By.xpath("//span[text()=\""+villaName+"\"]")).click();
	}
	
	//-----------------------------SELECTING BUS---------------------------------------------
	
	public void chooseBus(String travelsName, String travelTime) {
		driver.findElement(By.xpath("//span[contains(text(),\""+travelsName+"\")]/ancestor::div[@class='makeFlex']/descendant::span[contains(text(),\""+travelTime+"\")]/ancestor::div[@class='makeFlex']/descendant::a[contains(text(),'Seats')]")).click();
	}
	
	
	//--------------------------------SELECT CAB MODEL(CABS)-------------------------------------------------
	
	public void selectCabModel(String carName) {
		driver.findElement(By.xpath("//label[text()=\""+carName+"\"]")).click();
	}

	//---------------------------SELECTING CLASS TYPE(TRAIN)-------------------------------------------
	
	public void selectClass(String classType) {
		driver.findElement(By.xpath("//li[text()=\""+classType+"\"]")).click();
	}
	
	//-----------------SELECTING NO:OF:PASSENGERS AND CLASS(FLIGHT)---------------------------------
	public void selectTravellers_Class(String adult, String child, String infant, String classType) {
		driver.findElement(By.xpath("//li[@data-cy=\"adults-"+adult+"\"]")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"children-"+child+"\"]")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"infants-"+infant+"\"]")).click();
		driver.findElement(By.xpath("//li[text()=\""+classType+"\"]")).click();
	}

	// CLASS_TYPES

	// Economy/Premium Economy
	// Premium Economy
	// Business


	//------------------------------SELECTING AIRLINES---------------------------------------

	public void selectAirline(String value) throws Exception {
		try {
			driver.findElement(By.xpath("//span[text()=\""+value+"\"]")).click();
		}catch (Exception e) {
			throw new FlightNotAvailableException("Flight Not Available " + e.getMessage());
		}
	}	
	
	
	//--------------------------------PASSENGER1 DOB ENTRY(FLIGHT)-----------------------------------------

	public void passenger1DOBEntry(String date, String month) {
		driver.findElement(By.xpath("//div[text()='Date']")).click();
		driver.findElement(By.id("react-select-5-option-"+date+"")).click();
		
		driver.findElement(By.xpath("//div[text()='Month']")).click();
		driver.findElement(By.id("react-select-6-option-"+month+"")).click();
		
		driver.findElement(By.xpath("//div[text()='Year']")).click();
		driver.findElement(By.id("react-select-7-option-12")).click();
	}
	
	//--------------------------------PASSENGER2 DOB ENTRY(FLIGHT)-----------------------------------------

		public void passenger2DOBEntry(String date, String month) {
			driver.findElement(By.xpath("//div[text()='Date']")).click();
			driver.findElement(By.id("react-select-11-option-"+date+"")).click();
			
			driver.findElement(By.xpath("//div[text()='Month']")).click();
			driver.findElement(By.id("react-select-12-option-"+month+"")).click();
			
			driver.findElement(By.xpath("//div[text()='Year']")).click();
			driver.findElement(By.id("react-select-13-option-12")).click();
		}
		
		
	//------------------------------ADUTLT1 DOB ENTRY(HOLIDAYS)-----------------------------------------
		
		public void adult1DOBEntry(String date, String month) {
			driver.findElement(By.xpath("(//div[@class='css-1hwfws3'])[1]")).click();
			driver.findElement(By.id("react-select-5-option-"+date+"")).click();;
			
			driver.findElement(By.id("react-select-6-option-"+month+"")).click();;
			
			driver.findElement(By.id("react-select-7-option-6")).click();
		}
		
	//-----------------------------ADULT2 DOB ENTRY(HOLIDAYS)----------------------------------------
		
		public void adult2DOBEntry(String date, String month) {
			driver.findElement(By.xpath("(//div[@class='css-1hwfws3'])[1]")).click();
			driver.findElement(By.id("react-select-9-option-"+date+"")).click();;
			
			driver.findElement(By.id("react-select-10-option-"+month+"")).click();
			
			driver.findElement(By.id("react-select-11-option-11")).click();
		}
	
	//-----------------SELECTING GUESTS AND ROOMS--------------------------------------------
	public void selectGuests(String adults, String children) {
		driver.findElement(By.xpath("//li[@data-cy=\"adults-"+adults+"\"]")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"children-"+children+"\"]")).click();
	}

	//-------------------------------------WAITS-------------------------------------------------
	public void waitForVisibilityOfElementLocatable(WebDriver driver, By locators) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
	}

	public void waitForElementToBeClickable(WebDriver driver, By locators) {		
		wait.until(ExpectedConditions.elementToBeClickable(locators));
	}

	public void waitForElementToBeSelected(WebDriver driver, By locators) {
		wait.until(ExpectedConditions.elementToBeSelected(locators));
	}

	//---------------------------SWITCHING TO THE TABS---------------------------------------------

	public void switchtoNewTab(WebDriver driver) {
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println("New Tab Page Name" + driver.getTitle());

	}

	//----------------------------DATE VALIDATION----------------------------------------------

	public boolean dateValidation(String date, String month, String year) throws ParseException {

		boolean flag = false;

		Date monthParsing = new SimpleDateFormat("MMMM").parse(month);
		Calendar cal = Calendar.getInstance();
		cal.setTime(monthParsing);
		int monthInNo = cal.get(Calendar.MONTH)+1;

		String travelDateInStr = date+"/"+monthInNo+"/"+year;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date travelDate = sdf.parse(travelDateInStr);

		Date dateObj = new Date();
		String presentDateInStr = sdf.format(dateObj);
		Date presentDate = sdf.parse(presentDateInStr);

		if(travelDate.after(presentDate)) 
			flag = true;
		return flag;			
	}


	//---------------------------DATE CONVERSION-------------------------------------------------

	// 2021-06-14 - date should be in this format in excel sheet

	public void dateConversion(String date) throws ParseException {

		//boolean flag = false;

		LocalDate convertedDate = LocalDate.parse(date);
		int day = convertedDate.getDayOfMonth();
		Month month = convertedDate.getMonth();
		int year = convertedDate.getYear();

		String dd = Integer.toString(day);
		String MMMM = month.getDisplayName(TextStyle.FULL, Locale.UK);
		String yyyy = Integer.toString(year);

		System.out.println(dd +" "+ MMMM +" "+ yyyy);

		dateValidation(dd, MMMM, yyyy);
		//	flag = true;

		//return flag;

	}

	//-------------------------------PRESENT DATE-----------------------------------------------

	public Date presentDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dateObj = new Date();
		String presentDateInStr = sdf.format(dateObj);
		Date presentDate = sdf.parse(presentDateInStr);
		return presentDate;
	}

}


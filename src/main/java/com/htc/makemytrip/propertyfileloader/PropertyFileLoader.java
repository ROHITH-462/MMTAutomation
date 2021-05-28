package com.htc.makemytrip.propertyfileloader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLoader {
	
	static PropertyFileLoader instance;
	Properties prop;
	FileInputStream fis;
	
	public String browserName;
	public String chromeDriver;
	public String firefoxDriver;
	public String edgeDriver;
	public String url;
	public String excelFileLocation;
	public String loginSheet;
	public String registrationSheet;
	public String flightSheet;
	public String hotelSheet;
	public String villaSheet;
	public String trainSheet;
	public String busSheet;
	public String cabSheet;
	public String holidaySheet;
	public String directBookingSheet;
	public String explicitWaitTime;
	public String passFilePath;
	public String failFilePath;
	
	
	private PropertyFileLoader() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("./src/test/resources/prop.properties");
		prop.load(fis);
		
		browserName = prop.getProperty("Browser");
		chromeDriver = prop.getProperty("Chrome_DriverLocation");
		firefoxDriver = prop.getProperty("Firefox_DriverLocation");
		edgeDriver = prop.getProperty("Edge_DriverLocation");
		
		url = prop.getProperty("URL");
		
		excelFileLocation = prop.getProperty("ExcelFileLocation");
		loginSheet = prop.getProperty("Login_SheetName");
		registrationSheet = prop.getProperty("Registration_SheetName");
		flightSheet = prop.getProperty("Flight_SheetName");
		hotelSheet = prop.getProperty("Hotel_SheetName");
		villaSheet = prop.getProperty("Villa_SheetName");
		trainSheet = prop.getProperty("Train_SheetName");
		busSheet = prop.getProperty("Bus_SheetName");
		cabSheet = prop.getProperty("Cab_SheetName");
		holidaySheet = prop.getProperty("Holiday_SheetName");
		directBookingSheet = prop.getProperty("Direct_Booking_SheetName");
		
		explicitWaitTime = prop.getProperty("Explicit_Wait_Time");
		
		passFilePath = prop.getProperty("Pass_FilePath");
		failFilePath = prop.getProperty("Fail_FilePath");
	}
	
	public static PropertyFileLoader getInstance() throws IOException {
		if(instance == null)
			instance = new PropertyFileLoader();
		return instance;
	}

}

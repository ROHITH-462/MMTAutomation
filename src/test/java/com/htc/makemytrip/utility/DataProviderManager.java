package com.htc.makemytrip.utility;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.htc.makemytrip.propertyfileloader.PropertyFileLoader;

public class DataProviderManager {
	
	@DataProvider(name = "Data")
	public Object[][] dataProvider(Method method) throws IOException{
		
		PropertyFileLoader pfl = PropertyFileLoader.getInstance();
		
		ExcelFileHandler excelFile = new ExcelFileHandler(pfl.excelFileLocation);
		
		Object[][] dataSet = null;
		
		if(method.getName().equals("loginTest"))
			dataSet = excelFile.getRecords(pfl.loginSheet);
		
		else if(method.getName().equals("registrationTest"))
			dataSet = excelFile.getRecords(pfl.registrationSheet);
		
		else if(method.getName().equals("flightTicketBookingTest"))
			dataSet = excelFile.getRecords(pfl.flightSheet);
		
		else if(method.getName().equals("bookAHotelTest"))
			dataSet = excelFile.getRecords(pfl.hotelSheet);
		
		else if(method.getName().equals("bookingVillasTest"))
			dataSet = excelFile.getRecords(pfl.villaSheet);
		
		else if(method.getName().equals("checkPnrTest") || method.getName().equals("bookATrainTickectTest"))
			dataSet = excelFile.getRecords(pfl.trainSheet);
		
		else if(method.getName().equals("bookABusTicketTest"))
			dataSet = excelFile.getRecords(pfl.busSheet);
		
		else if(method.getName().equals("bookACabTest"))
			dataSet = excelFile.getRecords(pfl.cabSheet);
		
		else if(method.getName().equals("bookAHolidayTripTest"))
			dataSet = excelFile.getRecords(pfl.holidaySheet);
		
		else if(method.getName().equals("bookingTest"))
			dataSet = excelFile.getRecords(pfl.directBookingSheet);

		return dataSet;
	}
	

}

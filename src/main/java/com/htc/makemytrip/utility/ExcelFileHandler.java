package com.htc.makemytrip.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandler {
	
	Workbook workBook;
	Sheet sheet;
	
	public ExcelFileHandler(String filePath) {
		File file = new File(filePath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			workBook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public Object[][] getRecords(String sheetName){
		sheet = workBook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj= new  Object[rowCount][1];
		
		for(int row=0; row<rowCount; row++) {
			Map<Object, Object> data = new HashMap<Object, Object>();
			for(int col=0; col<columnCount; col++) {
				data.put(sheet.getRow(0).getCell(col).toString(), sheet.getRow(row+1).getCell(col).toString());
			}
			obj[row][0] = data;
		}
		return obj;
	}
}

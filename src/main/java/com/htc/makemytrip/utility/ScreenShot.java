package com.htc.makemytrip.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static String screenShot(WebDriver driver, String fileName, String filePath ) {

		String scrPath= filePath + fileName +  timeStamp()  +".png";
		TakesScreenshot tss = (TakesScreenshot) driver;
		File file = tss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(scrPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return scrPath;
	}

	public static String timeStamp() {
		return new SimpleDateFormat("E, dd MMMM-yyyy  hh mm ss").format(new Date());

	}

}

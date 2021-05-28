package com.htc.makemytrip.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.htc.makemytrip.base.BaseTest;
import com.htc.makemytrip.propertyfileloader.PropertyFileLoader;
import com.htc.makemytrip.reports.ExtentManager;
import com.htc.makemytrip.utility.ScreenShot;

public class TestListener extends BaseTest implements ITestListener{


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method started " + result.getName());
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Object testClass = result.getInstance();
		WebDriver driver = ((BaseTest)testClass).getDriver();
		System.out.println("Method passed " + result.getName());
		try {
			PropertyFileLoader pfl = PropertyFileLoader.getInstance();
			ScreenShot.screenShot(driver, result.getMethod().getMethodName(), pfl.passFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		childTest.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();
		WebDriver driver = ((BaseTest)testClass).getDriver();
		System.out.println("Method failed " + result.getName());
		try {
			PropertyFileLoader pfl = PropertyFileLoader.getInstance();
			String imgPath = ScreenShot.screenShot(driver, result.getMethod().getMethodName(), pfl.failFilePath);
			System.out.println(imgPath);
			childTest.log(Status.FAIL, "Test Failed ");
			childTest.log(Status.FAIL, result.getThrowable());
			childTest.addScreenCaptureFromPath(imgPath);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped " + result.getName());
		childTest.log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method failed with certain success percentage "+ result.getName());
	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
		extent = ExtentManager.getInstance();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method finished");
		extent.flush();
	}
}

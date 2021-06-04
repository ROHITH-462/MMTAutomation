package com.htc.makemytrip.base;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.htc.makemytrip.exception.MyException;
import com.htc.makemytrip.pages.BusHomePage;
import com.htc.makemytrip.pages.BusReviewPage;
import com.htc.makemytrip.pages.BusSelectionPage;
import com.htc.makemytrip.pages.CabBookingPage;
import com.htc.makemytrip.pages.CabHomePage;
import com.htc.makemytrip.pages.CabTripDetailsPage;
import com.htc.makemytrip.pages.DirectPaymentPage;
import com.htc.makemytrip.pages.FlightHomePage;
import com.htc.makemytrip.pages.FlightReviewPage;
import com.htc.makemytrip.pages.FlightSeatSelectionPage;
import com.htc.makemytrip.pages.FlightSelectionPage;
import com.htc.makemytrip.pages.FlightTravellerDetailsPage;
import com.htc.makemytrip.pages.HolidaysBookingPage;
import com.htc.makemytrip.pages.HolidaysHomePage;
import com.htc.makemytrip.pages.HolidaysPackagePage;
import com.htc.makemytrip.pages.HolidaysReviewPage;
import com.htc.makemytrip.pages.HomePage;
import com.htc.makemytrip.pages.HotelsHomePage;
import com.htc.makemytrip.pages.HotelsReviewPage;
import com.htc.makemytrip.pages.HotelsSelectionPage;
import com.htc.makemytrip.pages.IndexPage;
import com.htc.makemytrip.pages.LoginPage;
import com.htc.makemytrip.pages.PaymentPage;
import com.htc.makemytrip.pages.RegistrationPage;
import com.htc.makemytrip.pages.TrainsHomePage;
import com.htc.makemytrip.pages.TrainsPNRPage;
import com.htc.makemytrip.pages.TrainsReviewPage;
import com.htc.makemytrip.pages.TrainsSelectionPage;
import com.htc.makemytrip.pages.VillasBookingPage;
import com.htc.makemytrip.pages.VillasHomePage;
import com.htc.makemytrip.pages.VillasReviewPage;
import com.htc.makemytrip.pages.VillasSelectionPage;
import com.htc.makemytrip.propertyfileloader.PropertyFileLoader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	Logger log = Logger.getLogger(BaseTest.class);
	
	
	protected WebDriver driver;
	protected PaymentPage paymentPage;
	protected IndexPage indexPage;
	protected RegistrationPage registerationPage;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected FlightHomePage flightHomePage;
	protected FlightSelectionPage flightSelectionPage;
	protected FlightReviewPage flightReviewPage;
	protected FlightTravellerDetailsPage flightTravellerDetailsPage;
	protected FlightSeatSelectionPage flightSeatSelectionPage;
	protected HotelsHomePage hotelsHomePage;
	protected HotelsSelectionPage hotelsSelectionPage;
	protected HotelsReviewPage hotelsReviewPage;
	protected HolidaysHomePage holidaysHomePage;
	protected HolidaysPackagePage holidaysPackagePage;
	protected HolidaysBookingPage holidaysBookingPage;
	protected HolidaysReviewPage holidaysReviewPage;
	protected VillasHomePage villasHomePage;
	protected VillasSelectionPage villasSelectionPage;
	protected VillasBookingPage villasBookingPage;
	protected VillasReviewPage villasReviewPage;
	protected TrainsHomePage trainsHomePage;
	protected TrainsSelectionPage trainsSelectionPage;
	protected TrainsReviewPage trainsReviewPage;
	protected TrainsPNRPage trainsPNRPage;
	protected BusHomePage busHomePage;
	protected BusSelectionPage busSelectionPage;
	protected BusReviewPage busReviewPage;
	protected CabHomePage cabHomePage;
	protected CabBookingPage cabBookingPage;
	protected CabTripDetailsPage cabTripDetailsPage;
	protected DirectPaymentPage directPaymentPage;
	
	protected static ExtentReports extent;
	protected static ExtentTest test;
	protected static ExtentTest childTest;


	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void setUp() throws IOException {
		PropertyFileLoader pfl = PropertyFileLoader.getInstance();
		if(pfl.browserName.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("excludeSwitches", new String[] {"disable-popup-blocking"});
			options.addArguments("--disable-notifications");
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			
//			System.setProperty("webdriver.chrome.driver", pfl.chromeDriver);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			log.info("---------------- Launching chrome browser -----------------");
		}
		
		else if(pfl.browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", pfl.firefoxDriver);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(pfl.browserName.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver", pfl.edgeDriver);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pfl.url);
		
		paymentPage = new PaymentPage(driver);
		
		registerationPage = new RegistrationPage(driver);
		indexPage = new IndexPage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		
		flightHomePage = new FlightHomePage(driver);
		flightSelectionPage = new FlightSelectionPage(driver);
		flightReviewPage = new FlightReviewPage(driver);
		flightTravellerDetailsPage = new FlightTravellerDetailsPage(driver);
		flightSeatSelectionPage = new FlightSeatSelectionPage(driver);
		
		hotelsHomePage = new HotelsHomePage(driver);
		hotelsSelectionPage = new HotelsSelectionPage(driver);
		hotelsReviewPage = new HotelsReviewPage(driver);
		
		holidaysHomePage = new HolidaysHomePage(driver);
		holidaysPackagePage = new HolidaysPackagePage(driver);
		holidaysBookingPage = new HolidaysBookingPage(driver);
		holidaysReviewPage = new HolidaysReviewPage(driver);
		
		villasHomePage = new VillasHomePage(driver);
		villasSelectionPage = new VillasSelectionPage(driver);
		villasBookingPage = new VillasBookingPage(driver);
		villasReviewPage = new VillasReviewPage(driver);
		
		trainsHomePage = new TrainsHomePage(driver);
		trainsSelectionPage = new TrainsSelectionPage(driver);
		trainsReviewPage = new TrainsReviewPage(driver);
		trainsPNRPage = new TrainsPNRPage(driver);
		
		busHomePage = new BusHomePage(driver);
		busSelectionPage = new BusSelectionPage(driver);
		busReviewPage = new BusReviewPage(driver);
		
		cabHomePage = new CabHomePage(driver);
		cabBookingPage = new CabBookingPage(driver);
		cabTripDetailsPage = new CabTripDetailsPage(driver);
		
		directPaymentPage = new DirectPaymentPage(driver);
		
//		extent = ExtentManager.getInstance();
		
	}	

	@AfterClass
	public void tearDown() throws MyException {
		driver.quit();
		log.info("Driver closed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@AfterMethod
//	public void testStatus(ITestResult result) throws IOException {
//		PropertyFileLoader pfl = PropertyFileLoader.getInstance();
//		if(result.getStatus()==ITestResult.FAILURE) {
//			childTest.log(Status.FAIL, "Test Failed ");
//			childTest.log(Status.FAIL, result.getThrowable());
//			String imgPath = ScreenShot.screenShot(driver, result.getMethod().getMethodName(), pfl.failFilePath);
//			childTest.addScreenCaptureFromPath(imgPath);
//		}
//		
//		else if(result.getStatus()==ITestResult.SUCCESS) {
//			childTest.log(Status.PASS, "Test Passed");
//		}
//		
//		else if(result.getStatus()==ITestResult.SKIP) {
//			childTest.log(Status.SKIP, "Test Skipped");
//		}
//	}		
//	
//	
//	@AfterSuite
//	public void flushReport() {
////		extent.flush();
//	}
//

}

package com.abc.desktop.applications.sample.reuse;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abc.config.StartBrowser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.windows.WindowsDriver;

public class StartNotepad {

	//extent report variables
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentHtmlReporter htmlreporter;
	String method;
	public static WindowsDriver driver = null;
/*
	@Test
	public void tstNotepad() throws InterruptedException {
		driver.findElementByName("Help").click();
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Click Help");
		Thread.sleep(60000);
	}
*/
	@BeforeClass

	public void setUp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		//cap.setCapability("app",loc);
		cap.setCapability("app","C:\\Windows\\System32\\notepad.exe");
		//System.out.println(url);
		//cap.setCapability("app",url);
		cap.setCapability("platformName", "Windows");
		cap.setCapability("de viceName", "WindowsPC");
		
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"),cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //Thread.sleep(6000);
	}
	 
	@AfterMethod
	public void clenaUp() throws MalformedURLException
	{
		driver.quit();
		//setUp();
	}
	/*
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
*/
	@BeforeTest
	public void generateReport()
	{
		htmlreporter = new ExtentHtmlReporter("Reports/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter); 

	}




	@BeforeMethod
	public void methodName(Method method){
		parentTest = extent.createTest(method.getName());
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		extent.flush();
	}


}

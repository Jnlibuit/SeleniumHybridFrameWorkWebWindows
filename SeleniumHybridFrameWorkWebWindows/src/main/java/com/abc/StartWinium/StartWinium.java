package com.abc.StartWinium;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class StartWinium {
	public static WiniumDriver driver;

	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentHtmlReporter htmlreporter;
	String method;
	/*
	@Test
	public void lunch() throws InterruptedException {
		//driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	 */

	@BeforeClass
	public static void setUpenvironment() throws MalformedURLException
	{
		DesktopOptions option=new DesktopOptions();

		option.setApplicationPath("C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");

		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);

	}

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
	public void afterClass() throws MalformedURLException {

		//driver.quit();
		extent.flush();
	}


}

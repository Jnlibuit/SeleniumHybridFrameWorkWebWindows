package com.abc.config;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	public static WebDriver driver;
	//extent report variables
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentHtmlReporter htmlreporter;
	String method;
/*
	@Test
	public void lunch() {
		driver.get("https://www.amazon.com/");
	}
*/	
	@BeforeClass
	public void beforeClass() {
		//WebDriverManager.chromiumdriver().setup();//

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	public void afterClass() {
		driver.quit();
		extent.flush();
	}


}

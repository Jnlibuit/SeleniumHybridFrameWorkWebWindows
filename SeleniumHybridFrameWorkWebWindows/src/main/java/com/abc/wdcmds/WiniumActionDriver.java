package com.abc.wdcmds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;

import com.abc.StartWinium.StartWinium;
import com.abc.config.StartBrowser;
import com.aventstack.extentreports.MediaEntityBuilder;

public class WiniumActionDriver 
{
	public static WiniumDriver driver;
	public WiniumActionDriver(){
		driver = StartWinium.driver;
	}
	/**
	 * Used to navigate to a given URL
	 * @param url -- https://www.google.com/
	 * @throws Exception 
	 */
	public void navigateToApplication(String url) throws Exception
	{

		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully Navigated to :"+url);
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Navigated to :"+url,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}

	/**
	 * Used to perofrm click action on buttons, check box, links, radio buttons
	 * @param locator -- Get it from the object repository
	 * @param eleName -- Name of the element on which you are performing action ex: login button
	 * @throws Exception
	 */
	public void click(By locator, String eleName) throws Exception
	{

		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Successfully Navigated to :"+eleName);
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to Navigated to :"+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;

		}
	}
	/**
	 * Used to type in textboxes or text areas
	 * @param locator -- Get it from Object repository
	 * @param testData -- what you want to type in text box
	 * @param eleName -- Name of the element o which you are performing action ex: userName text box
	 * @throws Exception
	 */
	public void type(By locator, String testData, String eleName) throws Exception
	{

		try {
			driver.findElement(locator).sendKeys(testData);
			StartBrowser.childTest.pass("Successfully performed type action in : "+eleName + " With Data "+testData);
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to perform type action in :"+eleName + " With Data "+testData,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);		
			throw e;
		}
	}

	public void mouseHover(By locator, String eleName) throws Exception
	{

		try {
			Actions a = new Actions(driver);
			WebElement mo=driver.findElement(locator);
			a.moveToElement(mo).build().perform();
			StartBrowser.childTest.pass("Successfully performed mousehover on:"+eleName);
		}
		catch(Exception e) {
			StartBrowser.childTest.fail("Unable to perform type action in : to :"+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);		
			throw e;
		}
	}



	public String screenShot()
	{
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

	public static String getText(By locator) 
	{
		return driver.findElement(locator).getText();
	}
}

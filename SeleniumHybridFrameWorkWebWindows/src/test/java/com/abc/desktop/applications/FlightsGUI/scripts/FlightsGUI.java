package com.abc.desktop.applications.FlightsGUI.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.config.StartWinium.StartWinium;
import com.abc.desktop.applications.FlightsGUI.reuse.FlightsGUICommonFunctions;
import com.abc.desktop.applications.sample.reuse.StartNotepad;
import com.abc.webapplications.sample.reuse.CommonFunctions;

public class FlightsGUI extends StartWinium {

	@Test

	public void testFlightsGUI() throws Exception {

		DesktopOptions option = new DesktopOptions();
		//option.setApplicationPath("C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");
		option.setApplicationPath("C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");
		//option.setApplicationPath("C:\\Windows\\System32\\calc.exe");

		WiniumDriver driver = new WiniumDriver(new URL ("http://localhost:9999"),option);


		driver.findElementById("agentName").sendKeys("john");
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully typed agentName");

		driver.findElementById("password").sendKeys("HP");
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully typed password");

		//aDriver.click(com.abc.desktop.applications.FlightsGUI.objectrepository.logonpage.LogonPage.btnOk, "OK button");

		driver.findElementByName("OK").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked OK");

		driver.findElementById("fromCity").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked fromCity");

		driver.findElementByName("Paris").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked fromCity");
		driver.findElementById("toCity").click();

		driver.findElementByName("Portland").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked toCity");
		
		driver.findElementByName("FIND FLIGHTS").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked FIND FLIGHTS");
		
		driver.findElementByName("Item: FlightsGUI.Logic.GuiFlight, Column Display Index: 0").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully selected a flight");
		
		driver.findElementById("selectFlightBtn").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked select flight button");
		
		driver.findElementById("passengerName").sendKeys("Frank George");
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully entered passenger");
		driver.findElementById("orderBtn").click();
		StartWinium.childTest = StartWinium.parentTest.createNode( "Susscessfully clicked order button");
		
		driver.findElementById("Close").click();

		driver.findElementById("Close").click();


	}
}




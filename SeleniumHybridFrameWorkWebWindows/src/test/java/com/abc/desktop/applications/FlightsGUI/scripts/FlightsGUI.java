package com.abc.desktop.applications.FlightsGUI.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.StartWinium.StartWinium;
import com.abc.desktop.applications.sample.reuse.StartNotepad;

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
	  
	 //aDriver.click(com.abc.desktop.applications.FlightsGUI.objectrepository.logonpage.LogonPage.btnOk, "OK button");
	  
	 driver.findElementByName("OK").click();
	  
	  driver.findElementById("fromCity").click();
	   
	  driver.findElementByName("Paris").click();
	  
	  driver.findElementById("toCity").click();
	   
	  driver.findElementByName("Portland").click();
	  
	  driver.findElementByName("FIND FLIGHTS").click();
	  
	  driver.findElementByName("Item: FlightsGUI.Logic.GuiFlight, Column Display Index: 0").click();
	  
	  driver.findElementById("selectFlightBtn").click();
	  
	  driver.findElementById("passengerName").sendKeys("Frank George");
	  
	  driver.findElementById("orderBtn").click();
	  
	  driver.findElementById("Close").click();
	  
	  driver.findElementById("Close").click();
  }

  
}

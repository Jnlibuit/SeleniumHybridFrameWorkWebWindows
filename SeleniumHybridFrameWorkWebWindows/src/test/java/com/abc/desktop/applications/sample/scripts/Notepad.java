package com.abc.desktop.applications.sample.scripts;

import org.testng.annotations.Test;

import com.abc.config.StartBrowser;
import com.abc.desktop.applications.sample.reuse.StartNotepad;

import io.appium.java_client.windows.WindowsDriver;

public class Notepad  extends StartNotepad {

  	//public static WindowsDriver driver = null;
	@Test 
  public void testNotepad() throws InterruptedException {
  
	driver.findElementByName("Help").click();
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Susscessfully clicked Help");
	Thread.sleep(500);
	
	driver.findElementByName("About Notepad").click();
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Succdessfully clicked About Notepad");
	Thread.sleep(500);
	
	driver.findElementByName("OK").click();
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Successfully clicked OK button");
	
	
	
	Thread.sleep(500);
	
	
	
  }
  /*
  @Test
  public void testSendText() throws InterruptedException {
  
	driver.findElementByName("Text Editor").sendKeys("This is my notedpad automation");
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Successfully cleared Text Editor");
	
	Thread.sleep(2000);
	
	
	
  }
  
  */
  
}

package com.abc.desktop.applications.sample.scripts;

import org.testng.annotations.Test;

import com.abc.config.StartBrowser;
import com.abc.desktop.applications.sample.reuse.StartNotepad;

import io.appium.java_client.windows.WindowsDriver;

public class SendKeys  extends StartNotepad {

  	//public static WindowsDriver driver = null;
	@Test 
  public void testSendKeys() throws InterruptedException {
  
	
	
	driver.findElementByName("Text Editor").sendKeys("This is my notedpad automation");
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Successfully typed data entered");
	Thread.sleep(500);
	
	driver.findElementByName("Text Editor").clear(); 
	StartNotepad.childTest = StartNotepad.parentTest.createNode( "Successfully cleared Text Editor");
	
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

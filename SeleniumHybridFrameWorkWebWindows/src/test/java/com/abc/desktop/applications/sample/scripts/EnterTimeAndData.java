package com.abc.desktop.applications.sample.scripts;

import org.testng.annotations.Test;

import com.abc.desktop.applications.sample.reuse.StartNotepad;

public class EnterTimeAndData extends StartNotepad{
	@Test
	public void testEnterTimeAndData() throws InterruptedException {
		driver.findElementByName("Edit").click();
		StartNotepad.childTest = StartNotepad.parentTest.createNode( "Susscessfully clicked Edit");
		Thread.sleep(500);

		driver.findElementByAccessibilityId("26").click();
		StartNotepad.childTest = StartNotepad.parentTest.createNode( "Susscessfully clicked Time/Date");
		Thread.sleep(500);

		driver.findElementByName("Text Editor").clear(); 
		StartNotepad.childTest = StartNotepad.parentTest.createNode( "Successfully cleared Text Editor");

		Thread.sleep(500);
	}
}

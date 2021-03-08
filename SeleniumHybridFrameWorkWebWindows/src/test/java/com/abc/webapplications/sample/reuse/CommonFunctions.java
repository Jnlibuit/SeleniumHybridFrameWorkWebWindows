package com.abc.webapplications.sample.reuse;

import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver; 


public class CommonFunctions {

	public WebDriver driver;
	public ActionDriver aDriver;
	
	public CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public void Signin(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Signin to Amazon");
		
		aDriver.navigateToApplication("https://www.amazon.com/");
		aDriver.mouseHover(com.abc.webapplications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		//aDriver.click(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Link");
		aDriver.click(com.abc.webapplications.sample.objectrepository.AccountPage.btnSignin, "Sigin in button");	
		aDriver.type(com.abc.webapplications.sample.objectrepository.SigninPage.txtEmaild, userName, "Email Id");
		//aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, password, "Password");
		aDriver.click(com.abc.webapplications.sample.objectrepository.SigninPage.btnContinue, "Continue button");
		aDriver.type(com.abc.webapplications.sample.objectrepository.SigninPage.txtPassword, password, "Password");
		aDriver.click(com.abc.webapplications.sample.objectrepository.SigninPage.btnSignIn, "Sign-In button");
		Thread.sleep(2000);
	}
	
	public void AccountMenu() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "However to Account Menu");
		aDriver.mouseHover(com.abc.webapplications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		
		
			
		
		//Thread.sleep(1000);
	}
	
	public void Signout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "However to Account Menu");
		
		aDriver.mouseHover(com.abc.webapplications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		aDriver.click(com.abc.webapplications.sample.objectrepository.AccountPage.lnkSignout, "Signout Link");
		
			
		
		//Thread.sleep(1000);
	}
	
	public void NavigateToHomePage(String url ) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Navigate to Home Page");
		aDriver.navigateToApplication(url);
		
		//aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		
			
		
		Thread.sleep(1000);
	}
}
package com.abc.webapplications.sample.objectrepository;

import org.openqa.selenium.By;

public class SigninPage {
	public static By txtEmaild = By.xpath("//input[@id='ap_email']");
	public static By txtPassword = By.xpath("//input[@id='ap_password']");
	public static By btnContinue = By.xpath("//input[@id='continue']");
	public static By msgproblem = By.xpath("//h4[contains(text(),'There was a problem')]");
	public static By btnSignIn = By.xpath("//input[@id='signInSubmit']");

}

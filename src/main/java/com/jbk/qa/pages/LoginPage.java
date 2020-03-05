package com.jbk.qa.pages;

import org.openqa.selenium.WebDriver;

import com.jbk.qa.pagesOR.LoginPageOR;

public class LoginPage extends LoginPageOR {

	// Action

	// public void enterEmail(String emailId){
	// email.sendKeys(emailId);
	// }
	// public void enterPassword(String loginPassword){
	// password.sendKeys(loginPassword);
	// }
	//
	// public HomePage clickLoginBut(){
	// submit.submit();
	// return new HomePage();
	// }

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public HomePage login(String emailId, String loginPassword) {
		email.sendKeys(emailId);
		password.sendKeys(loginPassword);
		submit.submit();
		
		return new HomePage();

	}

	public RegistrationPage regester() {
		regesterPagelink.click();

		return new RegistrationPage(driver);
	}

	private String getLoginpageTitle() {
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		return loginPageTitle;
	}

	public boolean validateloginpageTitle() {

		if (getLoginpageTitle().equals("JavaByKiran | Log in")) {
			return true;
		} else {
			return false;
		}

	}
	
	public String getLoginpageLogo(){
		String loginpageLogo=loginLogo.getText();
		System.out.println(loginpageLogo);
		return loginpageLogo;
		
	}
	
	public boolean validateloginpageLogo() {

		if (getLoginpageLogo().equals("Java By Kiran")) {
			return true;
		} else {
			return false;
		}

	}
	
	public String getLoginpageLogoTagline(){
		String logoTaglone=tagLine.getText();
		System.out.println(logoTaglone);
		return logoTaglone;
		
	}
	
	public boolean validateloginpageLogoTagline() {
		
		if (getLoginpageLogoTagline().equals("JAVA | SELENIUM | PYTHON")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getLoginBoxMsg(){
		String msg=loginBoxMsg.getText();
		System.out.println(msg);
		return msg;
		
	}
	
	public boolean validateLoginBoxMsg() {
		
		if (getLoginBoxMsg().equals("Sign in to start your session")) {
			return true;
		} else {
			return false;
		}
		
	}
	
//	public boolean  validateJBKlogoImg(){
//		return	logoImg.isDisplayed();
//		}
	
	
	
	

}

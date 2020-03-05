package com.jbk.qa.pages;

import org.openqa.selenium.WebDriver;

import com.jbk.qa.pagesOR.RegistrationPageOR;

public class RegistrationPage extends RegistrationPageOR {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public String getRegistrationPageTitle() {
		String registrationPageTitle = driver.getTitle();
		System.out.println(registrationPageTitle);
		return registrationPageTitle;

	}

	public boolean validateRegistrationPageTitle() {
		if (getRegistrationPageTitle().equals("JavaByKiran | Registration Page")) {
			return true;
		} else
			return false;
	}

	public String getRegistrationPageHeader() {
		return headerText.getText();
	}

	public boolean validateRegistrationPageHeader() {
		if (getRegistrationPageHeader().equals("Java By Kiran")) {
			return true;
		} else
			return false;

	}
	
	public void enterName(String Name){
		name.sendKeys(Name);
		
	}
	
	public String checkNameErrorMsg(){
		return nameError.getText();
	}
	
	public void enterMobile(String number){
		mobile.sendKeys(number);
		
	}
	
	public String checkMobileErrorMsg(){
		return mobileError.getText();
	}
	
	public void enterEmail(String Email){
		email.sendKeys(Email);
		
	}
	
	public void enterPassword(String Password){
		password.sendKeys(Password);
		
	}
	
	public void clickSigninButton(){
		signinButton.submit();
		
	}
	
	public LoginPage clickHaveAccount(){
		haveAccount.click();
		return new LoginPage(driver);
		
	}
	
	

}

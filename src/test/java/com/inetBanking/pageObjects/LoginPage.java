package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="closeBtn")
	@CacheLookup
	WebElement chilwindow;
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement urname;	
	
	@FindBy(name ="password")
	@CacheLookup
	WebElement psword;
	
	@FindBy(name ="btnLogin")
	@CacheLookup
	WebElement Loginbutton;
	
	
	public void chilwindowPopUp() {
		chilwindow.click();
		
	}
	
	
	public void setUserName(String uname) {
		urname.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) {
		psword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		Loginbutton.click();
	}
	
	
	
	
	
}

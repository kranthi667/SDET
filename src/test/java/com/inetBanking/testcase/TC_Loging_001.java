package com.inetBanking.testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_Loging_001 extends BaseClass {
	
	
	
	@Test
	
	public void login(){
		driver.get(url);
		
		logger.info("open URL");
	
		
				LoginPage lp = new LoginPage(driver);
				
				//lp.chilwindowPopUp();
				
				
				lp.setUserName(username);
				logger.info("Entered username");
				lp.setPassword(password);
				logger.info("Entered password");
				lp.clickSubmit();
				
				String pageTitle = driver.getTitle();
				
				if(pageTitle.equalsIgnoreCase("Guru99 Bank Manager Homepage"))	{
					Assert.assertTrue(true);
					logger.info("Title verified successfully");
				}else {
					Assert.assertFalse(false);
				}
				
				
			
			}
		}



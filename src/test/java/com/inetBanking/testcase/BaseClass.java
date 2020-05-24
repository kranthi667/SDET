package com.inetBanking.testcase;

import org.apache.commons.collections4.Get;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {


	public String url ="http://www.demo.guru99.com/V4/";
	public String username="mngr249745";
	public String password="udyhejU";
	public static WebDriver driver;

	public static Logger logger;
	
@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		

	}
@AfterClass
	public void tearDown() {
		//driver.close();
	}

}

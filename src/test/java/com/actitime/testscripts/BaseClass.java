package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeTest  
	   public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
	    	String browserName="chrome";
	    	
	    	if(browserName.equals("chrome")) {
	    	
			System.setProperty("webdriver.chrome.driver","C://drivers//chromedriver.exe");
			 driver=new ChromeDriver();//initialization
			 
	    	}
	    	else if(browserName.equals("firefox"))
	    	{

	    		System.setProperty("webdriver.gecko.driver","C://drivers//geckodriver.exe");
	    		 driver=new FirefoxDriver();//initialization
	    	}
	    	
			driver.get("http://127.0.0.1:81/login.do");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}

		@AfterTest
		public void closeBrowser()
		{
			driver.close();
			
			
		}
		
		@BeforeClass
		public void login()
		{
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
		}
		
		@AfterClass
		public void logout()
		{
			driver.findElement(By.className("logoutImg")).click();
			
		} 
		
	}




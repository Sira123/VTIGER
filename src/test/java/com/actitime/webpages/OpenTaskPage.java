package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.BaseClass;

public class OpenTaskPage {

	public static Logger log;
	
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsAndCustomersLink;
	
	
	public OpenTaskPage()
	{
		 log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(BaseClass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	public void clickOnProjectsAndCustomerLink()
	{
		projectsAndCustomersLink.click();
	  log.info("--------Clicked on Projects And Customer Link-------");
	}
}

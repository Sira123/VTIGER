package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.BaseClass;

public class ActiveProjectsAndCustomerPage {
	public static Logger log;
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;

	public ActiveProjectsAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(BaseClass.driver,this);
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
	log.info("------Clicked on Add New Customer Button------");	
		
	}
	
	
	public String retriveSuccessMessage()
	{
		
		String s= successMessage.getText();
		log.info("----Success Message retrived -------");
		return s;
		
	}
	
	public void clickOnAddNewProjectButton()
	{
		addNewProjectButton.click();
		log.info("-----add New project button is clicked");
		
	}
	
	
	
	
	
}

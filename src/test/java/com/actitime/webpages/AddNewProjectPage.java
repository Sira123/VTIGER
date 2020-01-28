package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.testscripts.BaseClass;

public class AddNewProjectPage {

	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="name")
	private WebElement projectNameTextfield;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	public static Logger log;
	public AddNewProjectPage()
	{
	
		PageFactory.initElements(BaseClass.driver,this);
		log=Logger.getLogger(OpenTaskPage.class);
		
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public void selectCustomerFromDropdown(String customerName)
	{
		Select s1=new Select(customerDropdown);
		s1.selectByVisibleText(customerName);
		log.info("------customer is selected from dropdown------");
	}
	
	public void enterProjectName(String projectName)
   {
	projectNameTextfield.sendKeys(projectName); 
	log.info("-------enter project name-------");
		
   }
	
	public  void clickOnCreateProjectButton()
	{
		createProjectButton.click();
		log.info("-------Clicked on Create project button-----");
	}
}

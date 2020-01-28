package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.testscripts.BaseClass;

public class AddNewCustomerPage {
	
	public static Logger log;
	@FindBy(name="name")
	private WebElement customerNameTextField;
	

	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
		PageFactory.initElements(BaseClass.driver,this);
		log=Logger.getLogger(OpenTaskPage.class);
		
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	public void enterCustomerName(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
	   log.info("-------customer name entered-----");
	}
	
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
		log.info("------CreateCustomer button is clicked------");
	}
}

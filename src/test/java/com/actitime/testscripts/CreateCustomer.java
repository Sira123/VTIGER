package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generics.ExcelOperation;

import com.actitime.webpages.ActiveProjectsAndCustomerPage;
import com.actitime.webpages.AddNewCustomerPage;
import com.actitime.webpages.OpenTaskPage;

public class CreateCustomer extends BaseClass {

	@Test
	public void testCreatCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	String customerName="asfsdfdffsdf";///
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
	 ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	 apcp.clickOnAddNewCustomerButton();
	 AddNewCustomerPage ancp=new AddNewCustomerPage();
	ancp.enterCustomerName(customerName);
	 ancp.clickOnCreateCustomerButton();
	
	
	 
	
	
	}
}

package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.actitime.generics.ExcelOperation;

import com.actitime.webpages.ActiveProjectsAndCustomerPage;
import com.actitime.webpages.AddNewProjectPage;
import com.actitime.webpages.OpenTaskPage;

public class CreateProject extends BaseClass {
	
	@Test
	public void testCreateProject() throws EncryptedDocumentException, InvalidFormatException, IOException
	{ 
		
		String customerName="asfsdfdffsdf";//ExcelOperation.readData("Sheet2",1,0);
	    String projectName="fjdklffl";//ExcelOperation.readData("Sheet2",1,1);
		
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewProjectButton();
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCustomerFromDropdown(customerName);
		anpp.enterProjectName(projectName);
		anpp.clickOnCreateProjectButton();
		String act=apcp.retriveSuccessMessage();
		
		
	}

}

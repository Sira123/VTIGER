package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.actitime.generics.ExcelOperation;

public class Sample {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String  s=ExcelOperation.readData("Sheet1",1,0);
		System.out.println(s);
	}

}

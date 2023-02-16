package com.fileutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileUtils {

	public static String  getLocator(String locator ) {
		String baseDir = System.getProperty("user.dir");
		String locatorValue = "";
		try {
			FileInputStream fis = new FileInputStream(baseDir+"/src/main/resources/OR.Properties");
			Properties prop = new Properties();
			prop.load(fis);
			locatorValue = prop.getProperty(locator);
			
			}catch(FileNotFoundException e) {
				
			}catch(IOException e) {
				
			}
		return locatorValue;
	}

	

}

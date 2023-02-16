package com.Framework.Testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Framework.Keywords.Keyword;

public class TestBase {

	@BeforeMethod
	public void launchBrowser() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.etsy.com/");
		Keyword.maximizeBrowser();
	}
	
	@AfterMethod
	public void tearDown() {
		Keyword.driver.quit();
	}
}

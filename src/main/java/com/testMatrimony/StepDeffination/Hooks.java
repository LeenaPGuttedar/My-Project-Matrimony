package com.testMatrimony.StepDeffination;

import com.Framework.Keywords.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public static void setUp() {
		String env = System.getProperty("env");
		System.out.println("Environment:" +env);
		
		 Keyword.openBrowser("Chrome");
		//2 Keyword.launchUrl("https://www.etsy.com/");
		 Keyword.launchUrl("https://ashtvivah.com/");
		 Keyword.maximizeBrowser();
	}
//	@After
//	public void teardown()
//	{
//		Keyword.teardown();
//	}

}

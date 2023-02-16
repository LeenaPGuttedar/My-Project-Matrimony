package com.Framework.Keywords;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Keyword {

	public static WebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			System.err.println("Invalid browser name: " + browserName);
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static void clickOn(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id"))
			return driver.findElement(By.id(locatorValue));
		else if (locatorType.equalsIgnoreCase("className"))
			return driver.findElement(By.className(locatorValue));
		else if (locatorType.equalsIgnoreCase("name"))
			return driver.findElement(By.name(locatorValue));
		else if (locatorType.equalsIgnoreCase("partialLinkTex"))
			return driver.findElement(By.partialLinkText(locatorValue));
		else if (locatorType.equalsIgnoreCase("linkText"))
			return driver.findElement(By.linkText(locatorValue));
		else if (locatorType.equalsIgnoreCase("tagName"))
			return driver.findElement(By.tagName(locatorValue));
		else if (locatorType.equalsIgnoreCase("xpath"))
			return driver.findElement(By.xpath(locatorValue));
		else if (locatorType.equalsIgnoreCase("css"))
			return driver.findElement(By.cssSelector(locatorValue));
		else
			return null;

	}

	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}
	

	public static String getText(String locatorType,String locatorValue) {
		if (locatorType.equalsIgnoreCase("id"))
			return driver.findElement(By.id(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("className"))
			return driver.findElement(By.className(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("name"))
			return driver.findElement(By.name(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("partialLinkTex"))
			return driver.findElement(By.partialLinkText(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("linkText"))
			return driver.findElement(By.linkText(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("tagName"))
			return driver.findElement(By.tagName(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("xpath"))
			return driver.findElement(By.xpath(locatorValue)).getText();
		else if (locatorType.equalsIgnoreCase("css"))
			return driver.findElement(By.cssSelector(locatorValue)).getText();
		else
			return null;
		
	}
	public static List<String> getTexts(String locatorType,String locatorValue){
		List<String> texts=new ArrayList<String>();
		List<WebElement>elements=new ArrayList<WebElement>();
		if (locatorType.equalsIgnoreCase("id"))
			elements= driver.findElements(By.id(locatorValue));
		else if (locatorType.equalsIgnoreCase("className"))
			elements=driver.findElements(By.className(locatorValue));
		else if (locatorType.equalsIgnoreCase("name"))
			elements=driver.findElements(By.name(locatorValue));
		else if (locatorType.equalsIgnoreCase("partialLinkTex"))
			elements= driver.findElements(By.partialLinkText(locatorValue));
		else if (locatorType.equalsIgnoreCase("linkText"))
			elements= driver.findElements(By.linkText(locatorValue));
		else if (locatorType.equalsIgnoreCase("tagName"))
			elements= driver.findElements(By.tagName(locatorValue));
		else if (locatorType.equalsIgnoreCase("xpath"))
			elements=driver.findElements(By.xpath(locatorValue));
		else if (locatorType.equalsIgnoreCase("css"))
			elements=driver.findElements(By.cssSelector(locatorValue));
		else
			return null;
		
		for(WebElement element:elements) {
			texts.add(element.getText());
		}
		return texts;
		
	}
	public static void  havorOn(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public static void hoveron(String LocatorType,String locatorValue) {
		Actions action=new Actions(driver);
	    WebElement ele=getWebElement(LocatorType,locatorValue);
	    action.moveToElement(ele).perform();
//		action.build();
//	    action.perform();
	
}
	public static void teardown() {
		driver.quit();

	}

	
//	public static void listselectElementFromDropDownList(WebElement element) {
//		Select select = new Select(List);
//	}

	public static void clickOn(WebElement poojafavors) {
		// TODO Auto-generated method stub
		
	}
}

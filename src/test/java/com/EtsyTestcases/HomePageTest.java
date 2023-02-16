package com.EtsyTestcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.Keywords.Keyword;
import com.Framework.Testbase.TestBase;
import com.fileutils.FileUtils;
import com.fileutils.Locator;
import com.testinshastra.pages.FurniturePage;
import com.testinshastra.pages.HomePage;

public class HomePageTest extends TestBase {
	
	@Test
	public static void verifysigninfuntionlity() throws InterruptedException{

	Keyword.clickOn("xpath","//button[contains(text(),'Sign in')]");
	  Thread.sleep(3000);
	 Keyword.enterText("xpath","//input[@id=\"join_neu_email_field\"]","leenaguttedar2@gmail.com");
	 Keyword.enterText("xpath","//input[@id=\"join_neu_password_field\"]","Sanvipg44"); 
	 Thread.sleep(2000);
	 Keyword.clickOn("xpath","//button[@value=\"sign-in\"]"); 
	 String ExpectedTitle="Etsy India - Shop for handmade, vintage, custom, and unique gifts for everyone";
	 String actualTitle=Keyword.driver.getTitle(); 
	 Assert.assertEquals(actualTitle,ExpectedTitle);
	
	 }
	
	@Test
	public static void verifySearchFuctionality() { // 3
		Keyword.enterText("xpath","//input[@name='search_query']","Kids Toys");
		Keyword.clickOn("xpath","(//button[@type=\"submit\"])[1]");
		String expectedTitle = "Kids toys - Etsy IN";
		String actualTitle = Keyword.driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	@Test
	 public static void verifyThatElementsAreAddingToBasket() throws InterruptedException { 
		  
		  Keyword.clickOn("xpath",Locator.homepage_gift);
		  Keyword.clickOn("xpath",FileUtils.getLocator("homePage.gift_item"));
		  ArrayList<String> tabs1 = new ArrayList<String>(Keyword.driver.getWindowHandles());
		  Keyword.driver.switchTo().window(tabs1.get(1)); 
		  WebElement list = Keyword.getWebElement("xpath","//select[@id=\"variation-selector-0\"]");
		  Select size= new Select(list); 
		  size.selectByIndex(2); 
		  Thread.sleep(3000);
		  Keyword.clickOn("xpath","//button[contains(text(),'Add to basket')]"); 
		  String expectedTitle = "Buy Pinkandwhiteabstractepoxyresinwallclockforhomedecor Online in India - Etsy";
		  String actualTitle = Keyword.driver.getTitle();
		  Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Test
	public void verifymenuBeforeGiftsMenu() {
		  ArrayList <String> menueTexts=new ArrayList<String>();
		  menueTexts.add("Sellers' Sales Hub");
		  menueTexts.add("Jewellery & Accessories");
		  menueTexts.add("Clothing & Shoes"); 
		  menueTexts.add("Home & Living");
		  menueTexts.add("Wedding & Party"); 
		  menueTexts.add("Toys & Entertainment");
		  menueTexts.add("Art & Collectibles");
		  menueTexts.add("Craft Supplies");
		  menueTexts.add("Gifts");
		// List<String> mainmenues=Keyword.getTexts("xpath","//li[@class=\"top-nav-item wt-pb-xs-2 wt-mr-xs-2 wt-display-flex-xs wt-align-items-center\"]/a");
		//List<String>mainmenues=Keyword.getTexts("xpath",FileUtils.getLocator("homepage.mainmenues_list"));
		 List<String>mainmenues=Keyword.getTexts("xpath",Locator.mainmenues_list);
		Assert.assertEquals(menueTexts, mainmenues);
		System.out.println(mainmenues);
}
	
	@Test
	public void verifyAll5OutOf5StarPoojafavorsItemOnCurrentPage() throws InterruptedException {
		verifysigninfuntionlity();
		Thread.sleep(3000);
	HomePage home = PageFactory.initElements(Keyword.driver, HomePage.class);
	home.clickonPoojafavors();
	List<String> FiveStarItems = home.getAll5StarRatingPoojaItemsTitle();
	System.out.println(FiveStarItems);
	}
	
	@Test
	public void verifyAllFurnitureSubMenu() throws InterruptedException {
		verifysigninfuntionlity();
		Thread.sleep(3000);
		FurniturePage furniture = new FurniturePage();
	//FurniturePage furniture = PageFactory.initElements(Keyword.driver, FurniturePage.class);
	furniture.hoverOnHomeAndLiving();
	Thread.sleep(2000);
	furniture.clickOnFurniture();
	List<String> listOfFurniture = furniture.ListOfFurnitureMenu();
	System.out.println(listOfFurniture );
	}
	}

package com.TestEcommerce.StepDeffination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Framework.Keywords.Keyword;
import com.fileutils.Locator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioStep {
	@Given("Open Browser")
public void openBrowser() {
	Keyword.openBrowser("Chrome");
	}
	
	@When("user enter url app open")
	public void launchbrowser() {
		Keyword.launchUrl("https://www.Etsy.com");
	}
	
	@And("maximize browser")
	public void maximizeBrowser() {
		Keyword.maximizeBrowser();
	}
	
	@Then("user click on signin btn")
	public void clickOnSigninbtn() throws InterruptedException {
		Keyword.clickOn("css","button.select-signin");
	}
		@Then("user should enter the email address in field") 
		public void enterToEmailfield() {
		 Keyword.enterText("css","input#join_neu_email_field","leenaguttedar2@gmail.com");
		}
		
		@Then("user should be enter password in that field")
		public void enterPasswordField() throws InterruptedException {
		 Keyword.enterText("css","input#join_neu_password_field","Sanvipg44"); 
		 Thread.sleep(2000);
		}
		@Then("user should clickon signin btn")
		public void clickonSigninBtnForLoginapp() {
		 Keyword.clickOn("css","button[value=sign-in]"); 
		 String ExpectedTitle="Etsy India - Shop for handmade, vintage, custom, and unique gifts for everyone";
		 String actualTitle=Keyword.driver.getTitle(); 
		 Assert.assertEquals(actualTitle,ExpectedTitle);
		}
	
	@And("user should sign out appliction")
	public void verifyThatUserShouldBeSignOut() throws InterruptedException {
		Thread.sleep(3000);
		Keyword.clickOn("css", "button[aria-describedby=ge-tooltip-label-you-menu]");
		Thread.sleep(2000);
		Keyword.clickOn("css","a[href=\"https://www.etsy.com/in-en/logout.php?ref=hdr_user_menu-signout\"]");
		String ExpectedTitle="Etsy India - Shop for handmade, vintage, custom, and unique gifts for everyone";
		 String actualTitle=Keyword.driver.getTitle(); 
		 Assert.assertEquals(actualTitle,ExpectedTitle);
	}
	
	@And("Go to serch function and verify serch functionality")
	public void verifyTheSerchFuctionality() {
		Keyword.enterText("css","input[name='search_query']", "Kids Toys");
		Keyword.clickOn("css","button[value=\"Search\"]");
		String expectedTitle = "Kids toys - Etsy IN";
		String actualTitle = Keyword.driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@And("get all menu text")
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
		 List<String>mainmenues=Keyword.getTexts("css",Locator.mainmenues_list);
		 Assert.assertEquals(menueTexts, mainmenues);
		 System.out.println(mainmenues);
}
	@And("get Furniture submenu")
	public void verifyToGetFurnitureSubmenu() throws InterruptedException {
		Keyword.hoveron("xpath","//span[contains(text(),'Home & Living')]");
		Thread.sleep(3000);
		Keyword.clickOn("css" ,"a#catnav-l3-10970");
		List<String> furnitureMenu = Keyword.getTexts("xpath","//div[@class=\"wt-block-grid__item wt-text-center-xs wt-break-word wt-pl-xs-1 wt-pr-xs-1 wt-mb-xs-3\"]");
		System.out.println(furnitureMenu);
		Assert.assertFalse(furnitureMenu.isEmpty());
	}
}

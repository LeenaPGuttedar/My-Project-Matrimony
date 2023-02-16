package com.testinshastra.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Framework.Keywords.Keyword;

public class FurniturePage {
	@FindBy(xpath = "//span[contains(text(),'Home & Living')]")
	public WebElement HomeAndLiving;
	
	@FindBy (css = "a#catnav-l3-10970")
	public WebElement Furniture;
	
	@FindBy(xpath = "//div[@class=\"wt-block-grid__item wt-text-center-xs wt-break-word wt-pl-xs-1 wt-pr-xs-1 wt-mb-xs-3\"]")
	public List<WebElement> listOfFurnitureMenu; 
	
	/*public  FurniturePage() {
		PageFactory.initElements(Keyword.driver, this);
	}*/

	public void hoverOnHomeAndLiving(){
		Keyword.havorOn(HomeAndLiving);
		}
	
	public void clickOnFurniture() {
		Furniture.click();
	}
	
	public List<String> ListOfFurnitureMenu() {
		
			List<String> menuTexts=new ArrayList<String>();
			for (WebElement menuText: listOfFurnitureMenu) {
				menuTexts.add(menuText.getText());
				
			}
			System.out.println(menuTexts);
			return menuTexts;


	}
}

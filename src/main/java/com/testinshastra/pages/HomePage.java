package com.testinshastra.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Framework.Keywords.Keyword;

public class HomePage {

	@FindBy(xpath = "(//p[contains(text(),'puja decoration')])[2]")
	public WebElement poojafavors;

	@FindBy(xpath = "//div[@aria-label=\"5 out of 5 stars\"]")
	public List<WebElement> all5StarRatingPoojaItemsList;

	

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void clickonPoojafavors() {
		poojafavors.click();
	}

	public List<String> getAll5StarRatingPoojaItemsTitle() {
		List<String> all5StarpoojaItems = new ArrayList<String>();
		for (WebElement poojaItems : all5StarRatingPoojaItemsList) {
			all5StarpoojaItems.add(poojaItems.getText());
		}
		all5StarpoojaItems.size();
		System.out.println(all5StarpoojaItems);
		return all5StarpoojaItems;
	}

	
}

package com.testMatrimony.StepDeffination;

import com.Framework.Keywords.Keyword;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioStepAshtvivah {
	
		
		@Then("User Click On Sign In button")
		public void clikonsigninbutton() throws InterruptedException {
			Keyword.clickOn("css", "a.btn-primary");
			// Keyword.clickOn(LocatorType.CSS,Locator.signin_btn);
		}

		@Then("User have to Send On Email")
		public void sendTextonemailAddress() throws InterruptedException {
			Thread.sleep(2000);
			Keyword.enterText("css","input[name=\"email\"]","jonosawoz@getairmail.com");
		}

		@Then("User have to send Password")
		public void sendTextonPassword() {
			Keyword.enterText("css","input[name=\"password\"]","zxc12345");
		}

	@Then("User have To click on Sign In button")
		public void clickOnSigninButton() throws InterruptedException {
			Thread.sleep(3000);
			Keyword.clickOn("css","button[type=\"submit\"]");
		}

		@When("User click on Profile button")
		public void clickOnProfileButton() {
			Keyword.clickOn("css","a.dropdown-toggle");
		}
		@Then("user select update profile")
		public void selectUpdateProfile() {
			Keyword.clickOn("xpath","//a[contains(text(),'Update profile')]");
		}
}

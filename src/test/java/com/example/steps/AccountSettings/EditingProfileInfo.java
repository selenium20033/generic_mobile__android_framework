package com.example.steps.AccountSettings;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.pages.AccountSettings;
import com.example.pages.HomePage;
import com.example.pages.SignInPage;
import com.example.utils.CommonMethods;
import com.example.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EditingProfileInfo extends CommonMethods {

	SignInPage sign;
	HomePage home;
	AccountSettings act;
	
	@When("I click on account settings icon")
	public void i_click_on_account_settings_icon() throws InterruptedException {
		
	    home=new HomePage();
	    act=new AccountSettings();
	    
	    WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.accountProfileIcon));
		minSync();
		act.accountProfileIcon.click();
		midSync();
	    
	}

	@When("I click on edit my profile link")
	public void i_click_on_edit_my_profile_link() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.myProfileEditBtn));
		minSync();
		act.myProfileEditBtn.click();
		midSync();
		
	}

	@When("I update my profile section")
	public void i_update_my_profile_section() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.myProfileFirstnameTextbox));
		minSync();
		act.myProfileFirstnameTextbox.clear();
		act.myProfileFirstnameTextbox.sendKeys("Mustafa");
		act.myProfileLastnameTextbox.clear();
		act.myProfileLastnameTextbox.sendKeys("Ozkan");
		act.myProfileNicknameTextbox.clear();
		act.myProfileNicknameTextbox.sendKeys("Nickname");
		act.myProfileJobTitleTextbox.clear();
		act.myProfileJobTitleTextbox.sendKeys("Teacher");
        act.myProfileCountryDD.click();
		midSync();
		act.myProfileCountryDDOption.click();
		minSync();
		wait.until(ExpectedConditions.elementToBeClickable(act.myProfileConfirmationButton));
		minSync();
		act.myProfileConfirmationButton.click();
		minSync();
		
	}

	@Then("I confirm the changes")
	public void i_confirm_the_changes() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.myProfileLogo));
		Boolean verify=act.myProfileLogo.isDisplayed();
		Assert.assertTrue(verify);
	}

}
	